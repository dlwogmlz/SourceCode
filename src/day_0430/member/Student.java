package day_0430.member;

public class Student {
	int bun;
	String name;
	int score;

	public Student() {}
	public Student(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return s.bun == bun;
		}else {
			return false;
		}
	}
}
