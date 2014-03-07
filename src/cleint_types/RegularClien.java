package cleint_types;

public class RegularClien extends classes.Client{


	private float commition_rate = 0.03F;
	private float interest_rate = 0.001F;
	
	//CTOR
	public RegularClien(int id, String name, float balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}
	
	// Returns the type of the client and his ID number
	public String toString() {
		return "Regular client. " + super.toString();
	}
}