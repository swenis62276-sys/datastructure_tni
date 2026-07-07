
public class Ex03 {

	public static void main(String[] args) {
// ประกาศตัวแปรอาร์เรย์ชื่อ nums เก็บชุดตัวเลข คือ 23, 67, 8, 91, 45, 12, 78 ➔ เขียนคำสั่งเพิ่มเลข 15 เข้าไปในอาร์เรย์ชุดนี้โดย
//แสดงลำดับการเพิ่มข้อมูล ตั้งแต่ ชุดข้อมูลเดิม → ชุดข้อมูลที่เพิ่มขนาดอาร์เรย์มา 1 ตำแหน่ง → ข้อมูลใหม่ (เลข 15) ที่เพิ่มเข้าอาร์เรย
		NumArrayController nums = new NumArrayController();
		nums.display(" Display an initail dataset: ");

		int[] coppy_nums = new int[nums.getSize()+1];
// coppy data to 'nums'
		for (int i=0; i<nums.getSize();i++) {
			coppy_nums[i] = nums.getNumArray()[i];
	
		}
//อัพเดทข้อมูลให้เพิ่มมาอีก 1 ช่อง
		nums.setNumbers(coppy_nums);
		nums.display("\n\n After add 1 element size: ");
		// ตัวเลขทั้งก้อน        ตำแหน่ง
		nums.getNumArray()[nums.getSize()-1] = 15;
		
		nums.display("\n\nAfter added 15");
	}

}
