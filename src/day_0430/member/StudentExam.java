package day_0430.member;
import java.util.*;
public class StudentExam {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student(7, "AAA", 20));
		sList.add(new Student(4, "BBB", 30));
		sList.add(new Student(3, "CCC", 40));
		sList.add(new Student(9, "DDD", 50));
		sList.add(new Student(5, "EEE", 60));
		
		System.out.println("---------Student List----------");
		System.out.println("번호\t이름\t점수");
		
		for(Student stu : sList) {
			System.out.print(stu.bun + "\t");
			System.out.print(stu.name + "\t");
			System.out.print(stu.score + "\n");
		}
		
		StudentData sData = new StudentData();
		sData.studentSort(sList);
		System.out.println("----- Student List 번호순 Sort -----");
		System.out.println("번호\t이름\t점수");
		
		for(Student stu : sList) {
			System.out.print(stu.bun + "\t");
			System.out.print(stu.name + "\t");
			System.out.print(stu.score + "\n");
		}
	}
}
