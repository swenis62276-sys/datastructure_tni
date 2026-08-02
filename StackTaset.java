
public class StackTaset {

	public static void main(String[] args) {
		StackArrayBased num_stack = new StackArrayBased(5);
		num_stack.push(15);
		num_stack.push(16);
		num_stack.push(17);
		//data in stack 15,16,17
		System.out.println("Pop stack"+num_stack.pop());
		System.out.println("Peek stack"+num_stack.peek());
		System.out.println("Pop stack"+num_stack.pop());
		System.out.println("Peek stack"+num_stack.peek());
		System.out.println("Pop stack"+num_stack.pop());
		System.out.println("Peek stack"+num_stack.peek());
		System.out.println("Pop stack"+num_stack.pop());
		System.out.println("Peek stack"+num_stack.peek());
		
	}

}
