package examples;

//An IntTreeNode object is one node in a binary tree of ints.
public class IntTreeNode {

	public int data; // data stored at this node
	public IntTreeNode left; // reference to the left subtree
	public IntTreeNode right; // reference to the right subtree

	public IntTreeNode(int data) {
		this.data = data;
	}

	public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public static void main(String[] args) {

	}
}
