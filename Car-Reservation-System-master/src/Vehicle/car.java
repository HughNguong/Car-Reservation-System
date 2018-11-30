package Vehicle;

import java.util.Scanner;
import src.*;
import License.carLicense;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:38 PM
 */
public class car extends vehicle {

	public carLicense m_carLicense;
	
	public car(){
		setVehicleID(main.carID);
		main.carID++;
		setLicense(1);
		setAvailibility(true);
		
		System.out.println("Car info:\n- "+this.getVehicleID()+"\n- "+getLicense()+"\n- "+isAvailibility()+"\n");
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public carLicense getM_carLicense() {
		return m_carLicense;
	}

	public void setM_carLicense(carLicense m_carLicense) {
		this.m_carLicense = m_carLicense;
	}
}//end car