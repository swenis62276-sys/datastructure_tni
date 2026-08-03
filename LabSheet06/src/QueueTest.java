
public class QueueTest {

	public static void main(String[] args) {
		QeueLinkedList queue = new QeueLinkedList();
		//สร้าง object
		//QueueArrayBased queue = new QueueArrayBased();
		
		//เพิ่มข้อมูลลงไป
		queue.enqueue(10);
		queue.enqueue(11);
		
		//สั่งให้แสดง output
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());

	}

}
