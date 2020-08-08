import java.util.BitSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;
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
		
		// Fail-safe
//		Enumeration<Integer> enumeration = vector.elements();
//		while(enumeration.hasMoreElements()) {
//			System.out.println(enumeration.nextElement());
//		}
		
//		BitSet bitSet = new BitSet();
//		bitSet.set(0);
//		bitSet.set(3);
//		System.out.println(bitSet.get(100));
		
//		vector.add(5);
//		vector.add(6);
//		vector.add(7);
//		vector.add(8);
//		vector.add(9);
//		vector.add(10);// 9
//		vector.add(11); // 10
//		vector.clear();
//		System.out.println(vector.indexOf(10));
//		vector.trimToSize(); // 21 internal capacity 21 
//		System.out.println(vector.remove(Integer.valueOf(12)));
//		System.out.println(vector);
		
		// FIFO  [1,2,3,4,5] => 1, 2, 3, 4, 5
		// LIFO  [1,2,3,4,5] => 5, 4, 3, 2, 1
		// java 1.0 LIFO
//		Stack<Integer> stack = new Stack<>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3); //[1, 2, 3]
//		System.out.println(stack.peek());
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		
		//O(1)
//		Hashtable<Integer, String> table = new Hashtable<>();
//		table.put(125, "aqib"); // internal index hash(125)%size = 3 for example
//		table.put(128, "ali"); // internal index hash(128)%size = 3 for example
//		// [3] -> (aqib -> ali)
//		System.out.println(table.get(125));
		// key -> magic(125) = 3
		// array [3] = "aqib"
		
		//Properties
//		Enumeration
//		BitSet
//     Dictionary
	}

}
