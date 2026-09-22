import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class jumpSearch02 {

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
        int index = jumpSearch(nums, target);


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
	public static int jumpSearch(LinkedList<Integer> nums, int target) {

        int jump_size = (int) Math.floor(Math.sqrt(nums.size()));

        // เริ่มที่ 0
        int start = 0;
        int m = 0;

        // step 1
        while (m < nums.size()) {

            if (target == nums.get(m)) {
                return m;
            }

            if (target > nums.get(m)) {

                start = m;
                m = m + jump_size;

            } else {

                for (int i = start; i < m; i++) {

                    if (target == nums.get(i)) {
                        return i;
                    }
                }

                return -1;
            }
        }

        if (m >= nums.size()) {

            for (int i = start; i < nums.size(); i++) {

                if (target == nums.get(i)) {
                    return i;
                }
            }
        }

        return -1;
    }
}