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
		order1.name = "ȫ���";
		order1.productNo = "PD0345-12";
		order1.add = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order1.orderNo);
		System.out.println("�ֹ��� ���̵� : " + order1.id);
		System.out.println("�ֹ� ��¥ : " + order1.date);
		System.out.println("�ֹ��� �̸� : " + order1.name);
		System.out.println("�ֹ�  ��ǰ ��ȣ : " + order1.productNo);
		System.out.println("����ּ� : " + order1.add);

	}

}
