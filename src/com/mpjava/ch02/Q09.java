package com.mpjava.ch02;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double cx = sc.nextDouble();
		double cy = sc.nextDouble();
		double radius = sc.nextDouble();

		System.out.print("점 입력>>");
		double x = sc.nextInt();
		double y = sc.nextInt();

		double distance = Math.sqrt((x - cx) * (x - cx) + (y - cy) * (y - cy));
		
		System.out.print("점 (" + x + ", " + y +")는 ");
		if(distance < radius) {
			System.out.println("원 안에 있다.");
		}else {
			System.out.println("원 안에 있지 않다.");
		}
		
		sc.close();
	}

}
