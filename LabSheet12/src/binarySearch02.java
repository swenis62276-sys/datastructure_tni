import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class binarySearch02 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // สร้าง LinkedList ที่มีตัวเลขสุ่ม 10 ตัว
        LinkedList<Integer> nums = random_initial();

        // แสดงข้อมูลใน LinkedList
        System.out.println("Elements : " + nums);

        // รับค่าที่ต้องการค้นหา
        System.out.print("Enter target: ");
        int target = scan.nextInt();

        // ค้นหา target
        int index = binarySearch(nums, target);


        // แสดงผล
        if (index != -1) {

            System.out.println("The target (" + target + ") at index " + index);

        } else {

            System.err.println("Cannot found " + target + " in this linked list");
        }

    }

	
	public static LinkedList<Integer> random_initial() {

        LinkedList<Integer> nums = new LinkedList<Integer>();

        Random rnd = new Random();

        while (nums.size() < 10) {

            nums.add(rnd.nextInt(100)); // random number between 0 and 99

        }

        return nums;
    }
	 public static int binarySearch(LinkedList<Integer> nums, int target) {

	        int low = 0;
	        int high = nums.size() - 1;

	        while (low <= high) {

	            int middle = (low + high) / 2;

	            if (nums.get(middle) == target) {

	                return middle;
	            }

	            if (target < nums.get(middle)) {

	                high = middle - 1;

	            } else {

	                low = middle + 1;
	            }
	        }

	        return -1;
	    }

}
