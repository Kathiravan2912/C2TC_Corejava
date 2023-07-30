package day2;

public class nested {
public static void main(String args[]) {
	int i=35;
	int y=6;
	int z=(i%y);
	if(i%y==0) {
		System.out.println("yes "+z);
	}
	else if(i%y!=0) {
		System.out.println("no "+z);
	}
	else {
		System.out.println("else "+z);
	}
}
}
