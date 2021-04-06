/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.meta.Bagging;
import weka.core.Debug;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;
import wekapro.MyKnowledgeModel;

/**
 *
 * @author Admin
 */
public class MyBaggingModel extends  MyKnowledgeModel{

    Evaluation eval;
    NaiveBayes bayes;
    Bagging bag;

    public MyBaggingModel() {
    }
    
    
    public MyBaggingModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }
 //các phuong thuc 
    public void buildBaggingModel(String filename) throws Exception{
        setTrainset(filename);
        this.trainset.setClassIndex(this.trainset.numAttributes() - 1);
        //huan luyen mo hinh KNN
        //tao lap classifier co ban
        bayes = new NaiveBayes();
        //thiet lap mo hinh bagging
        bag= new Bagging();
        bag.setClassifier(bayes);
        bag.setNumIterations(10);
      bag.buildClassifier(trainset);
    }
     public void evaluateBaggingModel(String filename) throws Exception {
        //doc test set vào bo nho
        setTestset(filename);
        this.testset.setClassIndex(this.testset.numAttributes() - 1);
        //danh gia mo hinh bang 10-fold cross validation
        Debug.Random rnd = new Debug.Random(1);
        int folds = 10;
        eval = new Evaluation(this.trainset);
        eval.crossValidateModel(bag, testset, folds, rnd);
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
            double predict = bag.classifyInstance(unlabel.instance(i));
            unlabel.instance(i).setClassValue(predict);

        }
        //xuat ket qua ra màn hinh
        BufferedWriter outWriter = new BufferedWriter(new FileWriter(fileOut));
        outWriter.write(unlabel.toString());
        outWriter.newLine();
        outWriter.flush();
        outWriter.close();
    }
    
}
