package Package2;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args)
	{
		int reverse = 0,rem;
		System.out.println("Enter to number to reverse");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/* Code for reverse with while loop*/
		while(num!=0)
		{
			rem=num%10;
			reverse = reverse*10+rem;
			num=num/10;
		}
		
		/* Code for reverse with for loop*/
		
//		for(;num != 0; num /= 10) {
//		      int digit = num % 10;
//		      reversed = reversed * 10 + digit;
//		}
		System.out.println("Number is "+reverse);
		
	}
	

}
