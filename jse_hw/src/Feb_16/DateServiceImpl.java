package Feb_16;

public class DateServiceImpl implements DateService {

	@Override
	public String getEndDayOfMonth(int year, int month) {
		// TODO Auto-generated method stub
		
		String result = "";
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = "31일"; break;
		case 4: case 6: case 9: case 11:
			result = "30일"; break;
		case 2:
			result = "28일";
			if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) result = "29일";
			break;
		default:
		}
		
		return result;
	}

}
