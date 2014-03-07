package classes;

import java.util.Date;

public class Log {

	// Attributes
	private long timestamp;
	private int id;
	private String description;
	private float amount;
	private String type;

	// Constructor
	public Log(long timestamp, int id, String description, float amount,
			String type) {
		super();
		this.timestamp = timestamp;
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.type = type;
	}

	public Log(long timestamp, int id, String description, String type) {
		super();
		this.timestamp = timestamp;
		this.id = id;
		this.description = description;
		this.type = type;
	}

	public Log(long timestamp, int id, String type) {
		super();
		this.timestamp = timestamp;
		this.id = id;
		this.type = type;
	}

	// public methods
	public void print_details() {
		Date time = new Date((long) timestamp * 1000);
		String res = "Timestamp - " + time;
		if (id != 0)
			res += "\nId - " + id;
		if (description != null)
			res += "\nDescription - " + description;
		if (amount != 0)
			res += "\nAmount - " + amount;
		System.out.println(res);
	}

	public String getData() {
		Date time = new Date((long) timestamp * 1000);
		String res = "Timestamp - " + time;
		if (id != 0)
			res += "\nId - " + id;
		if (description != null)
			res += "\nDescription - " + description;
		if (amount != 0)
			res += "\nAmount - " + amount;
		return (res);
	}


	public String toString() {
		Date time = new Date((long) timestamp * 1000);
		String res = "Timestamp - " + time;
		if (id != 0)
			res += "\nId - " + id;
		if (description != null)
			res += "\nDescription - " + description;
		return (res);
	}
	
	
}
