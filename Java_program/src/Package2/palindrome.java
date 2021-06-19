package Package2;

import java.util.Scanner;

public class palindrome {
	int rem=1,rev=0;

	void reverse()
	       {
		
	       }
	  palindrome(int a)
          { /* code to reverse the number*/
		  
		   while(a!=0)
		       {
			  
			  rem=a%10;
				rev = rev*10+rem;
				a=a/10;  
		        }
          } 
	  
	  public static void main(String[] args)
	  
	  { int t1,numb=0;
	  System.out.println("Enter the number to check whether it is palinndrome or not: ");
		  Scanner sc = new Scanner(System.in);
		  numb = sc.nextInt();
		  t1 = numb;
		 
		  palindrome pd =new palindrome(numb);
		  
		 
	  if(t1==pd.rev)
	  {
		  System.out.println(+t1 +" Number is paliindrome number");
	  }
	  else
	  {
		  System.out.println(+t1 +" Number is not palindrome number");
	  }
	  
	  }

}
