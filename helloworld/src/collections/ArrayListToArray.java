package collections;


import java.util.ArrayList;

public class ArrayListToArray 
{

	public static void main(String[] args) 
	{
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 arr.add(10);
		 arr.add(20);
		 arr.add(30);
		 System.out.println(arr);
		 int[] arr1 = new int[arr.size()];
		 arr.toArray();
		 for(int i:arr)
		 {
		 System.out.println(i);
		 }
		 
	}

}
