package com.assignments;

//Problem: Multi-Dimensional Array Practice
//1.Create a 3D array to represent the following data:
//  Semesters as the first dimension.
//  Subjects and Marks as the second dimension.
//  Actual values for Subject Names and Marks as the third dimension.
//2.From the array:
//  Print Semester 3 - Subject 4 and Subject 5 Names.
//  Print Semester 5 - Subject 3 and Subject 6 marks

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result[][][] = {
				{   //semester 1 :
					{"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng"},
					{"78", "85", "91", "74", "88", "79"}
				},
				{   //semester 2 :
					{"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
					{"82", "77", "93", "69", "84", "90"}
				},
                {   // Semester 3
                    {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
                    {"88", "81", "76", "92", "85", "78"}
                },
                {   // Semester 4
                    {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
                    {"91", "73", "89", "80", "76", "87"}
                },
                {   // Semester 5
                    {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
                    {"86", "88", "84", "95", "73", "90"}
                }
				
		};
		//Print Semester 3 - Subject 4 and Subject 5 Names
		 System.out.println("Semester 3, Subject 4 & 5 names are : " +result[2][0][3]+ " & " +result[2][0][4]);
		 
		//Print Semester 5 - Subject 3 and Subject 6 marks
		 System.out.println("Semester 5, Subject 3 & 6 marks are : " +result[4][1][2]+ " & " +result[4][1][5]);
	
		
	}

}
