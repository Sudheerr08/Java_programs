package Package1;

import java.util.Scanner;

public class Cases {
	public static void main(String[] args)

	{
		System.out.println("Enter the number to print the month");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String month = "";
		switch(num) {
		
		
		case 1:month="1-January";
		break;
		case 2:month="2-February";
		break;
		case 3:month="3-March";
		break;
		case 4:month="4-April";
		break;
		case 5:month="5-May";
		break;
		case 6:month="6-June";
		break;
		case 7:month="7-July";
		break;
		case 8:month="8-August";
		break;
		case 9:month="9-September";
		break;
		case 10:month="10-October";
        break;
		case 11:month="11-November";
		break;
		case 12:month="12-December";
		break;
		default:System.out.println("Invalid month");
		
		}
	
		System.out.println(month);
		
		
	}

}
