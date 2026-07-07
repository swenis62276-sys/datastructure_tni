
public class Ex06 {

	public static void main(String[] args) {
		// ประกาศตัวแปรอาร์เรย์ชื่อ nums เก็บชุดตัวเลข คือ 23, 67, 8, 91, 45, 12, 78 ➔ เขียนคำสั่งลบข้อมูลตำแหน่งที่ 2 ของอาร์เรย์ออก
		//โดยแสดงผลตั้งแต่ ชุดข้อมูลเดิม → ชุดข้อมูลที่ลบข้อมูลตำแหน่งที่ 2 ออกเรียบร้อยแล้ว
		NumArrayController nums = new NumArrayController();
		nums.display(" Display an initail dataset: ");
		int[] coppy_nums = new int[nums.getSize()-1];
	
		//ลูปแรกเอาแค่ 23 และ 67 ก็คือ อินเด้ก 0 และ1
		
		for (int i=0; i<2; i++) {
			coppy_nums[i]=nums.getNumArray()[i];
		}	
		//ลูปที่สอง จะเอาตั้งแต่ 91 45 12 78 ก็คือ อินเด้ก 3 4 5 6 ให้ อินเด้ก 2 3 4 5
		for (int i=2+1;i<nums.getSize();i++) {
			coppy_nums[i-1] = nums.getNumArray()[i];
		}
		nums.setNumbers(coppy_nums);
		nums.display("\n\nAfter deleted data in dex 2: ");
		

	}

}
