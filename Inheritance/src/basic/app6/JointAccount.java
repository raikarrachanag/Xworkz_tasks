package basic.app6;

public class JointAccount extends Bank{
	public String bank="SBI";
	public JointAccount() {
		System.out.println("no args const in Joint Account");
	}
	public void account() {
		System.out.println("bank name:"+this.bank);
	}
}
