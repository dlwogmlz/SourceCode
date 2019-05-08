package M04;

import java.util.*;

public class Exam_06 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Servlet");
		list.add("Servlet");
		list.add("Oracle");
		list.add("Java");
		list.add("1234");
		list.add("JSP");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("4321");
		list2.addAll(list);
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list.equals(list2));
		
		List list3 = list;
		System.out.println(list.equals(list3));
		
		System.out.println(list.contains("Servlet")); // true
		System.out.println(list.indexOf("Servlet"));
		System.out.println(list2.indexOf("4321"));
		System.out.println(list.size());
		System.out.println("------------------------");
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals("Servlet")) {
				System.out.println(list.get(i));
			}
		}
		System.out.println("------------------------");
		List list4 = list.subList(1	, 5); // 1~5번째자리까지
		System.out.println(list4);
	}
}
