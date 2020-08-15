import java.util.LinkedList;
import java.util.Queue;

// BFS -> Breath first search,
// Also known as level order traversal

// DFS -> depth first search

// 1) IN_ORDER = [L,N,R]

//, PRE_ORDER, POST_ORDER

public class BTree {
	Node root;

	
	// BST Structure
	public void add(int value){
		if(root == null) {
			root = new Node(value);
		} else {
			addChildNodes(root, value);
		}
	}
	
	
	
	private void addChildNodes(Node root, int value) {
		if(value > root.value) {
			// right move
			if(root.right == null) {
				root.right = new Node(value);
			} else {
				addChildNodes(root.right, value);
			}
		} else {
			// left move
			if(root.left == null) {
				root.left = new Node(value);
			} else {
				addChildNodes(root.left, value);
			}
			
		}
		
	}



	// L-R-N
	public void postOrderTraversal(Node r) {
		if(r==null)
			return;
		postOrderTraversal(r.left);
		postOrderTraversal(r.right);
		System.out.print(r.value +" ");
	}
	
	// N-L-R
	public void preOrderTraversal(Node r) {
		if(r==null)
			return;
		System.out.print(r.value+" ");
		preOrderTraversal(r.left);
		preOrderTraversal(r.right);
	}
	
	// L-N-R
	public void InOrderTraversal(Node r) {
		if(r==null)
			return;
		InOrderTraversal(r.left);
		System.out.print(r.value+" ");
		InOrderTraversal(r.right);
	}
	
	
	
	// Also called BFS
	public void levelOrderTraversal(Node r) {
		if (r == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(r);

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.value +" ");
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public static class Node {
		int value;
		Node left;
		Node right;

		public Node() {
			this(0);
		}

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

	}
}
