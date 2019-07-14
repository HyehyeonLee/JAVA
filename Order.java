package classpart;

public class Order {
	String orderNo;
	String id;
	String date;
	String name;
	String productNo;
	String add;
	
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.orderNo = "201803120001";
		order1.id = "abc123";
		order1.date = "2018-03-12";
		order1.name = "홍길순";
		order1.productNo = "PD0345-12";
		order1.add = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + order1.orderNo);
		System.out.println("주문자 아이디 : " + order1.id);
		System.out.println("주문 날짜 : " + order1.date);
		System.out.println("주문자 이름 : " + order1.name);
		System.out.println("주문  상품 번호 : " + order1.productNo);
		System.out.println("배송주소 : " + order1.add);

	}

}
