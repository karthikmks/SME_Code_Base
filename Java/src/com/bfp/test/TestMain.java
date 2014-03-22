package com.bfp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.jxls.reader.ReaderBuilder;
import net.sf.jxls.reader.XLSReadStatus;
import net.sf.jxls.reader.XLSReader;

import com.bfp.valueobjects.DayBookVO;
import com.bfp.valueobjects.PaymentsNReceivedVO;

public class TestMain {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			InputStream inputXML = new FileInputStream(new File("C:\\Karthik\\SME\\DAY_BOOK_MAPPING.xml"));
	        XLSReader mainReader = ReaderBuilder.buildFromXML( inputXML );
	        InputStream inputXLS = new FileInputStream(new File("C:\\Users\\User1\\Downloads\\sample_copy.xls"));
	       
	        DayBookVO dayBook = new DayBookVO();
			Map beans = new HashMap();
	        beans.put("dayBook", dayBook);        
	        
	        XLSReadStatus readStatus = mainReader.read(inputXLS, beans);
	        
	        for(PaymentsNReceivedVO payments : dayBook.getPaymentsList()){
	        	System.out.println(payments);
	        }
	        
	        for(PaymentsNReceivedVO received : dayBook.getReceivedList()){
	        	System.out.println(received);
	        }
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
