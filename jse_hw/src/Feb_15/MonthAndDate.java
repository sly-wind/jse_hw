package Feb_15;

import java.util.Scanner;

public class MonthAndDate {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8:  case 10:  case 12: System.out.println("31 Days.");
			break;
		case 4: case 6: case 9: case 11: System.out.println("30 Days.");
			break;
		case 2: System.out.println("29 Days.");
			break;
		default:
			System.out.println("Wrong Input.");
		}
	}
	
}
