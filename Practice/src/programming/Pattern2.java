package programming;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
		for (int i = 1; i <= no; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}

}
