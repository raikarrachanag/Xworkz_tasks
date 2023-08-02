package basic.app7;

public class HighSchool extends Board{
	public String name="Navachethana High School";
	public HighSchool(){
		System.out.println("no-arg const in High school");
	}
	
	public void educates(){
		System.out.println("High School name is:"+this.name);
	}
}
