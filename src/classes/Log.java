package classes;

public class Log {
	
	//Attributes 
	private long timestamp;
	private int client_id;
	private String description;
	private float amount;
	
	// Constructor
	public Log(long timestamp, int client_id, String description, float amount) {
		super();
		this.timestamp = timestamp;
		this.client_id = client_id;
		this.description = description;
		this.amount = amount;
	}
	
	//public methods
	public void print_details(){
		System.out.println("Timestamp - " + timestamp + "\nClient id - " + client_id
				 + "\nDescription - " + description + "\nAmount - " + amount);
	}
	
	public String getData(){
		return "Timestamp - " + timestamp + "\nClient id - " + client_id
		 + "\nDescription - " + description + "\nAmount - " + amount;
	}
}
