
import java.io.*;
import java.util.HashSet;

public class ClearElement{
	public static void main(String args[])
	{
	
		HashSet<String> set = new HashSet<String>();


		set.add("Welcome");
		set.add("To");
		set.add("my");
		set.add("Country");
		set.add("India");

		System.out.println("HashSet: " + set);

	
		set.clear();

	
		System.out.println("The final set: " + set);
	}
}
