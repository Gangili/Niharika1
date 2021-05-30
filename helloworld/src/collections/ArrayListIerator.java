package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIerator 
{

	public static void main(String[] args) 
	{
      ArrayList<String> arr = new ArrayList<String>();
      arr.add("First");
      arr.add("Second");
      arr.add("Third");
      System.out.println(arr);
       Iterator<String> a = arr.iterator();
       while(a.hasNext());
       {
    	   System.out.println(a.hasNext());
       }
    	


	}

}
