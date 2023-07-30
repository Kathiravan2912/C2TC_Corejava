package day6;

public class Variable {
	static int a=0;
	static {
		 a=100;
	}
	void show() {
		System.out.println("the org value of A is:"+a);
		//System.out.println();
	}
}
