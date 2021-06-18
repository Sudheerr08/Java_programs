package Package1;

import java.util.Scanner;

public class Checkevenodd {
	Checkevenodd(int a)
	{
		if(a%2==0)
		{
			System.out.println("Entered number " +a+ " is Even number");
			
		}
		
		else
		{
			System.out.println("Entered number " +a+" is odd number");
			
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Entered number to check whether it is even or odd : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Checkevenodd cd = new Checkevenodd(num);
	}

}
