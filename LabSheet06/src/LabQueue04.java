import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue04 {
	public static Queue<String> q_printer = new ArrayDeque<String>();
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Press 1 Add a file to the queue");
		System.out.println("Press 2 View the file");
		System.out.println("Press 3 Print the file");

		while (true) {
			System.out.print("\nEnter an option: ");
			int option = input.nextInt();
			if (option == 1) {
				addFile();
			} else if (option == 2) {
				viewNextFile();
			} else if (option == 3) {
				printFile();
			} else {
				System.out.println("Exit");
				break;
			}
		}
	}
	// เขียนโปรแกรมจำลองคิวพิมพ์เอกสาร (Printer) ประกอบด้วยการทำงาน คือ
	// การเพิ่มไฟล์สำหรับคิว, การดูคิวไฟล์ถัดไป และ การพิมพ์
	// ไฟล์ในคิว โดยแบ่งการทำงานตาม Method ดังนี้

	// addFile()
	// • รับชื่อไฟล์ที่ต้องการเพิ่มในคิวทางคีย์บอร์ด
	// • เพิ่มไฟล์ดังกล่าวในคิว (q_printer)
	// • แสดงผลรายการไฟล์ทั้งหมดในคิว

	// viewNextFile()
	// • ถ้ามีไฟล์สำหรับพิมพ์ในคิว ให้แสดงชื่อไฟล์ถัดไป (ไม่ต้องนำไฟล์ออกจากคิว) และ
	// แสดงผลรายการในไฟล์ทั้งหมดในคิว
	// • ถ้าไม่มีไฟล์สำหรับพิมพ์ในคิว ให้แสดงผลว่า “No file in queue”

	// printFile()
	// • ถ้ามีไฟล์สำหรับพิมพ์ในคิว ให้แสดงชื่อไฟล์สำหรับพิมพ์ (นำไฟล์ออกจากคิว) และ
	// แสดงรายการในไฟล์ทั้งหมดในคิว
	// • ถ้าไม่มีไฟล์สำหรับพิมพ์ในคิว ให้แสดงผลว่า “No file in queue”

	public static void addFile() {
		// write your code below here
		System.out.println("Enter your file name : ");
		// • รับชื่อไฟล์ที่ต้องการเพิ่มในคิวทางคีย์บอร์ด
		String af = input.next();
		// • แสดงผลรายการไฟล์ทั้งหมดในคิว

		q_printer.add(af);

		System.out.println(q_printer);
	}

	public static void viewNextFile() {

		// viewNextFile()
		// • ถ้ามีไฟล์สำหรับพิมพ์ในคิว ให้แสดงชื่อไฟล์ถัดไป (ไม่ต้องนำไฟล์ออกจากคิว) และ
		// แสดงผลรายการในไฟล์ทั้งหมดในคิว
		// • ถ้าไม่มีไฟล์สำหรับพิมพ์ในคิว ให้แสดงผลว่า “No file in queue”
		// write your code below here
		if (!q_printer.isEmpty()) {
			System.out.println("View : " + q_printer.peek());
			System.out.println(q_printer);
		} else {
			System.out.println("No file in queue");
		}
	}

	public static void printFile() {
		// write your code below here
		//printFile()
		//• ถ้ามีไฟล์สำหรับพิมพ์ในคิว ให้แสดงชื่อไฟล์สำหรับพิมพ์ (นำไฟล์ออกจากคิว) และ แสดงรายการในไฟล์ทั้งหมดในคิว
		//• ถ้าไม่มีไฟล์สำหรับพิมพ์ในคิว ให้แสดงผลว่า “No file in queue”
		if (!q_printer.isEmpty()) {
			System.out.println(q_printer.poll());
			if (!q_printer.isEmpty()) {
				System.out.println(q_printer);}
			else{
				System.out.println("No file in queue");
			}
		}else {
			System.out.println("No file in queue");
		}

	}

}