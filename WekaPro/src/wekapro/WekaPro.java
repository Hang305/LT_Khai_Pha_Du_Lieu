/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

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
 MyAprioriModel model = new MyAprioriModel("E:\\KPDL\\BaiTap\\DuLieu\\weather.numberic.arff", 
         "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1", 
         "-R 2-3");
 model.mineAssociationRules();
        System.out.println(model);
    }
    
}