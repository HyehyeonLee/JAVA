package com.mpjava.ch03;

import java.util.ArrayList;
import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(true) {
			System.out.print("정수 몇 개?>>");
			n = sc.nextInt();
			if(n > 100) {
				System.out.println("100보다 작은 값을 입력해주세요.");
			}else {
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			int num = (int) (Math.random() * 100 + 1);
			if (!list.contains(num)) {
				list.add(num);
			} else {
				i -= 1;
			}
		}
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}
		sc.close();
	}

}
