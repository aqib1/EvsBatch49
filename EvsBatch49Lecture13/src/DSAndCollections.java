import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class DSAndCollections {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.push(1);
		li.push(2);
		li.push(3);
		li.print();
		System.out.println(li.pop());
		li.print();
		// List, Set, Queue, Dequeue  | Map
		
//		ArrayList<Integer> li = new ArrayList<>();
//		li.add(1);
//		li.add(2);
//		li.add(3);
//		System.out.println(li.get(0));
//		
//		CopyOnWriteArrayList<Integer> cp = new CopyOnWriteArrayList<Integer>();
//		Collections.synchronizedCollection(li);
		
//		LinkedList<Integer> linked =new LinkedList<Integer>();
//		linked.push(1);
//		linked.push(2);
//		System.out.println(linked.pop());
//		System.out.println(linked.peek());
//		System.out.println(linked.pollLast());
//		System.out.println(linked.peekLast());
//		System.out.println(linked.peekFirst());
	}
}
