package classpart;

public class Person {
	int age;
	String name;
	boolean isMarried;
	int child;
	
	
	public static void main(String[] args) {
		Person personJames = new Person();
		personJames.age = 40;
		personJames.name = "James";
		personJames.isMarried = true;
		personJames.child = 3;
		
		System.out.println("���� : " + personJames.age);
		System.out.println("�̸� : " + personJames.name);
		System.out.println("��ȥ���� : " + personJames.isMarried);
		System.out.println("�ڳ� �� : " + personJames.child);

	}

}
