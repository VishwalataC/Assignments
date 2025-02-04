package com.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create a list of the top 5 most populated countries in the world 
		//   and print 2nd Country
		List<String> polutedContries = new ArrayList<String>();
		polutedContries.add("Bangladesh");
		polutedContries.add("Pakistan");
		polutedContries.add("India");
		polutedContries.add("Bahrain");
		polutedContries.add("Nepal");
		System.out.println("1. Second Polluted Countrie is : " +polutedContries.get(1)+ "\n");
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		Set<String> touristVisit = new HashSet<String>();
		touristVisit.add("Eiffel Tower");
		touristVisit.add("New York");
		touristVisit.add("Acropolis of Athens");
		touristVisit.add("London");
		touristVisit.add("Dubai");
		touristVisit.add("Great Wall of China");
		touristVisit.add("Taj Mahal");
		touristVisit.add("Bangkok");
		touristVisit.add("Paris");
		touristVisit.add("Singapore");
		
		int size = touristVisit.size();
		System.out.println("2. Size of most visited tourist attractions in the world is : " + size + "\n");
		
		
		//3. Create a map of the 5 largest cities in the United States and their populations.
		Map<String, Integer> largestCities = new LinkedHashMap<String, Integer>();
		largestCities.put("New York City", 8804190);
		largestCities.put("Los Angeles", 3898747);
		largestCities.put("Chicago", 2746388);
		largestCities.put("Houston", 2304580);
		largestCities.put("Phoenix", 1608139);
		
		System.out.println("3. 5 largest cities in the United States and their populations are : " );
		System.out.println(largestCities+ "\n");
		
		//4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
		int[] number = {13, 30, 28, 44, 81, 18, 53, 16, 73, 71};
		int sum = number[2] + number[4];
		
		System.out.println("4. Sum of 3rd and 5th element i.e. " +number[2]+ " and " +number[4]+  " is " +sum+ "\n");
				
		
		//5. Create a list of the top 5 highest-grossing movies of all time 
		//   and print out the third movie on the list.
		
		List<String> highestGrossMovie = new LinkedList<String>();
		
		highestGrossMovie.add("Dangal");
		highestGrossMovie.add("Bahubali");
		highestGrossMovie.add("Pushpa");
		highestGrossMovie.add(3, "RRR");
		highestGrossMovie.add("K.G.F");
		
		System.out.println("5. Third highest grossing Movie is : " +highestGrossMovie.get(2));
		

	}

}
