package com.assignments;

public class Assignment_15 {

	public static void main(String[] args) {
		String str = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

        // 1. Divide into multiple words
		String[] words = str.split(" ");

		int count = 0;
		for(int i=0; i<words.length; i++) {
			if(words[i].equals("Java")) {
				
				// 3. Print count and Indexes of the word
				System.out.println("Index of " +count+  "th 'Java' word is : " +i);
				++count;
			}
		}
		
		// 2. Find total number of occurrences
		System.out.println("Total number of 'Java' in string is : " +count);
	}

}
