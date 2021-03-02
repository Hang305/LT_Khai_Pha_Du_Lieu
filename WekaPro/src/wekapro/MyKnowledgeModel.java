/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.io.File;
import java.io.IOException;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVSaver;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.NominalToBinary;
import weka.filters.unsupervised.attribute.NumericToNominal;
import weka.filters.unsupervised.attribute.Remove;

/**
 *
 * @author Admin
 */
public class MyKnowledgeModel {

    DataSource source;
    Instances dataset;
    String[] model_option;
    String[] data_option;

    public MyKnowledgeModel() {
    }

    public MyKnowledgeModel(String filename, String m_opts, String d_opts) throws Exception {
        this.source = new DataSource(filename);
        this.dataset = source.getDataSet();
        this.model_option = weka.core.Utils.splitOptions(m_opts);
        this.data_option = weka.core.Utils.splitOptions(d_opts);

    }

    MyKnowledgeModel(String ekpdlBaiTapDuLieusupermarketarff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Instances removeData(Instances originalData) throws Exception {
        Remove remove = new Remove();
        remove.setOptions(data_option);
        remove.setInputFormat(originalData);
        return Filter.useFilter(originalData, remove);
    }
public Instances convertData(Instances originalData) throws Exception{
    NumericToNominal n2n = new NumericToNominal();
    n2n.setOptions(data_option);
    n2n.setInputFormat(originalData);
    return Filter.useFilter(originalData, n2n);
}
    public void saveData(String filename) throws IOException {
        ArffSaver outData = new ArffSaver();
        outData.setInstances(this.dataset);
        outData.setFile(new File(filename));
        outData.writeBatch();
        System.out.print("Finished");
    }

    public void saveData2CSV(String filename) throws IOException {
        CSVSaver outData = new CSVSaver();
        outData.setFile(new File(filename));
        outData.setInstances(this.dataset);
        outData.writeBatch();
        System.out.println("Converted");
    }
public Instances convert2Binary(Instances originalData) throws Exception{
    NominalToBinary n2b = new NominalToBinary();
    n2b.setOptions(this.data_option);
    n2b.setBinaryAttributesNominal(true);
    n2b.setInputFormat(originalData);
    return  Filter.useFilter(originalData, n2b);
}
    @Override
    public String toString() {
        return dataset.toSummaryString();
    }

}
