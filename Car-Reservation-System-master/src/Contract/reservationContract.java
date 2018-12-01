package Contract;

import Vehicle.vehicle;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:44 PM
 */
public class reservationContract extends contract {

	public rentalContract m_rentalContract;
	private int day;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public reservationContract(int d, vehicle v){
		this.m_vehicle = v;
		this.day =d;

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end reservationContract