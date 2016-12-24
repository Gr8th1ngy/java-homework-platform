package pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num=in.nextInt();
		in.close();
		for (int i=1; i<=num;i++){
			for (int j = num; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
