import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class TraversePreorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree1();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Preorder = " + traversal(tree.getRoot()));
	}

	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deque<Node> stack = new ArrayDeque<Node>();
		
		if (node == null) {
			return list;
		}

		stack.push(node);

		while (!stack.isEmpty()) {
			Node current = stack.pop();
			list.add(current.data); // หากในคลาส Node ใช้ชื่อฟิลด์อื่น เช่น val ให้เปลี่ยนเป็น current.val

			// นำลูกทางขวาใส่ Stack ก่อน เพื่อให้ลูกทางซ้ายอยู่ด้านบนและถูก pop ออกมาทำก่อน
			if (current.right != null) {
				stack.push(current.right);
			}
			if (current.left != null) {
				stack.push(current.left);
			}
		}

		return list;
	}

}