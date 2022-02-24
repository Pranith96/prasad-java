import java.util.Arrays;
import java.util.Scanner;

public class DaysExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		String ss[] = new String[sc.nextInt()];

		System.out.println("enter String values");
		for (int i = 0; i < ss.length; i++) {
			ss[i] = sc.nextLine();
		}

		System.out.println(Arrays.toString(ss));
		sc.close();
	}
}
