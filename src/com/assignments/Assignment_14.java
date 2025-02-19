package com.assignments;

public class Assignment_14 {

	public static void main(String[] args) {
		
		String str = "Java programming is fun and challenging";
		System.out.println("Original string is : " +str);
		
        // 1. Count the total number of words in the sentence
		
		//split the string after space
		String[] words = str.split(" "); 
		
		int count = 0;
		for(int i=0; i<words.length; i++) {
				count++;
			}
	    System.out.println("Total number of words in string is : " +count);
		
       // 2.Print the sentence words in reverse order.
	    
	 	String reverse = " ";
	 	
		for(int i=words.length-1; i>=0; i--) {
			reverse+= words[i] + " ";
		}
		System.out.println("Reverse string is :" +reverse);
		
		// 3.Convert the first character of each word to uppercase and print original sentence
		
	}


}
