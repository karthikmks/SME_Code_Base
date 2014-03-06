package com.bfp.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.commons.dbcp.BasicDataSource;

import com.bear.gcs.bpm.of.activities.db.spring.sprunner.spexecutor.DDDAStoredProcedure;
import com.bear.gcs.bpm.of.activities.db.spring.sqlrunner.sqlexecutor.SQLDAO;
import com.bear.gcs.bpm.of.utility.XMLParser;
import com.bfp.valueobjects.DepositLoanAccountHoldersVO;
import com.bfp.valueobjects.JewelCategoryVO;
import com.bfp.valueobjects.JewelLoanTransactionVO;
import com.bfp.valueobjects.JewelMasterVO;
import com.bfp.valueobjects.JewelQualityVO;
import com.bfp.valueobjects.JewelTypesVO;
import com.bfp.valueobjects.UserProfileVO;

public class TestDataLoader {


	public static void main(String[] args) {
		try {
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setUrl("jdbc:mysql://172.25.100.20:3306/loan_management");
			dataSource.setUsername("root");
			dataSource.setPassword("admin");
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			SQLDAO dao = new SQLDAO();
			dao.setDataSource(dataSource);
			/*List<UserProfileVO> inputDataList = new ArrayList<UserProfileVO>();
			UserProfileVO profile = new UserProfileVO();
			profile.setUserId("3");
			inputDataList.add(profile);
			inputDataList = dao.executeSelect(XMLParser.parseXML("getUserDetails"), inputDataList, null, dataSource);
			System.out.println(inputDataList.get(0).getUserName() + " : " + inputDataList.get(0).getRole());

			List<JewelCategoryVO> temp1 = new ArrayList<JewelCategoryVO>();
			List<JewelCategoryVO> categoryList = dao.executeSelect(XMLParser.parseXML("getJewelCategory"), temp1, null, dataSource);
			System.out.println(categoryList);
			System.out.println(categoryList.size());

			List<JewelQualityVO> temp2 = new ArrayList<JewelQualityVO>();
			List<JewelQualityVO> qualityList = dao.executeSelect(XMLParser.parseXML("getJewelQualities"), temp2, null, dataSource);
			System.out.println(qualityList);


			JewelMasterVO jewelMaster = new JewelMasterVO();
			Map<String, List<JewelTypesVO>> tempMap = new LinkedHashMap<String, List<JewelTypesVO>>();
			if(categoryList != null && qualityList != null) {
				for(JewelCategoryVO category : categoryList) {
					if(category != null) {
						List<JewelTypesVO> jewelTypes = null;
						if(!tempMap.containsKey(category.getJewelCategoryId())) {
							jewelTypes = new ArrayList<JewelTypesVO>();
							JewelTypesVO jewelType = new JewelTypesVO(category.getJewelTypeId(), category.getJewelTypeName());
							jewelTypes.add(jewelType);
							tempMap.put(category.getJewelCategoryId(), jewelTypes);
						} else {
							jewelTypes = tempMap.get(category.getJewelCategoryId());
							JewelTypesVO jewelType = new JewelTypesVO(category.getJewelTypeId(), category.getJewelTypeName());
							jewelTypes.add(jewelType);
						}
					}
				}
				List<JewelCategoryVO> jewelCatoryList = new ArrayList<JewelCategoryVO>();
				if(!tempMap.isEmpty()) {
					Set entrySet = tempMap.entrySet();
					Iterator iterator = entrySet.iterator();
					while(iterator.hasNext()) {
						Entry entry = (Entry) iterator.next();
						JewelCategoryVO temp = new JewelCategoryVO();
						temp.setJewelCategoryId((String)entry.getKey());
						JewelCategoryVO category = categoryList.get(categoryList.indexOf(temp));
						category.setJewelCategoryTypes((List<JewelTypesVO>)entry.getValue());
						jewelCatoryList.add(category);
					}
				}
				System.out.println(jewelCatoryList);
				System.out.println(jewelCatoryList.size());
			}

			jewelMaster.setJewelCategory(categoryList);
			jewelMaster.setJewelTypes(qualityList);
			 */			
			for(int i =0;i<5;i++) {
				DDDAStoredProcedure storeProcedure = new DDDAStoredProcedure(dataSource);
				JewelLoanTransactionVO obj = new JewelLoanTransactionVO();
				obj.setJewelLoanNo(2);
				//obj.setJewelLoanType("Y");
				Map inputDet = new HashMap();
				inputDet.put(obj.getClass().getSimpleName(), obj);
				List list = storeProcedure.executeStoredProc(inputDet, "add_loan", XMLParser.parseXML("testSP"), null);
				Map map = (Map) list.get(1);
				System.out.println(map);
				System.out.println(map.get("loanNo"));
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}