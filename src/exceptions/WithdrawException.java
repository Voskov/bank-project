package exceptions;

public class WithdrawException extends Exception{
	private int id;
	private float currentBalance;
	private float withdrawAmount;
	
	
	public WithdrawException(String msg, int id, float currentBalance, float withdrawAmount) {
		this.id = id;
		this.currentBalance = currentBalance;
		this.withdrawAmount = withdrawAmount;
	}


	public int getId() {
		return id;
	}


	public float getCurrentBalance() {
		return currentBalance;
	}


	public float getWithdrawAmount() {
		return withdrawAmount;
	}
	
	
	
}
