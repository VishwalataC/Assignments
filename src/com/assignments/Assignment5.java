package com.assignments;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println("Second Polluted Countrie is : " +polutedContries.get(1));
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		
		//3. Create a map of the 5 largest cities in the United States and their populations.
		
		//4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		int[] number = {13, 30, 28, 44, 81, 18, 53, 16, 73, 71};
		int sum = number[2] + number[4];
		System.out.println("Sum of 3rd and 5th element i.e. " +number[2]+ " and " +number[4]+  " is " +sum);
				
		//5. Create a list of the top 5 highest-grossing movies of all time 
		//   and print out the third movie on the list.
		List<String> highestGrossMovie = new ArrayList<String>();
		highestGrossMovie.add("Dangal");
		highestGrossMovie.add("Bahubali");
		highestGrossMovie.add("Pushpa");
		highestGrossMovie.add(3, "RRR");
		highestGrossMovie.add("K.G.F");
		System.out.println("Third highest grossing Movie is : " +highestGrossMovie.get(2));
		

	}

}
