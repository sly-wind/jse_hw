package Feb_15;

import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 9)
			for(int i = 1; i <= 9; i++) System.out.print((i*num) + " ");
		else
			System.out.println("Wrong Input.");
	}
}
