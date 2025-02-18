package com.assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {
		
		String[] empName = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		
		//Employee Details : Base Salary, Experience, Rating
		Double[] emp1Data = {75000.0, 5.0, 4.2};
		Double[] emp2Data = {68000.0, 3.0, 3.8};
		Double[] emp3Data = {82000.0, 7.0, 4.5};
		Double[] emp4Data = {90000.0, 10.0, 2.0};
		Double[] emp5Data = {60000.0, 2.0, 3.5};

		//Employee Details
		Map<String, Double[]> empData = new HashMap<>();
		empData.put(empName[0], emp1Data);
		empData.put(empName[1], emp2Data);
		empData.put(empName[2], emp3Data);
		empData.put(empName[3], emp4Data);
		empData.put(empName[4], emp5Data);
		
		
		
		Map<String, Double> hikeMap = new HashMap<>();
//
//		Map<String,String> emp5 = new LinkedHashMap<String,String>();
//		emp5.put("Name", "Eva Green");
//		emp5.put("Base Salary", "60000");
//		emp5.put("Experience", "2");
//		emp5.put("Year-End Rating", "3.5");	
//
//		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
//		data.add(emp1);
//		data.add(emp2);
//		data.add(emp3);
//		data.add(emp4);
//		data.add(emp5);
//		
//		System.out.println(data);
		
//		if(hike>=4)
//		{
//			float variablePay = (15/100)baseSalery;
//			int bonus = 1500;
//		}
	}

}
