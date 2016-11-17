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
		      			gradebook.add(new Student(firstName,lastName,firstClass,firstGrade,secondClass,secondGrade,thirdClass,thirdGrade));
		      		}
		for (int i = 0; i < gradebook.size(); i++)
			{
				System.out.println(gradebook.get(i).getFirstName());
			}

	}
}
