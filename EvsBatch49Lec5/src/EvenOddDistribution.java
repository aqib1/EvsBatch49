
public class EvenOddDistribution {

	/**
	 * Recursion 4 types
	 * 
	 * - Direct recursion - In direct recursion (<-) - Tail recursion - non tail
	 * recursion
	 * 
	 */

	public static int even(int value) {
		if (value % 2 != 0)
			return odd(value);
		return value - 1;
	}

	public static int odd(int value) {
		if (value % 2 == 0)
			return even(value);
		return value + 1;
	}
	
	
	public static void printNo(int k) {
		for(int z=1; z<=k ; z++) {
			System.out.print(odd(z) + " ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		printNo(10);
	}

}
