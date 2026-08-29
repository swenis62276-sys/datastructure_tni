public class TreeApp {

	public static void main(String[] args) {
		System.out.println("----\n tree 1\n----");
		BinaryTree tree = new BinaryTree();
		tree.createTree1();
		tree.printTree(tree.getRoot(),0);
		System.out.println("----\n tree 2\n----");
		//BinaryTree tree2 = new BinaryTree();
		tree.createTree2();
		tree.printTree(tree.getRoot(),0);
		System.out.println("----\n tree 3\n----");
		//BinaryTree tree3 = new BinaryTree();
		tree.createTree3();
		tree.printTree(tree.getRoot(),0);

	}

}