package day1;

public class typecasting {
public static void main(String args[]) {
	System.out.println("widening");
	byte a=23;
	short b=a;
	int c=b;
	long d=c;
	float e=b;
	double f=c;
	System.out.println("value "+a);
	System.out.println("value "+b);
 
	System.out.println("value "+c);

	System.out.println("value "+d);

	System.out.println("value "+e);
	System.out.println("value "+f);
	System.out.println("narrowing");
	double x=22.45;
	float y=(float)x;
	int z=(int)x;
	System.out.println("value "+x);
	System.out.println("value "+y);
	System.out.println("value "+z);
	

}
}
