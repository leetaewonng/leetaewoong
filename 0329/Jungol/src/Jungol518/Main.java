package Jungol518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();

//		System.out.printf("sum : %d\n", a + b + c);
//		System.out.printf("avg : %d\n", (a + b + c) / 3);
		System.out.println("sum : " + (a + b + c));
		System.out.println("avg : " + (a + b + c) / 3);

	}

}