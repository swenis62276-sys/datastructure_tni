
public class TodoList {

	public static void main(String[] args) {

		DoublyLinkedList todolist = new DoublyLinkedList();
		todolist.insert("Finish Homework");
		System.out.println("To-Do List = "+todolist.traversal());
		todolist.insert("Laundry");
		System.out.println("To-Do List = "+todolist.traversal());
		todolist.insert("Group Meeting");
		System.out.println("To-Do List = "+todolist.traversal());
		todolist.insert(0,"Submit Report");
		System.out.println("To-Do List = "+todolist.traversal());
		todolist.insert(1,"Buy Food");
		System.out.println("To-Do List = "+todolist.traversal());
		todolist.insert("Go to Gym");
		System.out.println("To-Do List = "+todolist.traversal());
		//-------------------------------
		todolist.remove();
		System.out.println("To-Do List = "+todolist.traversal());
		todolist.remove(3);
		System.out.println("To-Do List = "+todolist.traversal());
		todolist.remove(0);
		System.out.println("To-Do List = "+todolist.traversal());
		//--------------------------------
		
		System.out.println("To-Do List = "+todolist.backwardTraversal());
		//System.out.println("To-Do List = "+todolist.traversal());
		
		
	}
	
}
