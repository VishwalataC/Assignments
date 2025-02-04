package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> emp1 = new HashMap<String, String>();
		emp1.put("Employee ID", "E001");
		emp1.put("Name", "Alice Green");
		emp1.put("Age", "30");
		emp1.put("Gender", "Female");
		emp1.put("Department", "Engineering");
		emp1.put("Position", "Software Engineer");
		emp1.put("Salary", "75,000");
		emp1.put("Email", "alice@example.com");
		emp1.put("Contact Number", "9876543213");
		
		Map<String,String> emp2 = new HashMap<String, String>();
		emp2.put("Employee ID", "E002");
		emp2.put("Name", "Bob Johnson");
		emp2.put("Age", "35");
		emp2.put("Gender", "Male");
		emp2.put("Department", "Marketing");
		emp2.put("Position", "Marketing Managerr");
		emp2.put("Salary", "85,000");
		emp2.put("Email", "bob@example.com");
		emp2.put("Contact Number", "9876543214");
		
		Map<String,String> emp3 = new HashMap<String, String>();
		emp3.put("Employee ID", "E003");
		emp3.put("Name", "Carol White");
		emp3.put("Age", "28");
		emp3.put("Gender", "Female");
		emp3.put("Department", "Sales");
		emp3.put("Position", "Sales Executive");
		emp3.put("Salary", "65,000");
		emp3.put("Email", "carol@example.com");
		emp3.put("Contact Number", "9876543215");
		
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		data.add(emp1);
		data.add(emp2);
		data.add(emp3);
		
		System.out.println(data.get(1).get("Email"));
		
	}

}
