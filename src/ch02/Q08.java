package ch02;

import java.util.Scanner;

public class Q08 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int rectx1 = 100, recty1 = 100;
		int rectx2 = 200, recty2 = 200;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("(x1, y1), (x2, y2)를 입력하세요>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.print("(100, 100), (200, 200)의 직사각형과 ");
		if(inRect(x1, y1, rectx1, recty1, rectx2, recty2) || inRect(x2, y2, rectx1, recty1, rectx2, recty2)) {
			System.out.println("충돌합니다.");
		}else {
			System.out.println("충돌하지 않습니다.");
		}
		
		sc.close();
	}
}
