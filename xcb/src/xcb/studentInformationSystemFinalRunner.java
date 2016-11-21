package xcb;

import java.io.FileNotFoundException;

public class studentInformationSystemFinalRunner
	{

		public static void main(String[] args) throws FileNotFoundException
			{
				MakeStudentObjects.getStudents();
				displayStudentNames.makeDisplay();
				modifyStudents.changeGrade();
				displayStudentNames.makeDisplay();
			}

	}
