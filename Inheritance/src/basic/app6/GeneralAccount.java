package basic.app6;

public class GeneralAccount extends Bank{
	public String bank="Pragathi Gramin Bank";
	public GeneralAccount() {
		System.out.println("no args const in general Account");
	}
	public void account() {
		System.out.println("Bank name:"+this.bank);
	}

}
