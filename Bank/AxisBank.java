package week2.Bank;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		
		System.out.println("AXIS Bank Deposit");
		
	}


public static void main(String[] args) {
	
	AxisBank OAB = new AxisBank();
	
	OAB.deposit();
	OAB.fixed();
	OAB.saving();
	
}
}
