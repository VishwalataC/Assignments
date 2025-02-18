package com.assignments;

import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) {
		
		// Given a number n, determine whether it is a prime number or not. 
		// A prime number is a number greater than 1 that has no positive divisors other than 1 and itself .
		
        //taking input from user
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = obj.nextInt();
		
		int count = 0;
		
		for(int i = 1; i<=number; i++) {
			if(number%i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println(number+ " is a prime number");
		}else {
			System.out.println(number+ " is not a prime number");
		}
			
	}

}
