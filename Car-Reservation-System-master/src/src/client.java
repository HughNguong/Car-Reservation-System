package src;

import Contract.contract;
import License.license;
import Vehicle.vehicle;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 6:06:34 PM
 */
public class client {

	private int ID;
	private String Name;
	public license m_license;
	public contract m_contract;
//	public rentalOffice m_rent;
	

	public client(String name,int ID){
		this.setName(name);
		this.setID(ID);	
		
		
		
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public license getM_license() {
		return m_license;
	}

	public void setM_license(license m_license) {
		this.m_license = m_license;
	}

	public contract getM_contract() {
		return m_contract;
	}

	public void setM_contract(contract m_contract) {
		this.m_contract = m_contract;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public void payBill(){
		
	}

	public void requestRent(){
		
	}

	public void reserveVehicle(rentalOffice r, String v){
		int i;
		if (v== "v") {
		for (i = 1 ; i <= (r.getNoOfVan()+1); i++)
		{
			if (i == r.getNoOfVan()+1) {System.out.println("No vans left to reserve"); break;}
			if(r.vans.get(i).isAvailibility()); 
			{
				r.vans.get(i).setAvailibility(false);
				r.createContract(this,r.vans.get(i));
				
				break;
			}
		}	
		}
		if (v== "t") {
			for (i = 1 ; i <= (r.getNoOfTruck()+1); i++)
			{
				if (i == r.getNoOfTruck()+1) {System.out.println("No trucks left to reserve"); break;}
				if(r.trucks.get(i).isAvailibility()); 
				{
					r.trucks.get(i).setAvailibility(false);
					break;
				}
			}	
			}
		if (v== "c") {
			for (i = 1 ; i <= (r.getNoOfCar()+1); i++)
			{
				if (i == r.getNoOfCar()+1) {System.out.println("No cars left to reserve"); break;}
				if(r.cars.get(i).isAvailibility()); 
				{
					r.cars.get(i).setAvailibility(false);
					break;
				}
			}	
			}
		
	}

	public void returnVehicle(){

	}

	/**
	 * 
	 * @param Parameter A
	 */

	/* Begin - EA generated code for  Activities and Interactions */
	

	/* End - EA generated code for  Activities and Interactions */
}//end client