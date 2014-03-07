package classes;

import java.util.Date;

import exceptions.AccountsFullException;
import exceptions.WithdrawException;

public abstract class Client{
	// attributes
	private int id;
	private String name;
	private float balance;
	private Account[] accounts;
	protected float commition_rate = 0;
	protected float interest_rate = 0;

	// Constructors
	public Client(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		accounts = new Account[5];
	}

	// Getters/setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getBalance() {
		return balance;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	// Methods
	public void addAccount(Account newAccount) throws AccountsFullException {
		boolean successful = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = newAccount;
				successful = true;
				// TODO - log the action
				break;
			}
		}
		if (!successful) {
			// TODO - log failure;
		}

	}

	public Account getAccount(int index) {
		return accounts[index];
	}

	public void removeAccount(Account accountRemove) {
		boolean success = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].equals(accountRemove)) {
				balance += accounts[i].getBalance();
				accounts[i] = null;
				success = true;
			}
		}
		if (success) {
			// TODO - log successful operation
		} else {
			// TODO - log some error or something
		}
	}

	public void deposit(float amount) {
		balance += amount * (1 - commition_rate);
		// TODO - log
	}

	public void withdraw(float amount) throws WithdrawException {
		if (amount > balance){
			throw new WithdrawException("Not enough money", id, balance, amount);
		}
		balance -= amount * (1 + commition_rate);
		// TODO - log
	}

	public void autoUpdateAccounts() {
		for (Account acc : accounts) {
			if (acc != null) {
				float interest = acc.getBalance() * (interest_rate);
				acc.setBalance(acc.getBalance() + interest);
				Log log = new Log(new Date().getTime(), acc.getId(), "Accout " + acc.getId() + " was updated with " + interest, interest, "Account");
				Logger.log(log);
			}
		}
	}
	
	public float getFortune(){
		float sum = balance;
		for (Account acc:accounts){
			if (acc != null){
				sum += acc.getBalance();
			}
		}
		return sum;
	}
	
	public boolean equals(Client otherClient){
		return (id == otherClient.id) ? true : false;
	}
	
	public String toString(){
		return "ID - ";
	};
}
