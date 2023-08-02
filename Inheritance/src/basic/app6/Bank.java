package basic.app6;

public class Bank {
	public String bank="Karnataka Bank";
	public Bank() {
		System.out.println("no args const in Bank");
	}
	public void account() {
		System.out.println("Bank name:"+this.bank);
	}
}
