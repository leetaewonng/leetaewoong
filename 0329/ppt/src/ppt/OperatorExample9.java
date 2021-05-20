package ppt;

public class OperatorExample9 {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;

		int iz = x * y;
		long iz1 = (long) x * (long) y;
		long iz2 = (long) (x * y);
//		long x = 1000000;
//		long y = 1000000;

		System.out.println(iz);
		System.out.println(iz1);
		System.out.println(iz2);
//		System.out.printf("%d",x*y);

	}

}
