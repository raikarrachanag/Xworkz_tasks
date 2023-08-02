package basic.app6;

public class SalaryAccount extends Bank{
	public String bank="Canara Bank";
	public SalaryAccount() {
		System.out.println("no args const in Salary Account");
	}
	public void account() {
		System.out.println("bank Name:"+this.bank);
	}
}
