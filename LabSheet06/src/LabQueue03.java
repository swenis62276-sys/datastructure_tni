import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class LabQueue03 {

	public static void main(String[] args) {
		Queue<Integer> q_number = new ArrayDeque<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("Before reverse => " + q_number);
		reverse(q_number);
		System.out.println("After  reverse => " + q_number); // expected result: [50, 40, 30, 20, 10]
	}

	public static void reverse(Queue<Integer> queue) {
		Deque<Integer> stack = new ArrayDeque<Integer>();

		//ขียนโปรแกรมแสดงลำดับในคิวแบบย้อนกลับ โดยเขียนคำสั่งการย้อนกลับลำดับของคิวใน reverse() ด้วยหลักการของ Queue (โดยใช้
		// Queue<Integer>) และ Stack (โดยใช้ Deque<Integer>) โดยมีเงื่อนไขดังนี้
		// • ใน reverse() ให้พารามิเตอร์ Queue<Integer> รับข้อมูลเริ่มต้น
		// (ลำดับดั้งเดิม)
		// • ใช้ Deque<Integer> (แบบ Stack) ดึงข้อมูลจาก Queue ใส่ Stack ทีละตัว
		// • ดึงข้อมูลจาก Stack กลับมาใส่ Queue เดิมอีกครั้ง
		// write your code below here
		while (!queue.isEmpty()) {
			stack.push(queue.poll());
			}
		while (!stack.isEmpty()) {
				queue.add(stack.pop());
		}
			
		}	
		}
		

	

