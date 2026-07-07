
public class Ex01 {

	public static void main(String[] args) {
		// เขียนคำสั่งประกาศตัวแปรอาร์เรย์ชื่อ nums เก็บชุดตัวเลข คือ 23, 67, 8, 91, 45, 12, 78 นำมาแสดงผล
		//• ขนาดข้อมูลของอาร์เรย์ nums
		//• ข้อมูลตัวแรกของอาร์เรย์ nums
		//• ข้อมูลตัวสุดท้ายของอาร์เรย์ nums
		//• ข้อมูลตัวที่อยู่ตรงกลางของอาร์เรย์ nums
		//• แสดงข้อมูลตัวเลขทั้งหมดในอาร์เรย์ โดยมีเครื่องหมาย comma คั่นตัวเลขแต่ละตัว

		int[] nums = {23, 67, 8, 91, 45, 12, 78};
		System.out.println("Length = "+nums.length);
		System.out.println("First = "+nums[0]);
		System.out.println("Last = "+nums[nums.length-1]);
		System.out.println("Middle = "+nums[nums.length/2]);
		
		System.out.println("Display all elements: ");
		for (int i=0; i<nums.length;i++) {
			if(i !=0) {
				System.out.print(", ");
			}
		System.out.print(nums[i]);}
	}

}
