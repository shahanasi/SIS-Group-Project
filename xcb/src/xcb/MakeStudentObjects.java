package xcb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MakeStudentObjects
	{
		static ArrayList<Student> gradebook = new ArrayList<Student>();
		public static void main(String[] args) throws FileNotFoundException
			{
				getStudents();

			}
		public static void getStudents() throws FileNotFoundException
		{
		      Scanner file = new Scanner( new File( "studentInformation.txt" ) );   
		      	while (file.hasNext())
		      		{
		      			String firstName = file.next();
		      			String lastName = file.next();
		      			String firstClass = file.next();
		      			String firstGrade = file.next();
		      			String secondClass = file.next();
		      			String secondGrade = file.next();
		      			String thirdClass = file.next();
		      			String thirdGrade = file.next();
		      			double totalGPA = 0.0;
		      			totalGPA = totalGPA + getGPA(firstGrade);
		      			totalGPA = totalGPA + getGPA(secondGrade);
		      			totalGPA = totalGPA + getGPA(thirdGrade);
		      			totalGPA = totalGPA / 3;
		      			gradebook.add(new Student(firstName,lastName,firstClass,firstGrade,secondClass,secondGrade,thirdClass,thirdGrade, totalGPA));
		      		}
		for (int i = 0; i < gradebook.size(); i++)
			{
				System.out.println(gradebook.get(i).getGPA());
			}

	}
		
	public static double getGPA(String grade)
	{
		if (grade.substring(0,1).equals("A"))
				{
					return 4;
				}
			else if (grade.substring(0,1).equals("B"))
				{
					return 3;
				}
			else if (grade.substring(0,1).equals("C"))
				{
					return 2;
				}
			else if (grade.substring(0,1).equals("D"))
				{
					return 1;
				}
		return 0;
	}
}
