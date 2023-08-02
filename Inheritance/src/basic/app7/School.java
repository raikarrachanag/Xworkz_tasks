package basic.app7;

public class School extends Board {
	public String name="Jnana Jyothi";
	public School(){
		System.out.println("no-arg const in School");
	}
	
	public void educates(){
		System.out.println("Name of Primary School:"+this.name);
	}
}
