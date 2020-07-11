
/**
 * array sorted and rotated 
 * [1,2,3,4,5] -> [5,1,2,3,4] 
 * index given no k (logn)
 * 
 *   ======
 *   
 * two sorted arrays 
 * [1,2,3,4,5,6] 
 * Median -> 3+4 / 2 = 3
 *  [1,2,3,4,5] 
 * median -> 3
 * 
 * [-3,5,6,12] [-1,7,15, 20]  = 4
 * [-3, -1, 5, ,6, 7, 12, 15, 20] = 6+7/2 = ?
 * 
 * O(n) , O(n+m)
 * 
 * Olog(min(n,m))

 * 
 * 
 */

public class FibonacciSequenceII {

	public static int fibonacci(int a) {
		if (a == 0)
			return 0;
		if (a == 1)
			return 1;

		return fibonacci(a - 1) + 
				
				fibonacci(a - 2);
	}

	/**
	 * input 2 fibonacci(1) + fibonacci(0);//
	 * 
	 * input 3 fibonacci(2) + fibonacci(1); fibonacci(1) + fibonacci(0); //
	 * 
	 * input 4 fibonacci(3) + fibonacci(2); fibonacci(2) + fibonacci(1);//
	 * fibonacci(1) + fibonacci(0);//
	 * 
	 * ** dynamic programming ***
	 * 
	 */
	public static void printFibonacci(int k) {
		for (int x = 0; x <= k; x++) {
			System.out.print(fibonacci(x) + " ");
		}
	}

	public static void main(String[] args) {
		printFibonacci(10);
	}

}
