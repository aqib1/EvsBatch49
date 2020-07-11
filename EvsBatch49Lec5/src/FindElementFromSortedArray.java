
public class FindElementFromSortedArray {
	/**
	 * array is sorted so [1, 2, 3, 4, 5] -> O(n)
	 * 
	 * [5, 6, 7, 8, 9]
	 * 
	 * 
	 * what going to happened if array is not sorted ?
	 * 
	 * [61, 2, 11, 22, 12]
	 * 
	 */

	// Time complexity Log(n) and space complexity O(1)
	public static int find(int[] arr, int k) {
		if (arr == null || arr.length == 0)
			return -1;
		if (arr.length == 1 && arr[0] == k)
			return 0;

		return binerySearch(arr, 0, arr.length, k);
	}

	private static int binerySearch(int[] arr, int left, int right, int k) {
		if (left > right)
			return -1;
		
		int mid = left + (right - left) / 2;
		if(arr[mid]  == k)
			return mid;
		if(k > arr[mid])
			return binerySearch(arr, mid+1, right, k);
		return binerySearch(arr, left, mid-1, k);
	}

	public static void main(String[] args) {
		System.out.println(find(new int [] {2, 3, 4, 5, 6}, 5));
	}
}
