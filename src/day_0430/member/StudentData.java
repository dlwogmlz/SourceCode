package day_0430.member;
import java.util.*;
// 정렬
public class StudentData {
	
	public void studentSort(List<Student> aList) {
		for(int i = 0; i < aList.size()-1; i++) {
			for(int j=i+1; j < aList.size(); j++) {
				Student st1 = aList.get(i);
				Student st2 = aList.get(j);
				
				if(st1.bun > st2.bun) {
					aList.set(i, st2);
					aList.set(j, st1);
				}
			}
		}
	}
}
