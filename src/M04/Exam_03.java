package M04;
import java.util.*;
public class Exam_03 {

	public static void main(String[] args) {
		List aList = new ArrayList();
		aList.add(90);
		aList.add(100);
		aList.add(87);
		aList.add(79);
		aList.add(80);
		aList.add(98);
		System.out.println(aList);
		Collections.sort(aList); // 큰순서대로 정렬
		System.out.println(aList);
		
	}
}
