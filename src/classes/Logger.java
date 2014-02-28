package classes;

public class Logger {
	//ATTR
	private String driverName;

	//CSTR
	public Logger(String driverName) {
		this.driverName = driverName;
	}
	
	//MTDS
	public void log(Log log) {
		log.print_details();
	}
	
	public Log[] getLogs() {
		//TODO - do later
		return null;
	}
}
