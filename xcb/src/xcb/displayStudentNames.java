package xcb;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Collections;

public class displayStudentNames
	{

		public static void main(String[] args) throws FileNotFoundException
			{
				MakeStudentObjects.getStudents();
				for (int i = 0; i < MakeStudentObjects.gradebook.size(); i++)
					{
						DecimalFormat df = new DecimalFormat("#.#");
						System.out.printf("%-12s%-12s%-10s%-8s%-10s%-8s%-10s%-8s%s\n",MakeStudentObjects.gradebook.get(i).getFirstName(),MakeStudentObjects.gradebook.get(i).getLastName(),MakeStudentObjects.gradebook.get(i).getFirstClass(),MakeStudentObjects.gradebook.get(i).getFirstGrade(),MakeStudentObjects.gradebook.get(i).getSecondClass(), MakeStudentObjects.gradebook.get(i).getSecondGrade(), MakeStudentObjects.gradebook.get(i).getThirdClass(), MakeStudentObjects.gradebook.get(i).getThirdGrade(), df.format(MakeStudentObjects.gradebook.get(i).getGPA()));
						MakeStudentObjects.gradebook.get(i).getFirstName();
					}
			}

	}


