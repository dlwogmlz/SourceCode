import java.util.*;
public class Exam_01 {
	public static void main(String[] args) {
		// List<Integer> list = new ArrayList<Integer>();
		List list = new ArrayList();
		boolean bool = list.add(123);
		list.add(123);
		list.add("처음뵙겠습니다.");
		list.add("이재희라고합니다.");
		list.add("ㅋㅋㅋㅋㅋㅋㅋㅋ");
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------");
		
		for(Object aa : list) {
			System.out.println(aa);
		}
		System.out.println("-----------------");
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
