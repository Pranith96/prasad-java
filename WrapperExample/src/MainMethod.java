
public class MainMethod {

	public static void main(String[] args) {
		//auboxing
		int a = 10;
		Integer i = Integer.valueOf(a);

		System.out.println(i);
		Integer j = a;
		System.out.println(j);
		
		System.out.println("......................");
		// unboxing
		Integer ii = new Integer(15);
		int k = ii.intValue();

		System.out.println(k);

		int l = ii;
		System.out.println(l);
		
	}
}
