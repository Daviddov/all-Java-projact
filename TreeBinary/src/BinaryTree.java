
public class BinaryTree {
	private class Node {
		private int value;
		private Node leftChild;
		private Node rightChild;

		public Node(int item) {
			this.value = item;
		}
		@Override
		public String toString() {
			return "Node= " + value;
		}
	}

	private Node root;

	public void insert(int num) {
		if (root == null) {
			root = new Node(num);
			return;
		}
		Node current = root;
		while (true) {
			if (current.value < num) {
				if (current.rightChild == null) {
					current.rightChild = new Node(num);
					break;
				}
				current = current.rightChild;
			}
			else {
			if (current.value > num) {
				if (current.leftChild == null) {
					current.leftChild = new Node(num);
					break;
				}
				current = current.leftChild;
			}
			}
		}
	}

}
