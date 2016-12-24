package pattern;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
