package ch02;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		int result = 0;
		
		//(1) 연산식을 구분할 때 if-else문을 이용하여 프로그램을 작성하라.
		try {
			if(op.equals("+")) {
				result = a + b;
				System.out.println(a + op + b +"의 계산 결과는 " + result);
			}else if(op.equals("-")) {
				result = a - b;
				System.out.println(a + op + b +"의 계산 결과는 " + result);
			}else if(op.equals("*")) {
				result = a * b;
				System.out.println(a + op + b +"의 계산 결과는 " + result);
			}else if(op.equals("/")) {
				result = a / b;
				System.out.println(a + op + b +"의 계산 결과는 " + result);
			}
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		//(2) 연산식을 구분할 때 switch문을 이용하여 프로그램을 작성하라.
		result = 0;
		try {
			switch (op) {
			case "+":
				result = a + b;
				System.out.println(a + op + b +"의 계산 결과는 " + result);
				break;
			case "-":
				result = a - b;
				System.out.println(a + op + b +"의 계산 결과는 " + result);
				break;
			case "*":
				result = a * b;
				System.out.println(a + op + b +"의 계산 결과는 " + result);
				break;
			case "/":
				result = a / b;
				System.out.println(a + op + b +"의 계산 결과는 " + result);
				break;
			}
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		sc.close();
	}

}
