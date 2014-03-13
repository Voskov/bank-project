package classes;

import java.util.ArrayList;

public class Logger {
	private ArrayList<Log> logs;
	//ATTR
	private String driverName;

	//CSTR
	public Logger(String driverName) {
		this.driverName = driverName;
	}
	
	//MTDS
	public static void log(Log log) {
		log.print_details();
	}
	
	public ArrayList<Log> getLogs() {
		return logs;
	}
}
