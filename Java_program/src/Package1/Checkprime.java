package Package1;

import java.util.Scanner;

public class Checkprime {
	
	Checkprime(int a)
	{
		
	    int temp =0;
		for (int i=2;i<a-1;i++)
		   {
		    if(a%i==0)
		       {
			     temp= temp+1;
			    }
		   }
		
		if(temp>0)
		    {
			System.out.println("Entered number "+a+ " is not prime number");
		    }
		else 
		   {
			System.out.println("Entered number "+a+ " is prime number");
		    }
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Entered number to check whether it is prime or not : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Checkprime cd = new Checkprime(num);
	}

}
