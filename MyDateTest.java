package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		date1.isDate(); // 유효하지 않은 날짜입니다.
		MyDate date2 = new MyDate(2, 10, 2006);
		date2.isDate(); // 유효한 날짜입니다.
	}

}
