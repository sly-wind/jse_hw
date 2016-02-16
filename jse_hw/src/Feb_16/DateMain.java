package Feb_16;

import java.util.Scanner;

public class DateMain {

	public static void main(String[] args){
		
		DateService ds = new DateServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt(), m = sc.nextInt();
		System.out.println( y + "년 " + m + "월의 마지막 날은 " + ds.getEndDayOfMonth(y, m) + "입니다." );
		
		sc.close();
		return;
	}
}
