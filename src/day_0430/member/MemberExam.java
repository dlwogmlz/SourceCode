package day_0430.member;
import java.util.*;

public class MemberExam {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		
		Member mem = new Member(1, "AAA", 30);
		list.add(mem);
		mem = new Member(5, "SSA", 33);
		list.add(mem);
		list.add(new Member(2, "bbb", 28));
		
		System.out.println("--------------");
		
		for(int i = 0; i < list.size(); i++) {
			Member member = list.get(i	);
			System.out.println(member);
		}
	
	}
}
