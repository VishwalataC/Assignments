package com.assignments;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int creditScore = 720;
		float income = 55000.0f, debtToIncomeRatio = 35.0f;
		boolean isEmployed = true;
		
		if(creditScore>750)
		{
			System.out.println("Loan is automatically approved.");
		}
		
		else if(creditScore>=650 || creditScore<=750)
		{
			System.out.println("Additional checks are performed.");
			if(income >= 50000)
			{
				System.out.println("Loan to be considered.");
				if(isEmployed == true && debtToIncomeRatio<40)
				{
					System.out.println("Loan is approved.");
				}
				else if(isEmployed == false || debtToIncomeRatio>=40)
				{
					System.out.println("Loan is denied.");	
				}
				
			}
			else
			{
				System.out.println("Loan will not be considered.");
			}
		}
		
		else if(creditScore<650)
		{
			System.out.println("Loan is denied.");			
		}

	}

}
