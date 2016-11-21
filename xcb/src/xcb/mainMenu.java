package xcb;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class mainMenu
	{

		public static void main(String[] args) throws FileNotFoundException
			{
				mainMenu();
			}
			public static void mainMenu()
			{
				Scanner sorting = new Scanner(System.in);
				System.out.println("Welcome to the Student Gradebook!");
				System.out.println("How would you like to see your students?");
				System.out.println("(1) First Name");
				System.out.println("(2) Last Name");
				System.out.println("(3) GPA (Highest to Lowest)");
				System.out.println("(4) GPA (Lowest to Highest)");
				int sortingChoice = sorting.nextInt();
				// Change this switch statement to run different classes each different case
				switch (sortingChoice)
				{
					case 1: System.out.println("Sort by first name");
					break;
					case 2: System.out.println("Sort by last name");
					break;
					case 3: System.out.println("Sort by gpa (Highest to Lowest)");
					break;
					case 4: System.out.println("Sort by gpa (Lowest to Highest)");
					break;
	}
}
}
