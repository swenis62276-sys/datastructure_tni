import java.util.ArrayList;

public class Lab201 {

	public static void main(String[] args) {
		//เขียนโปรแกรมสร้าง ArrayList ชื่อ names สำหรับเก็บชื่อเล่นของนักเรียนในห้อง ซึ่งประกอบด้วย Alice, Emma, Leon และ John
		//จากนั้นแสดงผล ขนาดข้อมูล และ ข้อมูลทั้งหมดใน ArrayList

		ArrayList<String>namelist = new ArrayList<String>();
System.out.print("Length = "+ namelist.size());
		
namelist.add("Alice");
namelist.add("Emma");
namelist.add("Leon");
namelist.add("John");

System.out.print("Length = "+namelist.size());
System.out.print("\n"+namelist);
	}

}
