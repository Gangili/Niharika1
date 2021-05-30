package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterRemove 
{

	public static void main(String[] args) 
	{
		  ArrayList<Integer> arr = new ArrayList<Integer>();
		  arr.add(100);
		  arr.add(200);
		  arr.add(3);
		  arr.add(400);
		  System.out.println(arr);
		    Iterator<Integer> arr1 = arr.iterator();
		    while(arr1.hasNext())
		    {
		    	Integer var = arr1.next();
		    	if(var%2==0)
		    	{
		    		System.out.println(var);
		    	
		    	}
		    	else
		    	{
		    		arr1.remove();
		    	}
		    		
		    		
		    		
		    }
	}

}
