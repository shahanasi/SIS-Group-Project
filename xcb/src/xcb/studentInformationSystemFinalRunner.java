package xcb;

import java.io.FileNotFoundException;
import java.util.*;

public class studentInformationSystemFinalRunner
	{

		public static void main(String[] args) throws FileNotFoundException
			{
				MakeStudentObjects.getStudents();
				mainMenu();
			}
		public static void mainMenu() throws FileNotFoundException
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("What would you like to do with your students?");
			System.out.println("(1) Sort");
			System.out.println("(2) Add or Delete a student");
			System.out.println("(3) Change a student's grades or scedule");
			int choice = userInput.nextInt();
			if (choice == 1)
				{
					SortStudents.Menu();
					displayStudentNames.makeDisplay();
					mainMenu();
				}
			else if (choice == 2)
				{
					displayStudentNames.makeDisplay();
					System.out.println("Would you like to:");
					System.out.println("(1) Delete");
					System.out.println("(2) Add");
					System.out.println("(3) Return to Main Menu");
					choice = userInput.nextInt();
					if (choice == 1)
						{
							displayStudentNames.makeDisplay();
							modifyStudents.deleteStudent();
							displayStudentNames.makeDisplay();
							mainMenu();
						}
					else if (choice == 2)
						{
							displayStudentNames.makeDisplay();
							modifyStudents.addStudent();
							displayStudentNames.makeDisplay();
							mainMenu();
						}
					else
						{
							mainMenu();
						}
				}
				else if (choice == 3)
					{
						displayStudentNames.makeDisplay();
						System.out.println("Would you like to:");
							System.out.println("(1) Change Grades");
							System.out.println("(2) Change Classes");
							System.out.println("(3) Return to Main Menu");
							choice = userInput.nextInt();
							if (choice == 1)
								{
									displayStudentNames.makeDisplay();
									modifyStudents.changeGrade();
									displayStudentNames.makeDisplay();
									mainMenu();
								}
							else if (choice == 2)
								{
									displayStudentNames.makeDisplay();
									modifyStudents.switchClass();
									displayStudentNames.makeDisplay();
									mainMenu();
								}
							else
								{
									mainMenu();
								}
					
					
					
				}
		}

	}
