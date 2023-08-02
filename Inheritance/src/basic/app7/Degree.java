package basic.app7;

public class Degree extends Board {
	public String name="JNNCE";
	public Degree(){
		System.out.println("no-arg const in Degree");
	}
	
	public void educates(){
		System.out.println("College name:"+this.name);
	}
}
