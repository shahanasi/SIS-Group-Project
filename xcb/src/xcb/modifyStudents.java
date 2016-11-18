package xcb;

import java.io.FileNotFoundException;
import java.util.*;

public class modifyStudents
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
		
		public static void changeGrade()
		{
			Scanner userInput = new Scanner(System.in);
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Please type the ID number of the student whose grade you would like to change!");
			int student = userInput.nextInt();
			System.out.println("What grade would you like to change?");
			System.out.println("1) " + MakeStudentObjects.gradebook.get(student-1).getFirstClass());
			System.out.println("2) " + MakeStudentObjects.gradebook.get(student-1).getSecondClass());
			System.out.println("3) " + MakeStudentObjects.gradebook.get(student-1).getThirdClass());
			int studentClass = userInput.nextInt();
					
			if (studentClass == 1)
				{
					System.out.println("You would like to change " + MakeStudentObjects.gradebook.get(student-1).getFirstName() + " \'s " + MakeStudentObjects.gradebook.get(student-1).getFirstClass() + " grade from a " + MakeStudentObjects.gradebook.get(student-1).getFirstGrade() + " to a what?");
					String newGrade = userInput2.nextLine();
					MakeStudentObjects.gradebook.get(student - 1).setFirstGrade(newGrade);
				}
			else if (studentClass == 2)
				{
					System.out.println("You would like to change " + MakeStudentObjects.gradebook.get(student-1).getFirstName() + " \'s " + MakeStudentObjects.gradebook.get(student-1).getSecondClass() + " grade from a " + MakeStudentObjects.gradebook.get(student-1).getSecondGrade() + " to a what?");
					String newGrade = userInput2.nextLine();
					MakeStudentObjects.gradebook.get(student - 1).setSecondGrade(newGrade);
				}
			else if (studentClass == 3)
				{
					System.out.println("You would like to change " + MakeStudentObjects.gradebook.get(student-1).getFirstName() + " \'s " + MakeStudentObjects.gradebook.get(student-1).getThirdClass() + " grade from a " + MakeStudentObjects.gradebook.get(student-1).getThirdGrade() + " to a what?");
					String newGrade = userInput2.nextLine();
					MakeStudentObjects.gradebook.get(student - 1).setThirdGrade(newGrade);
				}
		}
		
		public static void switchClass()
		{
			Scanner userInput = new Scanner(System.in);
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Please type the ID number of the student whose classes you would like to switch.");
			int student = userInput.nextInt();
			System.out.println("What grade would you like to change?");
		}
		

	}
