/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.core.Debug;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author Admin
 */
public class MyKNNModel extends MyKnowledgeModel {

    IBk knn;

    public MyKNNModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }

    public void buildKNN(String filename) throws Exception {
        //doc train set vao bo nho
        setTrainset(filename);
        this.trainset.setClassIndex(this.trainset.numAttributes() - 1);
        //huan luyen mo hinh KNN
        this.knn = new IBk();
        knn.setOptions(this.model_option);
        knn.buildClassifier(this.trainset);
    }

    public void evaluateKNN(String filename) throws Exception {
        //doc test set vào bo nho
        setTestset(filename);
        this.testset.setClassIndex(this.testset.numAttributes() - 1);
        //danh gia mo hinh bang 10-fold cross validation
        Debug.Random rnd = new Debug.Random(1);
        int folds = 10;
        Evaluation eval = new Evaluation(this.trainset);
        eval.crossValidateModel(knn, this.testset, folds, rnd);
        System.out.println(eval.toSummaryString(
                "\nKet qua danh gia mo hinh 10-fold cross validation\n----------\n", false));

    }
      public void predictClassLabel(String fileIn, String fileOut) throws Exception {
        //doc du lieu can du doan vao bo nho
        ConverterUtils.DataSource ds = new ConverterUtils.DataSource(fileIn);
        Instances unlabel = ds.getDataSet();
        unlabel.setClassIndex(unlabel.numAttributes() - 1);
        //du doan classLabel cho tung instance
        for (int i = 0; i < unlabel.numInstances(); i++) {
            double predict = knn.classifyInstance(unlabel.instance(i));
            unlabel.instance(i).setClassValue(predict);

        }
        //xuat ket qua ra màn hinh
        BufferedWriter outWriter = new BufferedWriter(new FileWriter(fileOut));
        outWriter.write(unlabel.toString());
        outWriter.newLine();
        outWriter.flush();
        outWriter.close();
    }

    @Override
    public String toString() {
        return this.knn.toString(); //To change body of generated methods, choose Tools | Templates.
    }
      
}
