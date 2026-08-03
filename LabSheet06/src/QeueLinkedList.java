public class QeueLinkedList {

	// pointer of the front and rear node
	private Node front;
	private Node rear;

	// create an empty queue
	public QeueLinkedList() {
		front = null;
		rear = null;
	}

//เช็คว่ามีหัวเป็นค้าว่างไหม ถ้าใช่ แสดง true //o1
	public boolean isEmpty() {
		if (front == null) {
			return true;
		}
		return false;
	}

//วิธีเพิ่มข้อมูล
	public void enqueue(int value) {
		Node new_node = new Node(value); // สร้าง Node
		if (isEmpty() == true) {
			front = new_node;
			rear = new_node;
		} else {
			rear.next = new_node;
			rear = new_node;
		}
	}

//จะ peek อะไรก็ต้องเช็คก่อนว่ามีข้อมูลให้หยิบมาใช้ไหม ถ้ามีก็หยิบคิวก่อนหน้ามา
	public int peek() {
		if (isEmpty() == false) {
			return front.data;
		}
		return -1;
	}

//เราต้องการเอาข้อมูลออกแล้วก็จะตัดเยื่อใย ทีนี้ก็จะตัดเฉย ๆ ไม่ได้ 
	// ต้องมีตัวแบคอัพทั้ง node กับ data ไว้ด้วย temp
	// เพื่อที่เวลาตัดจะได้โละไปทั้งหมดได้เลย
	public int dequeue() {
		if(isEmpty()==false) {
			Node temp_node = front; //temp_node กับ front จะชี้ไปที่ node เดียวกันทั้งคู่//เป็นการแบคอัพ node
			int temp_data = temp_node.data; //แบคอัพข้อมูลใน node แรก
			
			front = front.next; //ขยับ front  ไปเรื่อย ๆ
			temp_node =null; //ลบออกจากหน่วยความจำ
			return temp_data; //ส่งข้อมูลตัวเลขกลับไป
			
			
			
			
			
		}

		return -1;
	}

}