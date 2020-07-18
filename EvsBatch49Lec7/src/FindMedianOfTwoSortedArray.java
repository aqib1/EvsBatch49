public class FindMedianOfTwoSortedArray {
	
	// Time complexity O(n) and space O(n+m)
	// {1,3,5}, {2,4,6}
	public static double median(int []arr1, int [] arr2) {
		int totalSum = arr1.length + arr2.length;
		int [] merged = new int [totalSum];
		
		boolean isOdd = totalSum % 2 != 0;
		int mergedIndex = 0;
		int i=0, j=0;
		// O(n+m), O(m),O(n) ~ O(n+m)
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] <= arr2[j]) {
				merged[mergedIndex] = arr1[i];
				i++;
			} else {
				merged[mergedIndex] = arr2[j];
				j++;
			}
			mergedIndex++;
		}
		
		while(i< arr1.length) {
			merged[mergedIndex] = arr1[i];
			i++;
			mergedIndex++;
		}
		
		while(j < arr2.length) {
			merged[mergedIndex] = arr2[j];
			j++;
			mergedIndex++;
		}
		
		int center = totalSum/2;
		
		return isOdd ? merged[center] : ((double)merged[center] + merged[center-1]) / 2; 
	}

	public static void main(String[] args) {
		System.out.println(median(new int[] {1,2,3}, new int[]{5,6,7}));
	}
}
