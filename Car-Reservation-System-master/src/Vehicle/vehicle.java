package Vehicle;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:48 PM
 */
abstract public class vehicle {
	private boolean Availibility;
	private int License;
	public int VehicleID;

	public boolean isAvailibility() {
		return Availibility;
	}

	public void setAvailibility(boolean availibility) {
		Availibility = availibility;
	}

	public int getLicense() {
		return License;
	}

	public void setLicense(int license) {
		License = license;
	}

	public int getVehicleID() {
		return VehicleID;
	}

	public void setVehicleID(int vehicleID) {
		VehicleID = vehicleID;
	}


	public vehicle(){

	}

	public void finalize() throws Throwable {

	}
}//end vehicle