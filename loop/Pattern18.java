package loop;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	

		for(int i = 1; i <= n; i++) {
			 
			for(int j = n; j >= 2*i-1; j-=2) {
				System.out.print(j + " ");
			}
			

			System.out.println();
		}

	}

}
