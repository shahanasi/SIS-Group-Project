package xcb;
import java.lang.Comparable;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortStudents 
	{

		
		public static void Menu() throws FileNotFoundException
		{
			Scanner input = new Scanner(System.in);
	
			System.out.println("1) Sort by last name");
			System.out.println("2) Sort by GPA");
			System.out.println("3) Sort by class");
			int sortingInput = input.nextInt();
			switch (sortingInput)
			{
				case 1: System.out.println("");
					{
						Collections.sort(MakeStudentObjects.gradebook, new SortLastName());
					}
				break;
				case 2: System.out.println("");
				break;
				case 3: System.out.println(" ");
				break;
			}
		}
			
	}
