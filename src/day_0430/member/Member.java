package day_0430.member;

public class Member {
	private int idx; // 멤버필드, 멤버변수
	private String name;
	private int age;
	
	public Member() {}
	public Member(int idx, String name, int age) {
		this.idx=idx;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return idx + "\t" + name + "\t" + age;
	}
	
}
