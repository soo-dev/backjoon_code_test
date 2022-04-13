package Stage_1;

import java.util.Scanner;

public class Main_2588 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int units = b%10 * a;
		int tens = b%100/10 * a;
		int hundreds = b%1000/100 * a;
		int sum = a * b;
		System.out.println(units);
		System.out.println(tens);
		System.out.println(hundreds);
		System.out.println(sum);
	}
}