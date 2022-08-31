package ch02;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		int x1 = 100, y1 = 100;
		int x2 = 200, y2 = 200;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int inputX = sc.nextInt();
		int inputY = sc.nextInt();
		
		System.out.print("(" + inputX + ", " + inputY + ")는 사각형 안에 ");
		if((inputX >= x1 && inputY >= y1) && (inputX <= x2 && inputY <= y2)) {
			System.out.println("있습니다.");
		}else {
			System.out.println("있지 않습니다.");
		}
		
		sc.close();
	}

}
