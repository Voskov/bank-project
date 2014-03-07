package cleint_types;

public class PlatinumClient extends classes.Client{

	private float commition_rate = 0.01F;
	private float interest_rate = 0.005F;

	public PlatinumClient(int id, String name, float balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Platinum client. " + super.toString();
	}
}
