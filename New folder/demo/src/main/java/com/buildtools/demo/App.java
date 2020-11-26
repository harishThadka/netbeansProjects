package com.buildtools.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws FileNotFoundException, IOException    {
        //Create POI file system object.
        POIFSFileSystem objPOIFileSystem = new POIFSFileSystem(new FileInputStream("SampleExcel.xls"));

        //Create a data extractor using file system object.
        ExcelExtractor datExtractor = new ExcelExtractor(objPOIFileSystem);

        //Extract data using extractor and print
        System.out.println(datExtractor.getText());

    }
}
