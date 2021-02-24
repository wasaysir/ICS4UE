
public class AddressInfo {
	
	public String streetNum;
	public String unitNum;
	public String streetName;
	public String city;
	public String prov;
	public String postalCode;
	
	public AddressInfo() {
		streetNum = "unknown";
		unitNum = "unknown";
		streetName = "unknown";
		city = "unknown";
		prov = "unknown";
		postalCode = "unknown";
	}
	
	public AddressInfo( String sN, String uN, String sNa, String c, String p, String pC) {
		streetNum = streetNum;
		unitNum = uN;
		streetName = sNa;
		city = c;
		prov = p;
		postalCode = p;
	}
	
}
