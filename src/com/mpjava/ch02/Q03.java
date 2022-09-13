package com.mpjava.ch02;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int num = sc.nextInt();
		String[] won = {"오만원권", "만원권", "천원권", "백원", "오십원", "십원", "일원"};
		int[] money = { 50000, 10000, 1000, 100, 50, 10, 1 };
		String[] unit = {"매", "매", "매", "개", "개", "개", "개"};
		
		for(int i = 0; i<money.length; i++) {
			System.out.println(won[i] + " " + num / money[i] + unit[i]);
			num %= money[i];
		}
		sc.close();
	}
}
