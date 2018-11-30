package Contract;

import Vehicle.vehicle;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:40 PM
 */
abstract public class contract {

	private int contractID;
	private int VehicleID;
	public vehicle m_vehicle;

	public contract(){

	}

	public void finalize() throws Throwable {

	}

	public int getContractID() {
		return contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

	public int getVehicleID() {
		return VehicleID;
	}

	public void setVehicleID(int vehicleID) {
		VehicleID = vehicleID;
	}

	public vehicle getM_vehicle() {
		return m_vehicle;
	}

	public void setM_vehicle(vehicle m_vehicle) {
		this.m_vehicle = m_vehicle;
	}
}//end contract