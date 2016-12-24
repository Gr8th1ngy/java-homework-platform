package pattern;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] num = in.next().toCharArray();
		in.close();
		for (char i = 'A'; i <= num[0]; i++) {
			for (char j = num[0]; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
