import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Runner
		{
			public static void main(String[] args) throws FileNotFoundException
				{
					Scanner file=new Scanner(new File("StudentInfo.txt"));
					ArrayList<Student> database = new ArrayList<Student>();
					for(int i=0; 1<14; i++)
					{
						database.add(file.parse);
					}
				}
		}