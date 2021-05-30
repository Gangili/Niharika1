package collections;

import java.util.ArrayList;

import java.util.List;

public class ArrayList1 
{

	public static void main(String[] args) 
	{
		 ArrayList<String> arr = new ArrayList<String>();
		 arr.add("Gahan");
		 arr.add("sujith");
		 arr.add("Niharika");
		 System.out.println("Actual ArrayList is : "+arr);
		 List<String> list = new ArrayList<String>();
		 list.add("Gahan");
		 list.add("sujith");
		 //arr.addAll(arr1);
		 System.out.println("Copied ArrayList is : "+arr);
		 System.out.println(arr.containsAll(list));
		 list.add("Four");
		 System.out.println(arr.contains("Gahan"));
		 
		  

	}

}
