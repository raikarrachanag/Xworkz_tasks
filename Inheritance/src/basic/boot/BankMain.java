package basic.boot;

import basic.app6.Bank;
import basic.app6.DemandDeposit;
import basic.app6.FixedDeposit;
import basic.app6.GeneralAccount;
import basic.app6.JointAccount;
import basic.app6.SalaryAccount;
import basic.app6.SavingsAccount;

public class BankMain {
	public static void main(String[] args) {
		
    System.out.println("Invoking main in Bank");
	
	Bank bank=new Bank();
	System.out.println(bank.bank);
	bank.account();
	System.out.println("__________________________________");
	
	Bank bank1=new SavingsAccount();
	SavingsAccount sa=new SavingsAccount();
	System.out.println(bank1.bank);
	bank1.account();
	System.out.println(sa.bank);
	sa.account();
	System.out.println("_____________________________");
	
	Bank bank2=new SalaryAccount();
	SalaryAccount sa1=new SalaryAccount();
	System.out.println(bank2.bank);
	bank2.account();
	System.out.println(sa1.bank);
	sa1.account();
	System.out.println("_____________________________");
	
	Bank bank3=new DemandDeposit();
	DemandDeposit dd=new DemandDeposit();
	System.out.println(bank3.bank);
	bank3.account();
	System.out.println(dd.bank);
	dd.account();
	System.out.println("_____________________________");
	
	Bank bank4=new FixedDeposit();
	FixedDeposit fd=new FixedDeposit();
	System.out.println(bank4.bank);
	bank4.account();
	System.out.println(fd.bank);
	fd.account();
	System.out.println("_____________________________");
	
	Bank bank5=new GeneralAccount();
	GeneralAccount ga=new GeneralAccount();
	System.out.println(bank5.bank);
	bank5.account();
	System.out.println(ga.bank);
	ga.account();
	System.out.println("_____________________________");
	
	Bank bank6=new JointAccount();
	JointAccount ja=new JointAccount();
	System.out.println(bank6.bank);
	bank6.account();
	System.out.println(ja.bank);
	ja.account();
	System.out.println("_____________________________");
	
	}
}
