package collections;
import java.util.ArrayList;


public class ListDemo 
{
	public static void main(String[] args) 
	{
		 ArrayList<Integer> a= new ArrayList<Integer>();
		 a.add(10);
		 a.add(20);
		 a.add(30);
		 a.add(10);
		 System.out.println(a);
		 System.out.println(a.size());
		 System.out.println(a.get(3));
		 a.add(3,40);
		System.out.println(a);
		System.out.println(a.indexOf(10));
		ArrayList<Integer> a1 = (ArrayList<Integer>) a.clone();//coping from a to a1
		System.out.println(a1);

	}

}
