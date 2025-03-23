package assignments;

public class Assignment2_Arrays {
	

	
	/*
	 1. Create a 3D array to represent the following data:
	 *  Semesters as the first dimension.
	 *  Subjects and Marks as the second dimension. 
	 *  Actual values for Subject Names and Marks as the third dimension.
	  2. From the array:
         Print Semester 3 - Subject 4 and Subject 5 Names. 
         Print Semester 5 - Subject 3 and Subject 6 marks
	 */
		
		

	public static void main(String[] args) {

		String[][][] studentMarks = { { { "Semister1", "Semister2", "Semister3", "Semister4", "Semister5" } },

				{ { "Subject1", "Subject2", "Subject3", "Subject4", "Subject5", "Subject6" } },

				{ { "Mathematics1", "Physics", "Chemistry", "Computer programming", "Engineering Drawing",
						"Basic Electrical eng" }, { "78", "85", "91", "74", "88", "79" },

						{ "Mathematics2", "Mechanics", "Environmental Science", "Basic Electronics",
								"Engineering Physics", "Engineering Graphics" },
						{ "82", "77", "93", "69", "84", "90" },

						{ "Data Structures", "DiscreteMathematics", "Digital Electronics", "Operating Systems",
								"Signals and Systems", "Object-Oriented Prog." },
						{ "88", "81", "76", "92", "85", "78" },

						{ "Algorithms", "ComputerNetworks", "Database Systems", "Microprocessors", "Communication Eng.",
								"Software Engineering" },
						{ "91", "73", "89", "80", "76", "87" },

						{ "Probability&Stats", "MachineLearning", "Compiler Design", "Theory of Computation",
								"Embedded Systems", "Computer Graphics" },
						{ "86", "88", "84", "95", "73", "90" }

				} };

		System.out.println("1. " +studentMarks[0][0][2] + ": " + studentMarks[1][0][3] + ": " + studentMarks[2][4][3] );
		System.out.println("2. " +studentMarks[0][0][2] + ": " + studentMarks[1][0][4] + ": " + studentMarks[2][4][4] );
		System.out.println("3. " +studentMarks[0][0][4] + ": " + studentMarks[1][0][2] + ": " + studentMarks[2][8][2]+ ": " + studentMarks[2][9][2] );
		System.out.println("4. " +studentMarks[0][0][4] + ": " + studentMarks[1][0][2] + ": " + studentMarks[2][8][5]+ ": " + studentMarks[2][9][5] );
		
	}

}
