
public class FindPermutation {

	/*
	 * ABC
	 * .   .
	 * .   .
	 * .   .
	 * ABC ACB  CAB
	 * 
	 * */
	
	public static void main(String[] args) {
		permutation("ABC");
	}
	
	public static void permutation(String value) {
		
		findPermutation(value, 0, value.length());
	}

	private static void findPermutation(String value, int l, int r) {
		if(l==r)
			System.out.println(value);
		else {
			for(int x=l; x<r; x++) {
				value = swap(value , x, l);
				findPermutation(value, l+1, r);
				value = swap(value, x, l);
			}
		}
		
	}

	private static String swap(String value, int x, int l) {
		char[] data = value.toCharArray();
		char temp = data[x];
		data[x] = data[l];
		data[l] = temp;
		return String.valueOf(data);
	}
	
}
