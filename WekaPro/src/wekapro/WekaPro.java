/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.classifiers.trees.J48;

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
        MyDecisionTreeModel model = new MyDecisionTreeModel("C:\\Users\\Admin\\OneDrive\\Máy tính\\data\\iris.arff", "-C 0.25 -M 2", null);
        model.builDecisionTree();
        model.evaluateDecisionTree();
        System.out.println(model);
//        model.saveModel("E:\\KPDL\\BaiTap\\DuLieu\\decisiontree.model", model.tree);
        model.tree = (J48)model.loadModel("E:\\KPDL\\BaiTap\\DuLieu\\decisiontree.model");
        model.predictClassLabel(model.testset);
    }
}
