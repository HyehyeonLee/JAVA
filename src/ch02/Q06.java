package ch02;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = sc.nextInt();
		int[] digit = new int[2];
		digit[0] = num / 10;
		digit[1] = num % 10;
		
		System.out.print("박수");
		for(int i = 0; i<digit.length; i++) {
			if(digit[i] != 0 && digit[i] % 3 == 0) {
				System.out.print("짝");
			}
		}
		
		sc.close();
		
	}

}
