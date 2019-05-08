package M04;
import java.util.*;
public class Exam_05 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Servlet");
		list.add("Oracle");
		list.add("Java");
		list.add("1234");
		list.add("JSP");
		
		if(list.size() == 0) {
			System.out.println("비어있음");
		}else {
			System.out.println(list);
		}
		
		if(list.isEmpty()) {
			System.out.println("비어있음");
		}else {
			System.out.println(list);
		}

	}

}
