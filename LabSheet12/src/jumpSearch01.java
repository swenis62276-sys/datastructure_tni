import java.util.Scanner;

public class jumpSearch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] nums = { 96, 87, 18, 6, 31, 11, 56, 36, 76 };
		nums = sorting(nums);

		// รับค่า target
		System.out.print("\n\nEnter target : ");
		int target = scan.nextInt();

		int index = jumpSearch(nums, target);

		if (index != -1) {
			System.out.println("The target (" + target + ") at index " + index);
		} else {
			System.err.println("Cannot found " + target + " in this array ");
		}
	}

	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums); // ส่งข้อมูลยังไม่เรียง
		sort.quickSort(); // เรียง
		nums = sort.getArray(); // เอามาใส่ nums

		System.out.print("Elements : ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		return nums;
	}

	public static int jumpSearch(int[] nums, int target) {
		int jump_size = (int) Math.floor(Math.sqrt(nums.length)); // Math.floorเป็นทศนิยม เลยแปลงเป็น (int)

		// เริ่มที่ 0
		int start = 0;
		int m = 0;

		// step 1
		while (m < nums.length) {
			if (target == nums[m]) { // เจอแล้ว return m ได้เลย
				return m;
			}
			if (target > nums[m]) { // โดดต่อเมื่อ....
				start = m;
				m = m + jump_size;

			} else {
				for (int i = start; i < m; i++) {
					if (target == nums[i]) {
						return i;
					}
				}
				return -1;
			}
		}
		if (m >= nums.length) {
			for (int i = start; i < nums.length; i++) {
				if (target == nums[i]) {
					return i;
				}
					
			}

		}return -1;
	}
}
