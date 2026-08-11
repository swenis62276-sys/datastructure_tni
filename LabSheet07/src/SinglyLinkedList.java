class Node {
	public int  data;
	public Node next;
	
	public Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	public String displayList() {
		boolean first = true;
		String  display = "[";
		for (Node current = head; current != null; current = current.next) {
			display += (!first ? ", " : "") + current.data;
			first = false;
		}
		display += "]";
		return display;
	}
	
	public void clear() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
        
		return head == null;
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public Object get(int position) {
		if (position < 0 || isEmpty()) {
			return null;
	}
		Node current =head;
		int count = 0;
		while(current != null) {
			if (count == position) {
				return current.data;
			}
			current=current.next;
			count++;
		}
		return null;
	}		
						//ตำแหน่ง    //ค่าที่จะเปลี่ยน
		public boolean set(int position, int value) {
		    if (position < 0 || isEmpty()) {
		        return false;
		    }
		    
		    Node current = head;
		    int count = 0;
		    while (current != null) {
		        if (count == position) {
		            current.data = value; // เปลี่ยนค่าข้อมูลใน Node
		            return true;          
		        }
		        current = current.next;
		        count++;
		    }
		    return false; // หาตำแหน่งไม่เจอ (index เกินขนาด List)
		}
	
	public boolean contains(int value) {
		if(!isEmpty()) {
			Node current_node = head;
			while (current_node != null && current_node.data != value) {
				current_node = current_node.next;
			}
			if (current_node != null) {
				return true;
			}
		}
		return false;
	}
	
	public void addAll(SinglyLinkedList otherlist) {
		if (!isEmpty() && !otherlist.isEmpty()) {
			tail.next = otherlist.head;
			tail = otherlist.tail;
		}
	}
	
}

