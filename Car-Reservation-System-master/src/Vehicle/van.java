package Vehicle;

import java.util.Scanner;


import src.main;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:46 PM
 */
public class van extends vehicle {



	public van(){
		setVehicleID(main.vanID);
		main.vanID++;
		setLicense(1);
		setAvailibility(true);
		
		System.out.println("Van info:\n- "+ this.getVehicleID()+"\n- "+getLicense()+"\n- "+isAvailibility()+"\n");
	}


}//end van