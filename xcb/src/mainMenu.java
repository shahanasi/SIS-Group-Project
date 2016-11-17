import java.util.Scanner;

import xcb.SortStudents;
public class mainMenu
	{

		public static void main(String[] args)
			{
				mainMenu();
			
			}
			public static void mainMenu()
			{
				System.out.println("yo");
				Scanner sorting = new Scanner(System.in);
				System.out.println("Welcome to the Student Gradebook!");
				System.out.println("What would you like to do?");
				System.out.println("(1) add or delete a student");
				System.out.println("(2) change student grades/schedule");
				System.out.println("(3) sort students");
				
				int sortingChoice = sorting.nextInt();
				switch (sortingChoice)
				{
					case 1: System.out.println("");
					
					break;
					case 2: System.out.println("");
					break;
					case 3: System.out.println("Sort Students");
						{
							SortStudents.main();
						}
					break;
	}
}
}
