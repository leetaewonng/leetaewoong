package Jungol521;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(x);
		System.out.println(y);

		int z = x++ * --y;
		
		System.out.println(x + " " + y + " " + z);

	}

}
