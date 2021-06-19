package Package2;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args)
	{
		int res=1;
		System.out.println("Enter the number for factorial : ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		while(num>=1)
			
		   {
		      res =	res*num;
		      num--;
		     }
			
		System.out.println("Factorial of number is "+res);
	}
}
	

 

