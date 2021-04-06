/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

//import weka.classifiers.trees.J48;
/**
 *
 * @author Admin
 */
public class WekaPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        MyKnowledgeModel model = new MyKnowledgeModel("E:\\KPDL\\BaiTap\\DuLieu\\supermarket.arff");
//        System.out.println(model);
//        model.saveData("E:\\\\KPDL\\\\BaiTap\\\\DuLieu\\\\supermarket01.arff");
//        
//        model.saveData2CSV("E:\\\\KPDL\\\\BaiTap\\\\DuLieu\\\\supermarket01.csv");

//        MyAprioriModel model = new MyAprioriModel("E:\\KPDL\\BaiTap\\DuLieu\\weather.numberic.arff",
//                "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
//                "-R 2-3");
//        model.mineAssociationRules();
//GPGrowth
//        MyFPGrowthModel model = new MyFPGrowthModel("E:\\\\KPDL\\\\BaiTap\\\\DuLieu\\\\weather.nominal.arff",
//                "-P 2 -I -1 -N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1", 
//                "-R first-last");
//        model.mineAssociationRules();
//        System.out.println(model);
//        MyKnowledgeModel model = new MyKnowledgeModel("E:\\KPDL\\Weka\\Weka-3-8-5\\data\\iris.arff", null, null);
//        model.trainset = model.divideTrainTest(model.dataset, 20, false);
//        model.testset = model.divideTrainTest(model.dataset, 20, true);
//        System.out.println(model);
//        System.out.println(model.trainset.toSummaryString());
//        System.out.println(model.testset.toSummaryString());
//     MyKnowledgeModel model = new MyKnowledgeModel("E:\\KPDL\\Weka\\Weka-3-8-5\\data\\iris.arff", null, null);
//        model.trainset = model.divideTrainTestR(model.dataset, 80, false);
//        model.testset = model.divideTrainTestR(model.dataset, 80, true);
//        System.out.println(model);
//        System.out.println(model.trainset.toSummaryString());
//        System.out.println(model.testset.toSummaryString());}
//Mô hình cây quyết định
//        MyDecisionTreeModel model = new MyDecisionTreeModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data\\iris.arff", "-C 0.25 -M 2", null);
//        model.builDecisionTree();
//        model.evaluateDecisionTree();
//        System.out.println(model);
////        model.saveModel("E:\\KPDL\\BaiTap\\DuLieu\\decisiontree.model", model.tree);
//        model.tree = (J48)model.loadModel("E:\\KPDL\\BaiTap\\DuLieu\\decisiontree.model");
//        model.predictClassLabel(model.testset);
//NaiveBayes
//        MyNaiveBayesModel model = new MyNaiveBayesModel();
//        model.buildNaiveBayes("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_train.arff");
//        model.evaluateNaiveBayes("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_predict_nb.arff");
//        
//        System.out.println(model);
//Neural Network
//        
//        MyNeuralNetworkModel model = new MyNeuralNetworkModel("",
//                "-L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a -R",
//                null);
//         model.buildNeuralNetwork("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_train.arff");
//        model.evaluateNeuralNetwork("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_predict_ann.arff");
//
//        System.out.println(model);
//SVM
//        MySVMModel model = new MySVMModel("",
//                "-C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K \"weka.classifiers.functions.supportVector.PolyKernel -E 1.0 -C 250007\" -calibrator \"weka.classifiers.functions.Logistic -R 1.0E-8 -M -1 -num-decimal-places 4\"",
//                null);
//        model.buildSVM("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_train.arff");
//        model.evaluateSVM("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_predict_svm.arff");
//
//        System.out.println(model);
//Mô hình K-NN - k lân cận
//        MyKNNModel model = new MyKNNModel("",
//                "-K 5 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\"",
//                null);
//        model.buildKNN("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_train.arff");
//        model.evaluateKNN("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_predict_svm.arff");
//
//        System.out.println(model);
//bagging
//        MyBaggingModel model = new MyBaggingModel("",
//                null,
//                null);
//        model.buildBaggingModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_train.arff");
//        model.evaluateBaggingModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_predict_bag.arff");
//
//        System.out.println("Finished");
//Boosting
//        MyBoostingModel model = new MyBoostingModel("",
//                null,
//                null);
//        model.buildBoostingModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_train.arff");
//        model.evaluateBoostingModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_predict_bag.arff");
//
//        System.out.println("Finished");
//voting
//        MyVotingModel model = new MyVotingModel("",
//                null,
//                null);
//        model.buildVotingModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_train.arff");
//        model.evaluateVotingModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_predict_vote.arff");
//
//        System.out.println("Finished");
//blending
//        MyBlendingModel model = new MyBlendingModel();
//        model.buildBlendingModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_train.arff");
//        model.evaluateBlendingModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_test.arff");
//        model.predictClassLabel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_unlabel.arff",
//                "C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_predict_blending.arff");
//
//        System.out.println("Finished");
//kmeans
//        MyKMeansModel model = new MyKMeansModel("", null, null);
//        model.buildKMeansModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_cluster_train.arff");
//        model.predictCluster("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_cluster_unable.arff");
//        System.out.println("Finished");

//EM
        MyEMModel model = new MyEMModel("", null, null);
        model.buildEMModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_cluster_train.arff");
        model.predictCluster("C:\\Users\\Admin\\OneDrive\\Máy tính\\data-exp\\iris_cluster_unable.arff");
        System.out.println("Finished");
    }
}
