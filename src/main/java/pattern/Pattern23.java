package pattern;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] num = in.next().toCharArray();
		in.close();
		for (char i = num[0]; i >= 'A'; i--) {
			for (char j = num[0]; j >= num[0]-i+65; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
