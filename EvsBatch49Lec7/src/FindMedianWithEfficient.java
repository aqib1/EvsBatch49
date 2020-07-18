
//Time complexity O(log min(n,m))
public class FindMedianWithEfficient {
	public static double medien(int[] arr1, int[] arr2) {

		if (arr1.length > arr2.length) {
			int[] temp = arr1;
			arr1 = arr2;
			arr2 = temp;
		}

		boolean isOdd = (arr1.length + arr2.length) % 2 != 0;

		int min_index = 0;
		int max_index = arr1.length;
		int i = 0, j = 0;
		double median = 0.0;
		while (min_index <= max_index) {
			i = (min_index + max_index) / 2;
			j = ((arr1.length + arr2.length + 1) / 2) - i;

			if (i < arr1.length && j > 0 && arr2[j - 1] > arr1[i]) {
				min_index = i + 1;
			} else if (i > 0 && j < arr2.length && arr1[i - 1] > arr2[j]) {
				max_index = i - 1;
			} else {
				if (i == 0)
					median = arr2[j - 1];
				else if (j == 0)
					median = arr1[i - 1];
				else
					median = Math.max(arr1[i - 1], arr2[j - 1]);
				break;
			}
		}
		if (isOdd)
			return median;
		if (i == arr1.length)
			return (median + arr2[j]) / 2.0;
		if (j == arr2.length)
			return (median + arr1[i]) / 2.0;
		return (median + Math.min(arr1[i], arr2[j])) / 2.0;

	}
}
