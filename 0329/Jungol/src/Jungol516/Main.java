package Jungol516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		String c = scanner.next();
//		String c = scanner.nextLine();      
//		char c = scanner.next().charAt(0);

		scanner.close();
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

		System.out.printf("%.2f\n%.2f\n%s\n", a, b, c);

	}

}
