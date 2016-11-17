package xcb;

import java.util.Scanner;

public class SortStudents
	{
		public static void main()
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
						sortByLastName();
					}
				break;
				case 2: System.out.println("");
				break;
				case 3: System.out.println();
				break;
			}
		}
		public static void sortByLastName()
		{
			
		}
	}
