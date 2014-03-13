package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

import exceptions.AccountsFullException;
import exceptions.WithdrawException;

public abstract class Client {
	// attributes
	private int id;
	private String name;
	private float balance;
	private ArrayList<Account> accounts;
	protected float commition_rate = 0;
	protected float interest_rate = 0;

	// Constructors
	public Client(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		accounts = new ArrayList<>();
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

	public ArrayList<Account> getAccounts() {
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
		try {
			accounts.add(newAccount);
		} catch (RuntimeException e) {
			System.out.println("Count not add account " + newAccount.getId());
			System.out.println(e.getMessage());
		}
	}

	public void removeAccount(Account accountRemove) {
		try {
			accounts.remove(accountRemove);
		} catch (RuntimeException e) {
			System.out.println("Count not remove account " + accountRemove.getId());
			System.out.println(e.getMessage());
		}
	}

	public void deposit(float amount) {
		balance += amount * (1 - commition_rate);
		// TODO - log
	}

	public void withdraw(float amount) throws WithdrawException {
		if (amount > balance) {
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
				Log log = new Log(new Date().getTime(), acc.getId(), "Accout "
						+ acc.getId() + " was updated with " + interest,
						interest, "Account");
				Logger.log(log);
			}
		}
	}

	public float getFortune() {
		float sum = balance;
		for (Account acc : accounts) {
			if (acc != null) {
				sum += acc.getBalance();
			}
		}
		return sum;
	}

	public boolean equals(Client otherClient) {
		return (id == otherClient.id) ? true : false;
	}

	public String toString() {
		return "ID - ";
	};
}
