package Jungol520;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x = x++;
		
		System.out.println(x++);
		
		x = ++x;
		System.out.print(x);

	}

}
