package pattern;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		for (int i = num; i >= 1; i--) {
			for (int j = num; j >= num-i+1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
