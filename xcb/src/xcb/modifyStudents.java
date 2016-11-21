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
			System.out.println("Print the first name!");
			String firstName = userInput.nextLine();
			System.out.println("Print the last name!");
			String lastName = userInput.nextLine();
			System.out.println("Print the first class!");
			String firstClass = userInput.nextLine();
			System.out.println("Print the grade for the first class!");
			String firstGrade = userInput.nextLine();
			System.out.println("Print the second class!");
			String secondClass = userInput.nextLine();
			System.out.println("Print out the second grade!");
			String secondGrade = userInput.nextLine();
			System.out.println("Print out the third class!");
			String thirdClass = userInput.nextLine();
			System.out.println("Print out the third grade!");
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
			double totalGPA = 0.0;
  			totalGPA = totalGPA + MakeStudentObjects.getGPA(MakeStudentObjects.gradebook.get(student-1).getFirstGrade());
  			totalGPA = totalGPA + MakeStudentObjects.getGPA(MakeStudentObjects.gradebook.get(student-1).getSecondGrade());
  			totalGPA = totalGPA + MakeStudentObjects.getGPA(MakeStudentObjects.gradebook.get(student-1).getThirdGrade());
  			totalGPA = totalGPA / 3;
  			MakeStudentObjects.gradebook.get(student-1).setGPA(totalGPA);
		}
		
		public static void switchClass()

			{

			Scanner userInput = new Scanner(System.in);

			Scanner userInput2 = new Scanner(System.in);

			System.out.println("Please type the ID number of the student whose classes you would like to switch.");

			int student = userInput.nextInt();

			System.out.println("What classes would you like to change?");

			System.out.println("1) " + MakeStudentObjects.gradebook.get(student-1).getFirstClass());

			System.out.println("2) " + MakeStudentObjects.gradebook.get(student-1).getSecondClass());

			System.out.println("3) " + MakeStudentObjects.gradebook.get(student-1).getThirdClass());

			int firstClassChanged = userInput.nextInt();

			System.out.println("What class would you like to switch it with?");

			int secondClassChanged = userInput.nextInt();

			if ((firstClassChanged == 1 && secondClassChanged == 2) || (firstClassChanged == 2 && secondClassChanged == 1))

			{

			String secondClass = MakeStudentObjects.gradebook.get(student-1).getFirstClass();

			String firstClass = MakeStudentObjects.gradebook.get(student-1).getSecondClass();

			String secondGrade = MakeStudentObjects.gradebook.get(student-1).getFirstGrade();

			String firstGrade = MakeStudentObjects.gradebook.get(student-1).getSecondGrade();

			MakeStudentObjects.gradebook.get(student-1).setFirstClass(firstClass);

			MakeStudentObjects.gradebook.get(student-1).setSecondClass(secondClass);

			MakeStudentObjects.gradebook.get(student-1).setFirstGrade(firstGrade);

			MakeStudentObjects.gradebook.get(student-1).setSecondGrade(secondGrade);

			}

			else if ((firstClassChanged == 1 && secondClassChanged == 3) || (firstClassChanged == 3 && secondClassChanged == 1))

			{

			String thirdClass = MakeStudentObjects.gradebook.get(student-1).getFirstClass();

			String firstClass = MakeStudentObjects.gradebook.get(student-1).getThirdClass();

			String thirdGrade = MakeStudentObjects.gradebook.get(student-1).getFirstGrade();

			String firstGrade = MakeStudentObjects.gradebook.get(student-1).getThirdGrade();

			MakeStudentObjects.gradebook.get(student-1).setFirstClass(firstClass);

			MakeStudentObjects.gradebook.get(student-1).setThirdClass(thirdClass);

			MakeStudentObjects.gradebook.get(student-1).setFirstGrade(firstGrade);

			MakeStudentObjects.gradebook.get(student-1).setThirdGrade(thirdGrade);

			}

			else if ((firstClassChanged == 2 && secondClassChanged == 3) || (firstClassChanged == 3 && secondClassChanged == 2))

			{

			String thirdClass = MakeStudentObjects.gradebook.get(student-1).getSecondClass();

			String secondClass = MakeStudentObjects.gradebook.get(student-1).getThirdClass();

			String thirdGrade = MakeStudentObjects.gradebook.get(student-1).getSecondGrade();

			String secondGrade = MakeStudentObjects.gradebook.get(student-1).getThirdGrade();

			MakeStudentObjects.gradebook.get(student-1).setSecondClass(secondClass);

			MakeStudentObjects.gradebook.get(student-1).setThirdClass(thirdClass);

			MakeStudentObjects.gradebook.get(student-1).setSecondGrade(secondGrade);

			MakeStudentObjects.gradebook.get(student-1).setThirdGrade(thirdGrade);

			}


			}
		

	}
