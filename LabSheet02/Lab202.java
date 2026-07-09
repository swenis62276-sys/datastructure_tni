import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) {
		
		
		//เขียนคำสั่งสร้างชุดข้อมูล 2 ตัว คือ
		// ArrayList ชื่อ numbers และ และ
		// อาร์เรย์ชื่อ initial_numbers เก็บค่าตัวเลข 10 ตัว ประกอบด้วย 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
		// เขียนโปรแกรมที่มีการดำเนินการ ดังต่อไปนี้
		// นำตัวเลขทั้งหมดในอาร์เรย์initial_numbers เก็บไว้ใน ArrayList ที่สร้างในตอนแรก (numbers)
		// รับค่าตัวเลขที่ต้องการเพิ่มเข้า numbers ➔ โดยเพิ่มต่อท้ายข้อมูลตัวสุดท้ายใน numbers
		// รับค่าตัวเลขที่ต้องการเพิ่มเข้า numbers ➔ โดยแทรกเข้าไปใน numbers ที่ตำแหน่งตามเลขสุดท้ายของรหัสนักศึกษา
		// ลบข้อมูลใน numbers ➔ โดยลบตำแหน่งตามเลขรองสุดท้ายของรหัสนักศึกษา
		// อัปเดตตัวเลขใน numbers ➔ โดยตำแหน่งที่อัปเดตตามเลขก่อนรองสุดท้ายของรหัสนักศึกษา เป็นวันที่ ณ วันที่เรียน
		// แสดงผลสุดท้าย ข้อมูลใน ArrayList ของนักศึกษา มีเลขอะไรบ้าง?
		//-*---------------------------------------------
		
		// รับค่าตัวเลขที่ต้องการเพิ่มเข้า numbers ➔ โดยเพิ่มต่อท้ายข้อมูลตัวสุดท้ายใน numbers
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer>initial_numbers = new ArrayList<Integer>();
		initial_numbers.add(10);
		initial_numbers.add(11);
		initial_numbers.add(12);
		initial_numbers.add(13);
		initial_numbers.add(14);
		initial_numbers.add(15);
		initial_numbers.add(16);
		initial_numbers.add(17);
		initial_numbers.add(18);
		initial_numbers.add(19);
		
		
		
		ArrayList<Integer>numbers = new ArrayList<Integer>(initial_numbers);
		
		System.out.print("ใส่ตัวเลขตัวแรกที่ต้องการจะต่อท้าย: ");
		int nb = s.nextInt();
		
		numbers.add(nb);
		
		
		System.out.println("ข้อมูลเริ่มต้นใน numbers: " + nb);
		System.out.println("ข้อมูลเริ่มต้น: " + numbers);

		                
		
		System.out.print("กรุณากรอกตัวเลขที่ต้องการเพิ่ม: ");
		int newNumber = s.nextInt();
		                
		
		System.out.print("กรุณากรอกตัวเลขท้ายรหัสนักศึกษา (เพื่อใช้เป็น Index): ");
		int studentIdLastDigit = s.nextInt();

		
		if (studentIdLastDigit >= 0 && studentIdLastDigit <= numbers.size()) {
		    
		    numbers.add(studentIdLastDigit, newNumber);
		    System.out.println("ข้อมูลล่าสุดหลังแทรกที่ Index " + studentIdLastDigit + ": " + numbers);
		} 
		else {
		    System.out.println("ข้อผิดพลาด: ตำแหน่งตัวเลขท้ายรหัสเกินขอบเขตของข้อมูลที่มีอยู่!");
		}
		
		System.out.println("\n------------------------------------------------");
		
		
		System.out.print("กรุณากรอกรหัสนักศึกษาแบบเต็ม (เช่น 66012345): ");
		String studentId = s.next();
		
		
		System.out.print("กรุณากรอกวันที่เรียนวันนี้ (เช่น วันที่ 9 ใส่เลข 9): ");
		int studyDate = s.nextInt();
		
		if (studentId.length() >= 3) {
			
			int secondFromLast = Character.getNumericValue(studentId.charAt(studentId.length() - 2));
			
			int thirdFromLast = Character.getNumericValue(studentId.charAt(studentId.length() - 3));
			
			System.out.println("-> เลขรองสุดท้ายที่ใช้ลบ คือ Index: " + secondFromLast);
			System.out.println("-> เลขก่อนรองสุดท้ายที่ใช้อัปเดต คือ Index: " + thirdFromLast);
			
			if (secondFromLast >= 0 && secondFromLast < numbers.size()) {
				numbers.remove(secondFromLast);
				System.out.println("ผลลัพธ์หลังลบข้อมูลที่ Index " + secondFromLast + ": " + numbers);
			} else {
				System.out.println("ไม่สามารถลบได้: Index " + secondFromLast + " เกินขอบเขตของข้อมูล");
			}
			
			if (thirdFromLast >= 0 && thirdFromLast < numbers.size()) {
				numbers.set(thirdFromLast, studyDate);
				System.out.println("ผลลัพธ์หลังอัปเดตข้อมูลที่ Index " + thirdFromLast + " เป็นวันที่ " + studyDate + ": " + numbers);
			} else {
				System.out.println("ไม่สามารถอัปเดตได้: Index " + thirdFromLast + " เกินขอบเขตของข้อมูล");
			}
			
			System.out.println("\n♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
			System.out.println("แสดงผลสุดท้าย ข้อมูลใน ArrayList ของนักศึกษาคือ: " + numbers);
			System.out.println("♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
			
		} else {
			System.out.println("ข้อผิดพลาด: รหัสนักศึกษาที่กรอกสั้นเกินไป ไม่สามารถคำนวณตำแหน่งได้");
		}
		
		s.close();
	}
}