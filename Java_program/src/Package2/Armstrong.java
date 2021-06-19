package Package2;

import java.util.Scanner;

public class Armstrong 
{
	 public static void main(String[] args)
	   {
		int count = 0,rem,t1,t2,t3=0;
		System.out.println("Enter to number to check number of digit");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		t1 =num;
		t2=num;
		/* Code for reverse with while loop*/
		while(t1!=0)
	     	{
			t1=t1/10;
			count = count+1;
			
			//reverse = reverse*10+rem;
			//num=num/10;
	     	}
		System.out.println("number of digits in number is "+count);
     
	      while(t2!=0)
      	{
	    	  int mul=1;
	  	   rem=t2%10;
	  	   
		for(int i=1;i<=count;i++)
		  {
			mul= mul*rem;
			
		  }
		
		t3=t3+mul;
		t2=t2/10;
		
		
      	}
		
		if(t3==num)
		{
			System.out.println("Number is armstrong");
			
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
       
  }
}
