package xcb;
import java.util.Collections;
import java.util.Comparator;
public class sortGPA implements  Comparator<Student>
	{
		public int compare(Student s1, Student s2) 
			{
		return Double.compare(s1.getGPA(),s2.getGPA()); 
		
			}
	}