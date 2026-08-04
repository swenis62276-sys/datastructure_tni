import java.util.ArrayDeque;
import java.util.Queue;

public class LabQueue01 {
	public static void main(String[] args) {
		Queue<Integer> q_num = new ArrayDeque<Integer>();

		for (int i = 101; i < 105; i++) {
			q_num.add(i);
			System.out.println("Enqueue : " + 1);

		}
		System.out.println("Queue => " + q_num);

		System.out.println();

		while (q_num.isEmpty() == false) {
			System.out.println("Calling number: " + q_num.peek());
			System.out.println("Poviding service number: " + q_num.poll());
		}
		System.out.println("Queue => " + q_num);
	}
}
