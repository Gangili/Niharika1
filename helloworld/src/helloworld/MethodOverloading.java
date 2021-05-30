package helloworld;

public class MethodOverloading 
{
	
	/*
	 * public void m1(int x) { System.out.println(x); }
	 */
		
	/*
	 * public void m1(float y) { System.out.println(y); }
	 */
		 
	/*
	 * public void m1(String x) { System.out.println(x); }
	 */

	
	  public void m1(Integer x) 
	  { 
		  System.out.println(x);
	  } 
	  public void m1(Number x)
	  { 
		  System.out.println(x);
	  }
		/*
		 * public void m1(Object x) { System.out.println(x); }
		 */
	 
    public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
	    obj.m1(10);
	    obj.m1(2.9f);
	    obj.m1("Niha");
	    obj.m1(1000);
	    obj.m1(12.67f);
	    obj.m1("munni");
	}
   

}
