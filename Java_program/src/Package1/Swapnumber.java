package Package1;

import java.util.Scanner;

public class Swapnumber {
	 
	Swapnumber(int a, int b)
	  {
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swap value of a is : "+a+" and Value of b is "+b);
	
		
	    }
	 
	 public static void main(String[] args)
	 {
		 System.out.println("Enter the two Values of a and b: ");
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 System.out.println("value of a is : "+a+" and Value of b is "+b);
		 Swapnumber Ad = new Swapnumber(a,b);
			
	 }


}
