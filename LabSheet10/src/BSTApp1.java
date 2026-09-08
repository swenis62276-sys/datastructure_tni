
public class BSTApp1 {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);
/*ข้อ 3)เขียนคำสั่งแสดงผล Node ที่มีค่าน้อยที่สุด (จากการเรียกใช้ findMinimum()) และมีค่ามากที่สุด (จากการเรียกใช้ findMaximum())
		หลังแสดงต้นไม้จาก method ชื่อ simpleTree1() ตามตัวอย่างผลลัพธ์ด้านล่างน*/
		System.out.println("\nMinimum Node is : "+tree.findMinimum(tree.getRoot()).data);
		
		System.out.println("\nMaximum Node is : "+tree.findMaximum(tree.getRoot()).data);
		
/*ข้อ 5)เขียนคำสั่งสร้างตัวแปรชื่อ target เก็บเลขจำนวนเต็ม 1 ตัว และแสดงผลตามรูปแบบข้อความด้านล่างนี้
Is [target] in BST => [Result from findSpecificData()]*/
		int target =40;
		System.out.println("Is "+target+" in BST => "+tree.findSpecificData(target));
		
	
	/*ข้อ 7)
เขียนคำสั่งสร้างตัวแปรชื่อ delNode เก็บเลข 60 จากนั้นเรียกใช้ searchDeleteNode() พร้อมส่งค่าใน delNode ไปด้วย นำข้อมูล
ใน parent กับ deleteNode มาแสดงผล (พิจารณาว่าใน Class BinarySearchTree มี method ไหนที่สามารถนำ parent กับ
deleteNode มาแสดงผลได้บ้าง) ตามตัวอย่างผลลัพธ์ด้านล่างนี้*/
		int delNode = 60;
		tree.searchDeleteNode(delNode);
		System.out.println(tree.getParent().data);
		System.out.println(tree.getDeleteNode().data);

	
	/*ข้อ 9)
เขียนค าสั่งแสดงภาพต้นไม้ที่ถูกลบแล้ว ตามข้อมูลที่ก าหนดในตัวแปร delNode (จากข้อ 7) ก าหนดว่าการลบ Node ที่มี 2 Subtree
ให้ใช้วิธี Replace by the maximum in Left subtree*/
		tree.delete(delNode);
		tree.printTree(tree.getRoot(), 0);
}
	}
