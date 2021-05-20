package Jungol519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		System.out.print((a + 100) + " " + (b % 10));

	}

}

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println(sc.nextInt() + 100);
//        System.out.println(sc.nextInt() % 10);
//
//        sc.close();
//    }
//
//}