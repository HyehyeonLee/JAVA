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
		
		System.out.println("나이 : " + personJames.age);
		System.out.println("이름 : " + personJames.name);
		System.out.println("결혼여부 : " + personJames.isMarried);
		System.out.println("자녀 수 : " + personJames.child);

	}

}
