package classes;

import java.util.Date;

public class Bank {

	// Attributes
	private float balance;
	private Client[] clients;
	private Logger logService;

	// private void account_apdater; //TODO

	// Constructors
	public Bank() {
		logService = new Logger("A"); // TODO - do something with the drivers name
		clients = new Client[100];
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

	public void addClient(Client newClient) {
		boolean success = false;
		for (Client cl : clients) {
			if (cl == null) {
				cl = newClient;
				balance += cl.getFortune();
				success = true;
				Log log = new Log(((new Date()).getTime()), newClient.getId(), "Clentt added - " + newClient.getId(), newClient.getFortune());
				// TODO - log this operation
				break;
			}
		}
		if (success == false) {
			// TODO - log this failure
		}
	}

	public void removeClient(Client client) {
		boolean success = false;
		for (Client cl : clients) {
			if (cl != null && cl.equals(client)) {
				balance -= cl.getFortune();
				cl = null;
				// TODO - log this operation
				break;
			}
		}
		if (success == false) {
			// TODO - log this failure
		}
	}

	public Client[] getClients() {
		return clients;
	}

	public void getLogs() {
		// TODO - do later
	}

	public void startAccountUpdater() {
		// TODO - do later
	}
}
