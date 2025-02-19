package com.assignments;

public class Assignment_16 {

	public static void main(String[] args) {
		int row = 5;
		
		for(int i=1; i<=row; i++) {
			for(int j=row; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
