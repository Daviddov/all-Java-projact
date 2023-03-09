
public class Main {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 15, 6, 1, 8, 12, 18, 17 };
		BinaryTree tree = new BinaryTree();
		
for (int i = 0; i < arr.length; i++) {
	tree.insert(arr[i]);
	System.out.println("Done");
	}

	}
}
