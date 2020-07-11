import java.util.Arrays;

public class MainClass {
	public MainClass() {
		
	}

	/**
	 * Direct recursion In direct tail non tail
	 * 
	 */

	// Direct recursion
	/*
	 * print() { print() }
	 * 
	 */

	// In Direct

	// Tail recursion
	// - it will be the last call of method
	// - it will not going to evaluate any thing after call

	/*
	 * public void printArr(int [] x, int index){ if(index >= x.length){ return; }
	 * sysout(x[index]); printArr(x, index+1); }
	 * 
	 */

	// Non tail recursion
	/*
	 * not the last statement, need to evaluate after call.
	 * 
	 */

	
	private static void getNextPermutation(int [] p) {
		
		// 1- from max x where p(x) < p(x+1)
		// 2- from max y where p(x) < p(y)
		// 3- swap p(x) with p(y)
		// 4- reverse all from x+1, x+2, x+3 .... x+n
		
		int px = -1;
		for(int x=p.length-2; x>=0; x--) {
			if(p[x] < p[x+1]) {
				px = x;
				break;
			}
		}
		
		if(px == -1) {
			return;
		} else {
			for(int y = p.length-1; y>=0; y--) {
				if(p[px] < p[y]) {
					int temp = p[px];
					p[px] = p[y];
					p[y] = temp;
					reverse(p, px+1, p.length-1);
					break;
				}
			}
		}
		
	}
	
	private static void reverse(int[] p, int i, int j) {
		while (i < j) {
			int temp = p[i];
			p[i] = p[j];
			p[j] = temp;
		}
		
	}

	public static void main(String[] args) {
		int[] p =  {1,1,5};
		getNextPermutation(p);
		System.out.println(Arrays.toString(p));
		
		
		// GC (minor collection (eden, s1, s2, tenured))
		// (major collection (heap + non heap)
		// Lexicographical orders
		
		// 1,2,3 -> 2,3,1 | 2,1,3 | 3,1,2 | 3,2,1 | 1,3,2 
		//1,3,2
		
		// 1,1,5 -> 1,5,1 | 1,1,5 | 5,1,1 | 5,1,1
		
		
		
		
		
		
		
		
		
		
		
		
//		MainClass main = new MainClass();
		// an object is eligible for GC when no reference is pointing
//		main = null;
		
		
		/**
		 * 1- Marking phase
		 * 2- sweeping phase
		 * 3- compacting phase
		 * 
		 * */

	}
	/// main is eligible for garbage collection
	
}
