import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//เขียนคำสั่งประกาศตัวแปรอาร์เรย์ชื่อ nums เพื่อเก็บเลขจำนวนเต็ม 5 ตัว จากนั้นรับค่า เลขจำนวนเต็มทางคีย์บอร์ด เก็บไว้ในอาร์เรย์
		//nums และแสดงผลข้อมูลตัวเลขทั้งหมดในอาร์เรย์ โดยมีเครื่องหมาย comma คั่นตัวเลขแต่ละตัว
		Scanner s = new Scanner(System.in);
		int[] nums = new int[5];
				for (int i=0; i<nums.length;i++) {
					System.out.print("Enter number index "+i+": ");
					nums[i] = s.nextInt();
				}
				NumArrayController displayNum = new NumArrayController();
				displayNum.setNumbers(nums);
				displayNum.display("Display all element: ");
	}

}
