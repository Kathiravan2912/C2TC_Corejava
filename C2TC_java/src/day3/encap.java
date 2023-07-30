package day3;

public class encap{
	public String name;
	public String getName() {
	return name;
	}
	public String setName(String name) {
		return name;
	}
}
class Test{
	public static void main(String[] args) { 
			//int
		    encap ac = new encap();   
		    //ac.setAcno(987654);  
		    ac.setName("ak");  
		    //ac.setEmail("ak@gmail.com");  
		    //ac.setAmount(500);  
		    System.out.println(ac.getName());  
		}  
		}  


