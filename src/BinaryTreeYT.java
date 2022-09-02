import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeYT {
static class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

static class BinaryTree{
	static int idx = -1;
	public static Node buildTree(int[] nodes) {
		idx++;
		if(nodes[idx] == -1)return null;
		Node newNode = new Node(nodes[idx]);
		newNode.left = buildTree(nodes);
		newNode.right = buildTree(nodes);
		
		return newNode;
	}
}
    public static void preorderTraversal(Node root) { //O(N)
    	if(root == null) {
    		return;
    	}
    	System.out.print(root.data+" ");
    	preorderTraversal(root.left);
    	preorderTraversal(root.right);
    }
    public static void inorderTraversal(Node root) {//O(N)
    	if(root == null) {
    		return;
    	}
    	inorderTraversal(root.left);
    	System.out.print(root.data+" ");
    	inorderTraversal(root.right);
    }
    public static void postorderTraversal(Node root) {//O(N)
    	if(root == null)return;
    	postorderTraversal(root.left);
    	postorderTraversal(root.right);
    	System.out.print(root.data+" ");
    }
    public static void levelOrderTraversal(Node root) {//O(N), BFS
    	if(root == null)return;
    	Queue<Node> q = new LinkedList<>();
    	q.add(root);
    	q.add(null);
    	
    	while( !q.isEmpty() ) {
    		Node currNode = q.remove();
    		if(currNode == null) {
    			System.out.println();
    			if(q.isEmpty()) {
    				break;
    			}else {
    				q.add(null);
    			}
    		}else {
    			System.out.print(currNode.data+" ");
    			if(currNode.left != null) {
    				q.add(currNode.left);
    			}
    			if(currNode.right != null) {
    				q.add(currNode.right);
    			}
    		}
    		
    	}
    	
    }
    public static int countNodes(Node root) {
    	if(root == null)return 0;
    	
    	int leftNodes = countNodes(root.left);
    	int rightNodes = countNodes(root.right);
    	
    	return leftNodes + rightNodes + 1;
    }
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
//		preorderTraversal(root);
//		System.out.println();
//		inorderTraversal(root);
//		System.out.println();
//		postorderTraversal(root);
//		System.out.println();
//		levelOrderTraversal(root);
		System.out.println(countNodes(root));
	}

}
