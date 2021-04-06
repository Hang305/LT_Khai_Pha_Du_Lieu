/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.clusterers.EM;
import weka.clusterers.SimpleKMeans;
import weka.core.EuclideanDistance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author Admin
 */
public class MyEMModel extends MyKnowledgeModel{
    EM em;

    public MyEMModel() {
    }

    public MyEMModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }
     public void buildEMModel(String filename) throws Exception {
        setTrainset(filename);
      //thiet lap mo hinh kmeans
        em = new EM();
        em.buildClusterer(trainset);
        
        //xuat thong so cua mo hinh ra man hinh
        System.out.println(em);
    }
    public void predictCluster(String filename) throws Exception{
     //doc du lieu can du doan vao bo nho
        ConverterUtils.DataSource ds = new ConverterUtils.DataSource(filename);
        Instances unlabel = ds.getDataSet();
        unlabel.setClassIndex(unlabel.numAttributes() - 1);
        //du doan classLabel cho tung instance
        for (int i = 0; i < unlabel.numInstances(); i++) {
            double predict = em.clusterInstance(unlabel.instance(i));
          System.out.println("Instance "+ i+ " belongs to cluster "+ predict);
        }
    }
}
