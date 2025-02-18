package com.assignments;

import java.util.Arrays;

public class Assignment_9 {

	public static void main(String[] args) {
		// Given values are 12 ,34,11,36,87,98,93.Store the values in Array 
		// and Print second and third largest number from the above
		// values without using collections and default sort methods
				
		int[] array = {12, 34, 11, 36, 87, 98, 93};

		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++) 
			{
				if(array[j]>array[i]) 
				{
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Array list after sorting : " +Arrays.toString(array));
		System.out.println("Second largest element is : " +array[1]);
		System.out.println("Third largest element is  : " +array[2]);
	}

}
