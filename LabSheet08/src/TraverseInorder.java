import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class TraverseInorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree1();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Inorder = " + traversal(tree.getRoot()));
	}
	
	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //list
		Deque<Node> stack = new ArrayDeque<Node>(); //stack

		Node current_node = node;//1
		while (current_node!=null || !stack.isEmpty()) {//2
			while (current_node != null) {
				stack.push(current_node);
				current_node = current_node.left;//3 
			}
			current_node = stack.pop(); //8
			list.add(current_node.data);//เอาตัวเลขไปใส่ไว้กับโหนดไม่ได้ เลยใส่ .data หรือ add to list
			current_node = current_node.right;//9
			
			
		}
		
		return list;
	}

}