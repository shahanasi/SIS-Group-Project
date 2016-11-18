package xcb;

import java.io.FileNotFoundException;
import java.util.*;

public class addOrDeleteStudents
	{

		public static void main(String[] args)
			{
				// Call these methods in our final runner class!

			}
		
		public static void addStudent() throws FileNotFoundException
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please type the information for the new student!");
			String firstName = userInput.nextLine();
			String lastName = userInput.nextLine();
			String firstClass = userInput.nextLine();
			String firstGrade = userInput.nextLine();
			String secondClass = userInput.nextLine();
			String secondGrade = userInput.nextLine();
			String thirdClass = userInput.nextLine();
			String thirdGrade = userInput.nextLine();
			double totalGPA = 0.0;
  			totalGPA = totalGPA + MakeStudentObjects.getGPA(firstGrade);
  			totalGPA = totalGPA + MakeStudentObjects.getGPA(secondGrade);
  			totalGPA = totalGPA + MakeStudentObjects.getGPA(thirdGrade);
  			totalGPA = totalGPA / 3;
  			MakeStudentObjects.gradebook.add(new Student(firstName,lastName,firstClass,firstGrade,secondClass,secondGrade,thirdClass,thirdGrade, totalGPA));
			
		}
		
		public static void deleteStudent() 
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please type the ID number of the student you would like to delete!");
			int deletedStudent = userInput.nextInt();
			MakeStudentObjects.gradebook.remove(deletedStudent - 1);
		}
		

	}
