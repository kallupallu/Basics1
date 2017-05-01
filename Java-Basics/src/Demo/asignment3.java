package Demo;
public class asignment3 {
	String a;
	public void changingvalue(String a){		
		
		System.out.println("you have entered your name as  -  " + a);
		
	}
	public String changingvalue2(String a){
		
		return a;
	}
	public static void main(String[] args) {
		
		asignment3 changval = new  asignment3();
		
		changval.changingvalue("sham");
		
		System.out.println("you have entered your name as - " + changval.changingvalue2("Ram"));
	}
}
