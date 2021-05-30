package collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerators 
{

	public static void main(String[] args) 
	{
		  Vector<String> v = new Vector<String>();
		  v.add("java");
		  v.add("python");
		  v.add("c++");
		  v.add("oracle");
		  System.out.println(v);
		    Enumeration<String> vr = v.elements();
		    while(vr.hasMoreElements())
		    {
		    	System.out.println(vr.nextElement());
		    }

	}

}
