package helloworld;

import java.util.Scanner;

public class Pattern1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows to print the pattern : ");
		int Rows = sc.nextInt();
		for(int i = 1;i <= Rows;i++)
		{
			for(int j =1;j <= i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
       for(int i=Rows;i>=1;i--)
       {
    	   for(int j=1;j<i;j++)
    	   {
    		   System.out.print(j+" ");
    	
    	   }
    	   System.out.println();
       }
	}

}
