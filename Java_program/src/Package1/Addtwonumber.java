package Package1;

import java.util.Scanner;

public class Addtwonumber {
	
	 Addtwonumber(int a, int b)
	  {
		int result = a+b;
		
		System.out.println("Sum of these two number is  "+result);
	
		
	    }
	 
	 public static void main(String[] args)
	 {
		 System.out.println("Enter the two numbers to add :");
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 Addtwonumber Ad = new Addtwonumber(a,b);
			
	 }

}
