import java.util.ArrayList;
import java.util.List;

public class ReturnRepeatedElement {

	
	public static List<Integer> repeated(int [] arr, int k){
		if(arr == null || arr.length == 0)
			return null;
		// key value -> 
		// -> 5 {all other values will be smaller 5}
		int [] count = new int [k+1];
		List<Integer> data = new ArrayList<Integer>();
		for(int a : arr) {
			count[a]++;
			if(count[a] == 2)
				data.add(a);		
		}
		return data;
	}
	
	
	public static void main(String[] args) {

		// 0 -> 6
		// [0, 1, 2, 3, 4, 5, 6]
		// [0, 3, 2, 1, 1, 1, 1]
		
		
		System.out.println(repeated(new int[] {1,2,2,3,4,5,6,1,1}, 6));

	}

}
