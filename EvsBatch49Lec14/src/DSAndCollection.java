import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;



public class DSAndCollection {
public static void main(String[] args) {
	/*
	 *     1
	 *   2   3
	 * 4  5 6  7 
	 * 
	 * */
//	BTree.Node root = new BTree.Node();
//	BTree.Node r1_left = new BTree.Node(2);
//	r1_left.setLeft(new BTree.Node(4));
//	r1_left.setRight(new BTree.Node(5));
//	
//	BTree.Node r1_right = new BTree.Node(3);
//	r1_right.setLeft(new BTree.Node(6));
//	r1_right.setRight(new BTree.Node(7));
//	root.setValue(1);
//	root.setLeft(r1_left);
//	root.setRight(r1_right);
//	BTree bTree = new BTree();
//	bTree.setRoot(root);
	BTree bTree = new BTree();
	bTree.add(100);
	bTree.add(90);
	bTree.add(70);
	bTree.add(95);
	bTree.add(110);
	bTree.add(105);
	bTree.add(115);
	bTree.InOrderTraversal(bTree.getRoot());
	
	// Max_Heap log(n) heapify O(n)
//	PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b, a));
//	maxHeap.add(10);
//	maxHeap.add(3);
//	maxHeap.add(1);
//	
//	System.out.println(maxHeap.poll());
//	System.out.println(maxHeap.poll());
	
	// Heap Data structure (default implementation Min_heap)
	// SORT N Numbers of sorted lists
//	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//	minHeap.add(10);
//	minHeap.add(3);
//	minHeap.add(1);
//	
//	System.out.println(minHeap.poll());
//	System.out.println(minHeap.poll());
	
	
	// But this one is linkedlist (LIFO)
//	LinkedList<Integer> linkedList = new LinkedList<>();
	// its a queue not a linkedlist (FIFO)
//	Queue<Integer> queue = new LinkedList<Integer>();
//	queue.add(1);
//	queue.add(2);
//	queue.add(3);
//	System.out.println(queue.poll());
//	System.out.println(queue.remove());
	
// Collection of distinct and organized elements  HASH -> O(1)
//	Set<Integer> set = new HashSet<>();
//	set.add(2);
//	set.add(1);
//	set.add(2);
//	set.add(3);
//	System.out.println(set);
	
	
	
//	ArrayList<Integer> arrayList = new ArrayList<>();
//	arrayList.add(1);
//	arrayList.add(2);
//	arrayList.add(3);
	
	
	// Fail-fast
//	Iterator<Integer> it = arrayList.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
////		arrayList.add(12);
//	}
	
}
}
