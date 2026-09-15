
public class TestApp {

	public static void main(String[] args) {
		int[] nums = { 11, 9, 23, 87, 38, 22, 92, 10 };
//น้อยไปมาก		
		// create obj to use the Sorting
		Sorting s = new Sorting(nums);

		// call obj
		s.bubbleSort();
		s.printSortedData();

//-----------		
//มากไปน้อย
		System.out.println();
		// create obj to use the Sorting
		Sorting s1 = new Sorting(nums);

		// call obj
		s1.bubbleSort(true);
		s1.printSortedData();
//---------------
		// 02
		System.out.println();
		int[] num2 = {25, 11, 45, 6, 87, 20, 78, 64};
		Sorting s2 = new Sorting(num2);
		s2.selectionSort();
		s2.printSortedData();

		// 04

		System.out.println();
		int[] num4 = { 68, 10, 87, 75, 14, 36, 98, 76 };
		Sorting s4 = new Sorting(num4);
		s4.insertionSort();
		s4.printSortedData();

		// 06
		System.out.println();
		int[] num5 = { 87, 11, 26, 35, 49, 85, 21, 46 };
		Sorting s5 = new Sorting(num5);
		s5.quicksort();
		s5.printSortedData();

	}

}
