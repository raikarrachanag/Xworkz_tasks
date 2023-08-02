package basic.app7;

public class University extends Board{
	public String name="VTU";
	public University(){
		System.out.println("no-arg const in university");
	}
	
	public void educates(){
		System.out.println("University which JNNCE College Belong to:"+this.name);
	}
}
