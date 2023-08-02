package basic.app7;

public class CentralBoard extends Board{
	public String name="CBSE";
	public CentralBoard(){
		System.out.println("no-arg const in central board");
	}
	
	public void educates(){
		System.out.println("name of syllabus:"+this.name);
	}
}
