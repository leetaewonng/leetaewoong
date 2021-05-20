package Jungol521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x++ * --y;


		System.out.print(x + " " + y);

		
		System.out.print(" " + z);
	}

}
