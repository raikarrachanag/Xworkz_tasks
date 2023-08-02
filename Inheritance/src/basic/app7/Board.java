package basic.app7;

public class Board {
public String board;
	
	public Board() {
		System.out.println("no-arg const in Board");
	}
	public void teaches() {
		System.out.println("The board is:"+this.board);
	}
}
