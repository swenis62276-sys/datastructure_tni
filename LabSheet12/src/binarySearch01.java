import java.util.Scanner;

public class binarySearch01 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int[] nums = {96, 87, 18, 6, 31, 11, 56, 36, 76};
		nums = sorting(nums);
		
		//รับค่า target
		System.out.print("\n\nEnter target : ");
		int target = scan.nextInt();
		
		int index = binarySearch(nums, target);
		
		if(index != -1) {
			System.out.println("The target ("+target+") at index "+ index);
		}else{
			System.err.println("Cannot found "+target+" in this array ");
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
	
	public static int binarySearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		
		while (low <= high) {
			int middle = (low+high)/2;
			if (nums[middle] == target) {
				return middle;
			}
			if (target < nums[middle]) {
				high = middle - 1;
			}else {
				low = middle +1;
			}
		}
		
		return -1;
	}

}
