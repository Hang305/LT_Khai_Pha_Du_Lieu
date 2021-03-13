/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import sun.reflect.generics.tree.Tree;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Debug.Random;
import weka.core.Instances;

/**
 *
 * @author Admin
 */
public class MyDecisionTreeModel extends MyKnowledgeModel {
    
    J48 tree;
    
    public MyDecisionTreeModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }
    
    public void builDecisionTree() throws Exception {
        //tạo tập dữ liệu train set
        this.trainset = divideTrainTest(this.dataset, 80, false);
        this.testset = divideTrainTest(this.dataset, 80, true);
        this.trainset.setClassIndex(this.trainset.numAttributes() - 1);
        this.testset.setClassIndex(this.testset.numAttributes() - 1);
        //Thiết lập thông số cho mô hình cây quyết định
        tree = new J48();
        tree.setOptions(this.model_option);

        //huấn luyện mô hình với tập dữ liệu train
        tree.buildClassifier(this.trainset);
    }
    
    public void evaluateDecisionTree() throws Exception {
        Random rnd = new Random(1);
        int folds = 10;
        
        Evaluation eval = new Evaluation(this.trainset);
//        eval.evaluateModel(tree, this.testset);
//        System.out.println(eval.toSummaryString("\n Ket qua danh gia mo hinh \n-------\n", false));

        eval.crossValidateModel(tree, this.testset, folds, rnd);
        System.out.println(eval.toSummaryString("\n Ket qua danh gia mo hinh 10-folds cross-validation\n-------\n", false));
    }
    
    public void predictClassLabel(Instances input) throws Exception {
        for (int i = 0; i < input.numInstances(); i++) {
            double predict = tree.classifyInstance(input.instance(i));
            double actual = input.instance(i).classValue();
            System.out.println("Instances " + i + 
                    "; predict = " + input.classAttribute().value((int) predict)
                    + "; actual = " + input.classAttribute().value((int) actual));
        //input.instance(i).setClassValue(predict);
        }
    }
    
    @Override
    public String toString() {
        return tree.toSummaryString();//To change body of generated methods, choose Tools | Templates.
    }
    
}
