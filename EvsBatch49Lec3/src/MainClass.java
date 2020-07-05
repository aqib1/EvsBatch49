//import java.util.Objects;

public class MainClass {

//	public void test() {
//		
//	}
	public static void main(String[] args) {
//		int arr[] = {1, 2, 3, 4, 5};
//		recursion(arr, 0, arr.length);
		
//		System.out.println(fictorial(4));
		permutations("ABC");

//		MainClass mainClass = new MainClass();
//		mainClass.test();

//		long start = System.currentTimeMillis();
//		int x = 2;
//		// O(1)
//		if(x == 1) 
//			System.out.println("Hi there");
//		 else 
//			System.out.println("Bye");
//		
//		
//		// O(1)
//		if(x<2) {
//			System.out.println("Hi");
//		} else if(x ==2) {
//			System.out.println("Bye");
//		} 
//		else {
//			System.out.println("Null");
//		} 
//			
//		// O(2)
//		if(x >= 2) {
//			if(x==2) {
//				System.out.println("its 2 ");
//			} else {
//				System.out.println("its greater than 2");
//			}
//		}

//		Integer y = 14;
//		System.out.println(Objects.isNull(y) ? 0 : 14);
//		int result = y >= 15 ? 0 : y < 10 ? y : -1; //Ternary operator
//		System.out.println(result);
//		String value = "";
//		switch(value) {
//		
//		}
//		
//		switch(y) {
//		case 80 :
//			System.out.println("Pass");
//			break;
//		case 50 :
//			System.out.println("Not good");
//			break;
//		default:
//			System.out.println("hi");
//			break;
//		case 15:
//			System.out.println("poor marks");
//		}

//		System.out.println(start- System.currentTimeMillis());

	}

	// arr, 0, 5
	// 1 2 3 4 5 
	// O(n) 
//	private static void recursion(int arr[], int f, int l) {
//		if(f < l) {
//			System.out.print(arr[f] + " ");
//			recursion(arr, f+1, l);
//		}
//	}
	
	
	// 4! => 4*3*2*1
//	private static int fictorial(int val) {
//		if(val == 1)
//			return 1;
//		
//		return val * fictorial(val-1);
//	}
	
	// ABC  3! = 3*2*1 = 6
	// ABC, ACB, BAC, BCA, CBA, CAB
	
	private static void permutations(String data) {
		findPermutations(data, 0, data.length());
	}

	private static void findPermutations(String data, int l, int r) {
		if(l == r) 
			System.out.println(data);
		else {
			for(int x=l; x<r; x++) {
				data = swap(data, l, x);
				findPermutations(data, l+1, r);
				data = swap(data, l, x);
			}
		}
		
	}

	private static String swap(String data, int l, int x) {
		char [] toChar = data.toCharArray();
		char t = toChar[l];
		toChar[l] = toChar[x];
		toChar[x] = t;
		return String.valueOf(toChar);
	}
}
