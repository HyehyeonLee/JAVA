package com.mpjava.ch02;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[3];
		
		System.out.print("정수 3개 입력>>");
		for(int i = 0; i<3; i++) {
			int num = sc.nextInt();
			list[i] = num;
		}
		
		Arrays.sort(list);
		System.out.println("중간 값은 " + list[1]);
		
		sc.close();
	}

}
