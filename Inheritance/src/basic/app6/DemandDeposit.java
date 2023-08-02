package basic.app6;

public class DemandDeposit extends Bank {
	public String bank="karnataka bank";
	public DemandDeposit() {
		System.out.println("no args const in demand deposit");
	}
	public void account() {
		System.out.println("Bank Name:"+this.bank);
	}

}
