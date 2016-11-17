package xcb;

import java.io.FileNotFoundException;
import java.util.Collections;

public class sortStudentsByFirstName
	{

		public static void main(String[] args) throws FileNotFoundException
			{
				MakeStudentObjects.getStudents();
				for (int i = 0; i < MakeStudentObjects.gradebook.size(); i++)
					{
						MakeStudentObjects.gradebook.get(i).getFirstName();
					}
			}

	}


