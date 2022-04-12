import java.util.Scanner;

// 0 <= score <= 100
// 90 ~ 100 -> A
// 80 ~ 89 -> B
// 70 ~ 79 -> C
// 60 ~ 69 -> D
// 이하 F

public class Main_9498 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if (score >= 0 && score <= 100) {
			if (score <= 100 && score >= 90) {
				System.out.println("A");
			} else if (score <= 89 && score >= 80) {
				System.out.println("B");
			} else if (score <= 79 && score >= 70) {
				System.out.println("C");
			} else if (score <= 69 && score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("The score's range 0 ~ 100 ");
		}
	}
}