import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		List aList = new ArrayList();
		List bList = new Vector();
		List cList = new LinkedList();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		System.out.println(aList);
		aList.add(1, 100);
		aList.add(2, 200);
		System.out.println(aList);
		
		int row = aList.indexOf(30);
		System.out.println(row);
		System.out.println(aList.get(row));
	}
}
