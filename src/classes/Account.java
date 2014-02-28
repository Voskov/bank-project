package classes;

public class Account {
	//Attributes
	private int id;
	private float balance;
	private Logger logService;
	
	//constructor
	public Account(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}

	//getters-setters
	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
}
