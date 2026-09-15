import java.util.ArrayDeque;
import java.util.Deque;

public class Sorting {

	private int[] array;

	// write syntax to รับค่าจากที่อื่น
	public Sorting(int[] array) {
		this.array = array;
	}

	public void printSortedData() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// ----(+)
	public void bubbleSort() {
		for (int i = 0; i < array.length; i++) {// loop through all element
			// เพื่อให้ค่าเป็นจริง-เท็จ SET IS_SWAPPED IS FALSE
			boolean is_swapped = false;
			for (int j = 0; j < array.length - i - 1; j++) {// ทำให้มันลดลงไปเรื่อย ๆ ถ้า j เพิ่ม.. array
				// int current_index = j;
				if (array[j] > array[j + 1]) {
					// swapped the element of array[j] and array[j+1]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

					is_swapped = true;
				}
			}
			if (is_swapped == false) {
				break;
			}
		}
	}

	// ---
	public void bubbleSort(boolean order) {
		for (int i = 0; i < array.length; i++) {// loop through all element
			// เพื่อให้ค่าเป็นจริง-เท็จ SET IS_SWAPPED IS FALSE
			boolean is_swapped = false;
			// int current_index = j;
			for (int j = 0; j < array.length - i - 1; j++) {// ทำให้มันเพิ่มขึ้นไปเรื่อย ๆ ถ้า j เพิ่ม.. array
				// เพิ่มจากอันเมื่อกี้
				if (order == true) {
					if (array[j] < array[j + 1]) {

						// swapped the element of array[j] and array[j+1]
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;

						is_swapped = true;
					}
				}
				if (is_swapped == false) {
					break;
				}
			}
		}
	}

	// ----(+)
	public void selectionSort() {
		for (int i = 0; i < array.length; i++) {// loop through all element
			// int current_index = i;
			int minimum_index = i;
			for (int j = i; j < array.length; j++) {
// หาตำแหน่งที่น้อยที่สุด
				if (array[j] < array[minimum_index]) {
					minimum_index = j;
				}
			}
			// swap the element of array[i] and array[minimum_index]
			int temp = array[i];
			array[i] = array[minimum_index];
			array[minimum_index] = temp;
		}
	}

	// ----(+)
	public void insertionSort() {
		for (int i = 1; i < array.length; i++) {// loop through all element , start with 1
			int key = array[i];
			int walker_index = i - 1;
			// เข้า loop while ถ้า walker หลุดจาก array ยัง //เชตกรณีมากกว่า 
			while (walker_index >= 0 && array[walker_index] > key) {
				array[walker_index + 1] = array[walker_index];
				walker_index = walker_index - 1; // walker_index--;

			}
			//เอา  key ไปใส่ด้านขวาของ walker
			array[walker_index+1]=key;
		}
	}

	// ----(+)
	public void quicksort() {
		//ทำงานแบบหั่นครึ่ง O(nlog2n)
		//สร้าง empthy stak
		Deque<Integer> stack = new ArrayDeque<Integer>();
		//push last and first
		stack.push(array.length-1);
		stack.push(0);
		while (!stack.isEmpty()) {
			int low = stack.pop();
			int high = stack.pop();
			if (high-low <1) {
				continue;
			}
			//สร้างตัวแปรเพื่อเรียกใช้พาทิชั่นนนนนนน
			int j = partition(low, high);
			//ยัดใส่ stack ให้หมด
			stack.push(high);
			stack.push(j+1);
			stack.push(j);
			stack.push(low);
			
		}
	}

	// ----(-)
	private int partition(int low, int high) {
		
		int pivot =  array[low];
		int i = low;
		int j = high;
		while (true) { //ถ้า pivot>i ให้เดินไปทางขวา
			while(array[i]<pivot) {
				i++;
			}
			while (array[j]>pivot) {
				j--;
			}
			if (i>=j) {
				break;
			}
			// if i< j then swap[i]and[j]
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
			i++;
			j--;
		}
		return j;
	}

}
