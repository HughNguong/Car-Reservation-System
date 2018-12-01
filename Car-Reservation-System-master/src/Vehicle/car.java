package Vehicle;

import java.util.Scanner;
import src.*;


/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:38 PM
 */
public class car extends vehicle {

	
	
	public car(){
		setVehicleID(main.carID);
		main.carID++;
		setLicense(1);
		setAvailibility(true);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	
}//end car