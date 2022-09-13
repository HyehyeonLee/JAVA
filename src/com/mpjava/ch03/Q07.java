package com.mpjava.ch03;

public class Q07 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] += (int)(Math.random() * 10 + 1);
		}
		
		int sum = 0;
		System.out.print("랜덤한 정수들 : ");
		for(int i : arr) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("평균은 " + sum / 10);
	}

}
