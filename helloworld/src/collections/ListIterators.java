package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterators 
{

	public static void main(String[] args) 
	{
		  ArrayList<String> a = new ArrayList<String>();
		  a.add("one");
		  a.add("two");
		  a.add("three");
		  a.add("four");
		  System.out.println(a);
		    ListIterator<String> li = a.listIterator();
		    while(li.hasNext())
		    {
		    	System.out.println(li.next());
		    }
		    while(li.hasPrevious())
		    {
		    
		    
		    String var = li.previous();
		    if(var.equals("one"))
		    	li.set("Durgasoft");
		    
		    System.out.println(li.previous());
		    	
		    }
		  
		
	}

}
