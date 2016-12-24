package pattern;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] num = in.next().toCharArray();
		in.close();
		for (char i = num[0]; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
