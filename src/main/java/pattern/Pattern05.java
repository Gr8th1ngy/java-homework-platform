package pattern;

import java.util.Scanner;

public class Pattern05 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		for (int i = num; i > 0; i--) {
			for (int j = num - (num - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= num - i; j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println("");
		}
	}
}
