package basic.app6;

public class SavingsAccount extends Bank {
	public String bank="Mysore Bank";
	public SavingsAccount() {
		System.out.println("no args const in saving account");
	}
	public void account() {
		System.out.println("Bank Name:"+this.bank);
	}
}
