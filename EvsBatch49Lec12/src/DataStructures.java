import java.util.Vector;

public class DataStructures {

	public static void main(String[] args) {
		// DS ?? 
		// - organizing data 
		// - data store mechanism 
		// - memory management
	// - storing data in a structural way ???
		// put -> first return -> first
		// put -> last return -> first
		// O(1) , retrieve O(1)
		// OlogN 
		
		// Java 1.0
		// Vector -> 
		Vector<Integer> vector = new Vector<>();
		// -> array, 10 [1,2,3,4,5,6,7,8,9,10]
		// temp = [1,2,3,4,5,6,7,8,9,10], new array[10*2] -> cap = 10*2 = 20
		vector.add(1); // 0
		vector.add(2); // 1
		vector.add(3); // 2
		vector.add(4); // 3
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		vector.add(9);
		vector.add(10);// 9
		vector.add(11); // 10
//		vector.clear();
		System.out.println(vector.indexOf(10));
		vector.trimToSize();
		System.out.println(vector.remove(Integer.valueOf(12)));
		System.out.println(vector);
		

	}

}
