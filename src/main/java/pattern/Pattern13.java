package pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		char[] num=in.next().toCharArray();
		in.close();
		for (char i='A'; i<=num[0];i++){
			for (char j = 'A'; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
