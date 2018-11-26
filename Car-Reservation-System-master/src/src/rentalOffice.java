
package src;

import Contract.contract;
import Vehicle.vehicle;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 6:02:40 PM
 */
public class rentalOffice {

	private int OfficeID;
	public client m_client;
	public vehicle m_vehicle;
	public contract m_contract;
	public billPayment m_billPayment;

	public rentalOffice(){

	}

	public void finalize() throws Throwable {

	}
	public void cancelContract(){

	}

	public boolean checkAvailability(){
		return false;
	}

	public void createContract(){

	}

	public void endContract(){

	}

	public void lockVehicle(){

	}

	public void releaseVehicle(){

	}

	public void requestCalculation(){

	}

	public void requestReturnVehicle(){

	}
}//end rentalOffice