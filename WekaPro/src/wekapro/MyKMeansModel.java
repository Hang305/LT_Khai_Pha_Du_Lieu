/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.classifiers.evaluation.Evaluation;
import weka.clusterers.SimpleKMeans;
import weka.core.EuclideanDistance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author Admin
 */
public class MyKMeansModel extends MyKnowledgeModel {

    SimpleKMeans kMeans;
    Evaluation eval;

    public MyKMeansModel() {
    }

    public MyKMeansModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }

    public void buildKMeansModel(String filename) throws Exception {
        setTrainset(filename);
      //thiet lap mo hinh kmeans
        kMeans = new SimpleKMeans();
        kMeans.setNumClusters(3);
        kMeans.setDistanceFunction(new EuclideanDistance());
        kMeans.buildClusterer(trainset);
        //xuat thong so cua mo hinh ra man hinh
        System.out.println(kMeans);
    }
    public void predictCluster(String filename) throws Exception{
     //doc du lieu can du doan vao bo nho
        ConverterUtils.DataSource ds = new ConverterUtils.DataSource(filename);
        Instances unlabel = ds.getDataSet();
        unlabel.setClassIndex(unlabel.numAttributes() - 1);
        //du doan classLabel cho tung instance
        for (int i = 0; i < unlabel.numInstances(); i++) {
            double predict = kMeans.clusterInstance(unlabel.instance(i));
          System.out.println("Instance "+ i+ " belongs to cluster "+ predict);
        }
    }
    
}
