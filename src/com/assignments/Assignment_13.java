package com.assignments;

public class Assignment_13 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			int count=1;
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.printf("%d ", count);
				count++;
			}
			System.out.println();
		}
		
		for(int i=1; i<=4; i++) {
			int count=1;
			for(int j=i+1; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++) {
				System.out.printf("%d ", count);
				count++;
			}
			System.out.println();
		}
	}
}
