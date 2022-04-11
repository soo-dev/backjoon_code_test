import java.util.Scanner;

//두 정수 A, B

//A > B -> '>'
//A < B -> '<'
//A == B -> '=='

public class Main_1330 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		
		if(A > B) {
			System.out.print(">");
		} else if (A < B) {
			System.out.print("<");
		} else if (A == B) {
			System.out.print("==");
		}
		
	}
}