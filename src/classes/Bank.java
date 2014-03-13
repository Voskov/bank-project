package classes;

import java.util.ArrayList;
import java.util.Date;

import exceptions.ClientError;

public class Bank {

	// Attributes
	private float balance;
	// private Client[] clients;
	private ArrayList<Client> clients;
	private Logger logService;
	private Bank bank;

	// private void account_apdater; //TODO

	// CTOR
	private Bank() {
		logService = new Logger("A"); // TODO - do something with the drivers
										// name
		clients = new ArrayList<>();

	}

	public Bank getBank() {
		if (bank != null)
			return bank;
		else {
			bank = new Bank();
			return bank;
		}
	}

	// Methods
	public float getBalance() {
		float sum = balance;
		for (Client cl : clients) {
			if (cl != null) {
				sum += cl.getFortune();
			}
		}

		return sum;
	}

	public void setBalance(float newBal) {
		balance = newBal;
	}

	public void addClient(Client newClient) throws ClientError {
		try {
			clients.add(newClient);
		} catch (RuntimeException e) {
			System.out.println("Could not add a new client");
			System.out.println(e.getMessage());
		}
	}

	public void removeClient(Client client) throws ClientError {
		try{
			clients.remove(client);
		} catch (RuntimeException e){
			System.out.println("Could not remove client " + client.getId());
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void getLogs() {
		// TODO - do later
	}

	public void startAccountUpdater() {
		// TODO - do later
	}

	public void printClientList() {
		for (Client client : clients) {
			if (client != null)
				System.out.println(client.toString());
		}
	}
}