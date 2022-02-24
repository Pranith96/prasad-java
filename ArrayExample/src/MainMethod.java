import java.util.Arrays;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println(a[3]);
		System.out.println(Arrays.toString(a));

		int b[] = { 1, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(b));

		String s[] = new String[2];
		s[0] = "a";
		s[1] = "csfsgvfd";

		System.out.println(Arrays.toString(s));

		int c[][] = new int[2][2];
		c[0][0] = 1;
		c[0][1] = 2;
		c[1][0] = 3;
		c[1][1] = 4;

		System.out.println(c[0][1]);

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		String day[] = { "monday" };

	}
}
