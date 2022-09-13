package com.mpjava.ch02;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("2자리수 정수 입력(10~99)>>");
			num = sc.nextInt();
			if(num >= 10 && num <=99) {
				break;
			}else {
				System.out.println("10~99의 정수를 입력해주세요.");
			}
		}
		int ten = num / 10;
		int one = num % 10;
		if(ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		sc.close();
	}
}
