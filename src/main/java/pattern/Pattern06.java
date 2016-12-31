package pattern;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		in.close();
		int o=0;
		for (int i = 0; i < row; i++) {
			for (int a = 1; a <= row - i; a++) {
				System.out.print(" ");
			}
			for (int b = 1 + 2 * i; b >= 1; b--) {
				if (b > (1+2*i)/2) {
					o++;
				} else {
					o--;
				}
				System.out.print(o);
			}
			System.out.println("");
			o=0;
		}
	}

}
