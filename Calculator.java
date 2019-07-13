package classpart;

public class Calculator {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		
		int add = add(num1, num2);
		int sub = sub(num1, num2);
		int mul = mul(num1, num2);
		int div = div(num1, num2);
		
		System.out.println(num1 + "+" + num2 + "=" + add);
		System.out.println(num1 + "-" + num2 + "=" + sub);
		System.out.println(num1 + "*" + num2 + "=" + mul);
		System.out.println(num1 + "/" + num2 + "=" + div);
		
		
	}

	private static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

	private static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	private static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	private static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

}
