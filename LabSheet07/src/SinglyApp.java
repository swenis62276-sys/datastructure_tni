import java.util.Scanner;

public class SinglyApp {

	public static SinglyLinkedList list1 = new SinglyLinkedList();
	public static SinglyLinkedList list2 = new SinglyLinkedList();
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Test method 'append()'\n----------------------");
		testAppend();
		
		System.out.println("\nTest method 'get()'\n-------------------");
		testGet();            
		
		System.out.println("\nTest method 'set()'\n-------------------");
		testSet();            
		
		System.out.println("\nTest method 'contains()'\n-----------------------");
		testContains();       
		
		System.out.println("\nTest method 'addAll()'\n---------------------");
		testAddAll();         

	}

	public static void testAppend() {
		for(int i =101;i<=105;i++) {
			list1.append(i);
		}
		System.out.println("Current List =>"+ list1.displayList());
	}

	public static void testGet() {
		int a =2;
		int b= 7;
		
		// ดึงข้อมูล
        Object aa = list1.get(a);
        System.out.println("get element index "+a+ " = "+(aa != null ? aa :" no data"));

        // ดึงข้อมูล
        Object bb = list1.get(b);
        System.out.println("get element index "+b+ " = "+(bb != null ? bb :" no data"));
	}

	public static void testSet() {
		System.out.println("Update Success !!!");
		list1.set(2, 111);
		System.out.println("Current List =>"+list1.displayList());
		list1.set(7, 222);
		System.out.println("Update Fail...");
		System.out.println("Current List =>"+list1.displayList());
		
	}

	public static void testContains() {
		int file1 = 104;
        int file2  = 222;
        if(list1.contains(file1)) {
        	System.out.println(" found !!");
        }else {
        	System.out.println(" not found...");
        }
        if(list1.contains(file2)) {
        	System.out.println(" found !!");
        }else {
        	System.out.println(" not found...");
        }
        
	}

	public static void testAddAll() {
		//tase case 1
		System.out.println("Elements in list1 =>"+list1.displayList());
		System.out.println("Elements in list2 =>"+list2.displayList());
		list1.addAll(list2);
		System.out.println("Merge result =>"+list1.displayList());
		
		//tase case 2
		System.out.println();
		for(int i=201;i<206;i++) {
			list2.append(i);
		}
		System.out.println("Elements in list1 =>"+list1.displayList());
		System.out.println("Elements in list2 =>"+list2.displayList());
		list1.addAll(list2);
		System.out.println("Merge result =>"+list1.displayList());
		}
	}

