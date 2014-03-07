package cleint_types;

public class GoldClient extends classes.Client{

	private float commition_rate = 0.02F;
	private float interest_rate = 0.003F;

	//CTOR
	public GoldClient(int id, String name, float balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}

	//MTDS
	public String toString() {
		return "Gold client. " + super.toString();
	}
	
	
}
