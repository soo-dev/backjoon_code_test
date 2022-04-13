package Stage_2;

import java.util.Scanner;

public class Main_2753 {
	public static void main(String[] args) {
		// 윤년? 
		// -> 4의 배수 && 100의 배수가 아닐때 || 400의 배수
		Scanner scan = new Scanner(System.in);
		int inputYear = scan.nextInt();

		if(inputYear % 4 == 0 && inputYear % 100 != 0 || inputYear % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}