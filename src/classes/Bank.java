package classes;

import java.util.Date;

import exceptions.ClientError;

public class Bank {

	// Attributes
	private float balance;
	private Client[] clients;
	private Logger logService;
	private Bank bank;

	// private void account_apdater; //TODO

	// Constructors

	private Bank() {
		logService = new Logger("A"); // TODO - do something with the drivers
										// name
		clients = new Client[100];
	}
	
	public Bank getBank(){
		if (bank != null) return bank;
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

	public void addClient(Client newClient)  throws ClientError{
		boolean success = false;
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				clients[i] = newClient;
				balance += newClient.getFortune();
				success = true;
				Log log = new Log(new Date().getTime(), clients[i].getId(), "A new client added", newClient.getFortune(), "Client");
				Logger.log(log);
				break;
			}
		}
		if (success == false) {
			Log log = new Log(new Date().getTime(), newClient.getId(), "The Client " + newClient.getId() + " was not added", "Client");
			throw new ClientError();
		}
	}

	public void removeClient(Client client) throws ClientError {
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
			throw new ClientError();
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
	
	public void printClientList(){
		for (Client client:clients){
			if (client != null)
				System.out.println(client.toString());
		}
	}
}