import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//เขียนโปรแกรมสร้าง ArrayList เก็บข้อมูลเป็นเลขจำนวนเต็ม เพื่อแสดงข้อมูลและดำเนินการ ดังนี้
		//• แสดงขนาดข้อมูลใน ArrayList
		//• เพิ่มข้อมูลใน ArrayList คือ 11, 12, 13, 14, 15
		//• แสดงขนาดข้อมูลใน ArrayList
		//• แสดงข้อมูลทั้งหมดใน ArrayList
		//• อัปเดตข้อมูลในอาร์เรย์ โดยรับค่า ตำแหน่ง และ ตัวเลข ที่ต้องการอัปเดต ➔ แสดงข้อมูลทั้งหมดใน ArrayList
		//• ลบข้อมูลในอาร์เรย์ โดยรับค่า ตำแหน่งที่ต้องการลบ ➔ แสดงข้อมูลทั้งหมดใน ArrayList
		//• ลบข้อมูลในอาร์เรย์ โดยรับค่า ข้อมูลที่ต้องการลบ ➔ แสดงข้อมูลทั้งหมดใน ArrayList
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer>numlist = new ArrayList<Integer>();
		System.out.print("Length = "+ numlist.size());
		
		numlist.add(11);
		numlist.add(12);
		numlist.add(13);
		numlist.add(14);
		numlist.add(15);
		
		System.out.print("Length = "+numlist.size());
		System.out.print(numlist);
		
		System.out.print("\nEnter index to update: ");
		int index_update = s.nextInt();
		System.out.print("\nEter element to update: ");
		int element_update = s.nextInt();
		
		numlist.set(index_update, element_update);
		System.out.print(numlist);
		
		System.out.print("\nEnter index to remove: ");
		int index_remove = s.nextInt();
		numlist.remove(index_remove);
		System.out.print(numlist);
		
		System.out.print("\nEnter element to remove: ");
		int element_remove = s.nextInt();
		numlist.remove(Integer.valueOf(element_remove));
		
		
		System.out.print(numlist);
		
		
	}

}
