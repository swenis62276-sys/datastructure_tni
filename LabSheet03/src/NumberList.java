
public class NumberList {

	public static void main(String[] args) {
		LinkedList  numlist = new LinkedList();
		
		numlist.insert(0, 37);
		numlist.insert(0, 7);
		numlist.insert(0, 4);
		numlist.insert(0, 16);

		
		System.out.println(numlist.traversal());
		numlist.insert(2, 20);
		System.out.println(numlist.traversal());
		numlist.insert(25);
		System.out.println(numlist.traversal());
		numlist.remove(1);
		System.out.println(numlist.traversal());
		numlist.removeLastelement();
		System.out.println(numlist.traversal());
	}

}
