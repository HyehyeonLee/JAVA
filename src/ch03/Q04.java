package ch03;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = sc.next();
		char c = s.charAt(0);
		int length = c - 97;

		for (int i = length; i >= 0; i--) {
			for (int j = 97; j <= 97 + i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}

		sc.close();
	}

}
