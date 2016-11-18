import java.io.FileNotFoundException;
 import java.util.Scanner;
 
 public class mainMenu
 	{
  

// public static void main(String[] args) {
// 	System.out.println(" ");
// }
 	//and
 		public static void main(String[] args) throws FileNotFoundException
 			{
 				MakeStudentObjects.getStudents();
 				mainMenu();
 			}
 			public static void mainMenu()
 			{
 				Scanner choice = new Scanner(System.in);
 				System.out.println();
 				System.out.println("Welcome to the Student Gradebook!");
 				System.out.println("What would you like to do?");
 				System.out.println("(1) Add or delete a student");
 				System.out.println("(2) Change a student's grades or schedule");
 				System.out.println("(3) Sort students");
 				int choice1 = choice.nextInt();
 				// Change this switch statement to run different classes each different case
 				switch (choice1)
 				{
 					case 1: System.out.println("(1) Add a student");
 							System.out.println("(2) Delete a student");
 							break;
 					case 2: System.out.println("(1) Change a grade");
 							System.out.println("(2) Switch classes");
 							break;
 					case 3: System.out.println("(1) Sort by last name");
 							System.out.println("(2) Sort by GPA");
 							System.out.println("(3) Sort by class");
 							break;
 	}
  }
 
  }
 