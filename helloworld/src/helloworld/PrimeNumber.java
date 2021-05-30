package helloworld;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		
		 int i=2,m;
		System.out.println(i);
		for(i=3;i<=20;i++)
		{
			for(m=i;m>=1;m--)
			{
			if (i%m==0)
			{
			System.out.println("THIS IS OT A PRIME NUMBER");
			}
			
		else
			{
				System.out.println(i);
			}
		}
	
		}

	}

}
