package classes;

public class Bank {
	private float balance;
	private Client[] clients;
	private Logger logService;
//	private void account_apdater;	//TODO
	
	
	public float getBalance(){
		int sum = 0;
		for (Client client:clients){
			sum += client.getBalance();
		}
		return sum;
	}
	
	
}
