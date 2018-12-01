package src;

import java.util.LinkedList;

import Contract.contract;
import Contract.rentalContract;
import Contract.reservationContract;

import Vehicle.vehicle;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 6:06:34 PM
 */
public class client {

	private int ID;
	private String Name;
	public int license;
	public contract m_contract;
	
	public LinkedList<contract> resContract = new LinkedList<contract>();
	public LinkedList<contract> rentContract = new LinkedList<contract>();
	
	private int i = 0;
	private int j = 0;
	private int k = 0;
//	public rentalOffice m_rent;
	

	public client(String name,int ID,int li){
		this.setName(name);
		this.setID(ID);	
		this.license = li;
		
		
		
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	//Rent vehicle
	public void requestRent(rentalOffice r, int ID) {
		if(resContract.isEmpty()) {
			System.out.println("Client has " + resContract.size() + " Reservation Contract");
		}
		else
		{	
			rentContract.add(r.createRentContract(this, resContract.get(ID-1)));
			System.out.println("Car fetched");
			System.out.println(this.getName() + " has #ReservationContract:" + resContract.size() + " and #RentalContract:" + rentContract.size()+"\n");
		}
	}

	public void reserveVehicle(rentalOffice r, String v,int day){
		
		
		
		if (v== "v") {
		for ( i = 0; i <= (r.getNoOfVan()+1); i++)
		{
			if (i == r.getNoOfVan()+1) {System.out.println("No vans left to reserve"); break;}
			else if(r.vans.get(i).isAvailibility()) 
			{
				r.vans.get(i).setAvailibility(false);
				resContract.add(r.createResContract(this,r.vans.get(i),day));
				System.out.println("Van reserved for " + day+ " days");
				
				break;
			}
		}	
		}
	
		
		else if (v== "t"  && this.license == 2) {
			for ( j =0 ; j <= (r.getNoOfTruck()+1); j++)
			{
				if (j == r.getNoOfTruck()+1) {System.out.println("No trucks left to reserve"); break;}
				else if(r.trucks.get(j).isAvailibility())
				{
					r.trucks.get(i=j).setAvailibility(false);
					resContract.add(r.createResContract(this,r.trucks.get(j),day));
					System.out.println("Truck reserved for "+ day+ " days");
					break;
				}
			}	
			}
		
		
		
		else if (v== "c") {
				for (k = 0; k<= r.getNoOfCar();k ++) {
				if (k == r.getNoOfCar()) {
					System.out.println("No cars left to reserve");
					break;
				}
				else if(r.cars.get(k).isAvailibility())
				{	
					r.cars.get(k).setAvailibility(false);
					resContract.add(r.createResContract(this,r.cars.get(k),day));
					System.out.println("Car reserved for "+ day+ " days");
					break;
				}
				}
			}
		
		else {
			System.out.println(this.getName()+" does not have the right license to rent a truck");	
		}
		
	}

	public void returnVehicle(){
 k--;
 // Todo set availibility again
 
 // Todo rental office calculate rent (paybill)

 j--; 
 // Todo set availibility again

 i--;
 // Todo set availibility again
	}

}//end client