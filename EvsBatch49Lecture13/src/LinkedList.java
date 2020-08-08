
// 1->2->3->4
public class LinkedList<V> {
	private Node<V> root;

	// O(n) [3->2->1->null]
	public void push(V value) {
		Node<V> curr = new Node<V>(value);
		curr.next = root;
		root = curr;
	}

	public V pop() {
		Node<V> last = root;
		root = root.next;
		return last.value;
	}
	
	public void print() {
		Node<V> pointer = root;
		while (pointer != null) {
			System.out.print(pointer.value +" ");
			pointer = pointer.next;
		}
		System.out.println();
	}

	class Node<T> {
		private Node<T> next;
		private T value;

		public Node(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
}
