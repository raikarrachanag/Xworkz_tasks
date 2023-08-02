package basic.app6;

public class FixedDeposit extends Bank{
	public String bank="SBI";
	public FixedDeposit() {
		System.out.println("no args const in fixed deposit");
	}
	public void account() {
		System.out.println("Bank name:"+this.bank);
	}

}
