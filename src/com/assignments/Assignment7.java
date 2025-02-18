package com.assignments;

import java.util.Map;
import java.util.TreeMap;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, totalTrans, creditCount = 0, debitCount = 0, suspCount = 0;
		float creditedAmount = 0.0f, debitedAmount = 0.0f;
		Map<Integer, Integer> transaction = new TreeMap<Integer, Integer>();
		transaction.put(1,50000);
		transaction.put(2,-2000);
		transaction.put(3,3000);
		transaction.put(4,-15000);
		transaction.put(5,-200);
		transaction.put(6,-300);
		transaction.put(7,4000);
		transaction.put(8,-3000);
		
		
//		for(i = 1; i<=8; i++)
		for(i=1; i<transaction.size(); i++)
		{
			totalTrans = transaction.get(i);
			if(totalTrans>0)
			{
				creditCount+= 1 ;
				creditedAmount+= totalTrans;
				
			}
			else
			{
				debitCount+= 1 ;
				debitedAmount+= totalTrans;
			}
			
			if(totalTrans>=10000 || totalTrans<=-10000)
			{
				suspCount++;
				System.out.println("Suspicious credit/debit Transaction : " +totalTrans);
			}
		}
		
		//1. Print total number of credit and debit transactions completed
		System.out.println("Total number of credit transactions completed is : " +creditCount);
		System.out.println("Total number of debit transactions completed is  : " +debitCount);
		
		//2. Print the total amount credited and debited in account
		System.out.println("Total number of debit transactions completed is  : " +creditedAmount);
		System.out.println("Total number of debit transactions completed is  : " +debitedAmount);
		
		//3. Print total amount remaining at the end in Bank Account
		float balance;
		balance = creditedAmount + debitedAmount;
		System.out.println("Total amount remaining at the end in Bank Account is : " +balance);
		
		//4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
        //   Transaction with Amount” and also print total number of suspicious transactions
		System.out.println("Total number of suspicious transactions : " +suspCount);


	}

}
