package T00;
import java.util.*;

class AAA {
	private int a;
	int b;
	
	public AAA() {}
	public AAA(int a, int b) {
		this.a=a;
		this.b=b;
	}
	@Override
	public String toString() {
		return a + "\t" + b;
		
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
public class Exam_04 {
	public static void main(String[] args) {
		List<AAA> aList = new ArrayList<AAA>();
		AAA a1 = new AAA(0, 20);
		aList.add(a1);
		aList.add(new AAA(1, 100));
		aList.add(new AAA(2, 200));
		aList.add(new AAA(3, 300));
		aList.add(new AAA(4, 400));
		aList.add(new AAA(5, 500));
		System.out.println(aList);
		System.out.println(aList.get(0).getA());
	}
}
