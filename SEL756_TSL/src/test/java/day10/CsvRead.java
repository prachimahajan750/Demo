package day10;

import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CsvRead {
  @Test
  public void f() throws Exception {
	  
	CSVReader CR = new CSVReader(new FileReader(".\\Data.csv"));
	List <String[]> allData = CR.readAll();
	//String[] allData = CR.readNext();
	
	for(String rowData[]:allData)
	{			  
/*		System.out.println(rowData[0]);
		System.out.println(rowData[1]);*/
		for(String ColData:rowData)
		{
			System.out.println(ColData);
			System.out.println("Hi");
		}
	}
	
/*	for (int i = 0; i < allData.length; i++) {
		System.out.println(allData[i]);
	}*/
  }
}
