
public class Ex04 {

	public static void main(String[] args) {
//ประกาศตัวแปรอาร์เรย์ชื่อ nums เก็บชุดตัวเลข คือ 23, 67, 8, 91, 45, 12, 78 ➔ เขียนคำสั่งลบข้อมูลตัวแรกของอาร์เรย์ออก โดย
//แสดงผลตั้งแต่ ชุดข้อมูลเดิม → ชุดข้อมูลที่ลบข้อมูลตัวแรกออกเรียบร้อยแล้ว
		NumArrayController nums = new NumArrayController();
		nums.display(" Display an initail dataset: ");
		int[] coppy_nums = new int[nums.getSize()-1];
		
		for (int i=0; i<coppy_nums.length;i++) {
			coppy_nums[i] = nums.getNumArray()[i+1];
		}
		nums.setNumbers(coppy_nums);
		nums.display("\n\nAfter deleted the first element: ");
	}

}
