import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) {
		//เขียนคำสั่งสร้างชุดข้อมูล 2 ตัว คือ
		//• ArrayList ชื่อ numbers และ
		//• อาร์เรย์ชื่อ initial_numbers เก็บค่าตัวเลข 10 ตัว ประกอบด้วย 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
		//เขียนโปรแกรมที่มีการดำเนินการ ดังต่อไปนี้
		//o นำตัวเลขทั้งหมดในอาร์เรย์initial_numbers เก็บไว้ใน ArrayList ที่สร้างในตอนแรก (numbers)
		//o รับค่าตัวเลขที่ต้องการเพิ่มเข้า numbers ➔ โดยเพิ่มต่อท้ายข้อมูลตัวสุดท้ายใน numbers
		//o รับค่าตัวเลขที่ต้องการเพิ่มเข้า numbers ➔ โดยแทรกเข้าไปใน numbers ที่ตำแหน่งตามเลขสุดท้ายของรหัสนักศึกษา
		//o ลบข้อมูลใน numbers ➔ โดยลบตำแหน่งตามเลขรองสุดท้ายของรหัสนักศึกษา
		//o อัปเดตตัวเลขใน numbers ➔ โดยตำแหน่งที่อัปเดตตามเลขก่อนรองสุดท้ายของรหัสนักศึกษา เป็นวันที่ ณ วันที่เรียน
		//o แสดงผลสุดท้าย ข้อมูลใน ArrayList ของนักศึกษา มีเลขอะไรบ้าง?

		//-*---------------------------------------------
		//o รับค่าตัวเลขที่ต้องการเพิ่มเข้า numbers ➔ โดยเพิ่มต่อท้ายข้อมูลตัวสุดท้ายใน numbers
		Scanner s = new Scanner(System.in);
		
		//• อาร์เรย์ชื่อ initial_numbers เก็บค่าตัวเลข 10 ตัว
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
		
		
		//• ArrayList ชื่อ numbers 
		//o นำตัวเลขทั้งหมดในอาร์เรย์initial_numbers เก็บไว้ใน ArrayList ที่สร้างในตอนแรก (numbers)
		ArrayList<Integer>numbers = new ArrayList<Integer>(initial_numbers);
		
		int nb = s.nextInt();
		
		
	}

}
