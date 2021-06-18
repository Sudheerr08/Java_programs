package Package1;

import java.util.Scanner;

public class print_prime {

	
	
	print_prime(int a)

	{
		
		for(int i=1;i<=a;i++)
		    { 
			  int temp =0;
		       for (int j=2;j<i-1;j++)
		        {
		          if(i%j==0)
		            {
			          temp= temp+1;
			        }
		      }
	
		
		  if(temp==0)
		    {
			System.out.println(+i);
			//System.out.print(+i);
		    }
		  else 
		   {
			    temp =0;
		    }
		
	}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Entered two number between which you need to find prime numbers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//int b = sc.nextInt();
		print_prime cd = new print_prime(a);
	}

}
