package pattern;

import java.util.Scanner;

public class Pattern04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		in.close();
		for (int i = 0; i < row; i++) {
			for (int a = 1; a <= row - i; a++) {
				System.out.print(" ");
			}
			for (int b = 1 + 2 * i; b >= 1; b--) {
				System.out.print(b);
			}
			System.out.println("");
		}
	}

}
