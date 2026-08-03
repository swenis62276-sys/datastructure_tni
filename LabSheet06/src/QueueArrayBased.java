public class QueueArrayBased {

	// attributes in Queue Array-Based
	private int[] queue;
	private final int MAX_SIZE = 50;
	private int size;

	// create an empty queue with default capacity
	public QueueArrayBased() {
		queue = new int[MAX_SIZE];
		size = 0; // no element in queue
	}

	// create an empty queue with a specific capacity //o1
	public QueueArrayBased(int capacity) {
		queue = new int[capacity];
		size = 0; // no element in queue
	}

	public boolean isEmpty() {
		if (size == 0) {
		}
		return false;

	}

	// วิธีเช็คว่ามันเต็มไหม ด้วยการนำ size ไปเทียบกับ lengthหรือที่เรียกว่าขนาดของ //on1
	// max size
	public boolean isFull() {
		if (size == queue.length) {
			return true;
		}
		return false;
	}

	// เช็คว่าคิวเต็มไหมโดยใช้ is full //o1
	public boolean enqueue(int new_element) {
		if (isFull() == false) {
			queue[size] = new_element;
			size++;
		}
		return false;
	}

//ดึงข้อมูลมาจากตัวหน้าสุด ก่อนดึงมันต้องเช็คก่อนว่ามันมีข้อมูลให้ดึงไหม ถ้าไม่มีข้อมูลให้คืนค่า front //o1
	public int peek() {
		if (isEmpty() == false) {
			return queue[0]; // ถ้าไม่มีข้อมูลให้คืนค่า front
		}
		return -1; // ดึงข้อมูลมาจากตัวหน้าสุด
	}

//ดีคิว เอาไว้ใช้เมื่อต้องการ แสดงคิวถัดไปแล้วลบคิวข้างหน้า ก็คือถ้ามี 10 11 12 13 ถ้าใช้ดีคิว ผลก็จะออกมาว่าเป็น 10 แล้วก็ลบ 10 ออกไปจากสมการ
	//on
	public int dequeue() {
		if (isEmpty() == false) {
			int temp = queue[0];
			for (int i = 1; i < size; i++) {
				queue[i - 1] = queue[i];
			}
			size--;
			return temp;
		}
		return -1;
	}
}