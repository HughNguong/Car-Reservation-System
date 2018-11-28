package src;

import Contract.contract;
import License.license;

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

	public void reserveVehicle(){

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