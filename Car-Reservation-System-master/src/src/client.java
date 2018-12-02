package src;

import java.util.LinkedList;

import Contract.contract;
import Contract.rentalContract;
import Contract.reservationContract;
import Vehicle.car;
import Vehicle.truck;
import Vehicle.van;
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
	public LinkedList<reservationContract> resContract = new LinkedList<reservationContract>();
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

	public void printListofRental() {
		 if (this.rentContract.size()== 0) System.out.println("This person has no rental contracts");
		   else
		   {
		   
		   for (int i= 0; i<this.rentContract.size(); i ++) {
			   System.out.println( "Rental ID: "+ this.rentContract.get(i).getContractID()+
					   " Vehicle: " + this.rentContract.get(i).getM_vehicle().getClass());
		   }
		   
		   }
	}
	public void printListofRes() {
		 if (this.resContract.size()== 0) System.out.println("This person has no reservation contracts");
		   else
		   {
		   for (int i= 0; i<this.resContract.size(); i ++) {
			   System.out.println( "Reservation ID: "+ this.resContract.get(i).getContractID()+
					   " Vehicle: " + this.resContract.get(i).getM_vehicle().getClass());
		   }
		   }
		
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

	public void endContract(int ResID,rentalOffice r){
		System.out.println("Contract ID"+ this.resContract.get(ResID).getContractID()+" has been terminated");
		reservationContract temReservationContract = resContract.get(ResID);
		if ( temReservationContract.getM_vehicle() instanceof car )
		{
			temReservationContract.setDay(temReservationContract.getDay()- main.realday);
			r.cars.get(k).setAvailibility(true);
			k--;
			System.out.println("Car susscefully return");
	}
		// Todo set availibility again
		// Todo rental office calculate rent (paybill)
		if ( temReservationContract.getM_vehicle() instanceof truck )
		{
			temReservationContract.setDay(temReservationContract.getDay()- main.realday);
			r.trucks.get(j).setAvailibility(true);
			System.out.println("Truck susscefully return");
		j--; 
		
		}
		if ( temReservationContract.getM_vehicle() instanceof van)
		{
		temReservationContract.setDay(temReservationContract.getDay()- main.realday);
		r.vans.get(i).setAvailibility(true);
		System.out.println("Van susscefully return");
		i--;
		// Todo set availibility again
		}
		this.resContract.remove(ResID);
		r.contractID--;
	billPayment bill = new billPayment(this, r, temReservationContract);
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
			rentContract.add(r.createRentContract(this, resContract.get(ID)));
			System.out.println("Vehical fetched");
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
				resContract.add(r.createResContract(this,r.vans.get(i),day,i));
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
					r.trucks.get(j).setAvailibility(false);
					resContract.add(r.createResContract(this,r.trucks.get(j),day,j));
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
					resContract.add(r.createResContract(this,r.cars.get(k),day,k));
					System.out.println("Car reserved for "+ day+ " days");
					break;
				}
				}
			}
		
		else {
			System.out.println(this.getName()+" does not have the right license to rent a truck");	
		}
		
	}

	public void returnVehicle(rentalOffice r,int RentalContractID){
		contract tempRentalContract= rentContract.get(RentalContractID);
		reservationContract temReservationContract = resContract.get(RentalContractID);
		if ( tempRentalContract.getM_vehicle() instanceof car )
		{
			temReservationContract.setDay(temReservationContract.getDay()- main.realday);
			r.cars.get(k).setAvailibility(true);
			k--;
			System.out.println("Car susscefully return");
	}
		// Todo set availibility again
		// Todo rental office calculate rent (paybill)
		if ( tempRentalContract.getM_vehicle() instanceof truck )
		{
			temReservationContract.setDay(temReservationContract.getDay()- main.realday);
			r.trucks.get(j).setAvailibility(true);
			System.out.println("Truck susscefully return");
		j--; 
		
		}
		if ( tempRentalContract.getM_vehicle() instanceof van)
		{
		temReservationContract.setDay(temReservationContract.getDay()- main.realday);
		r.vans.get(i).setAvailibility(true);
		System.out.println("Van susscefully return");
		i--;
		// Todo set availibility again
		}
		this.rentContract.remove(RentalContractID);
		this.resContract.remove(RentalContractID);
		r.contractID--;
		this.printListofRes();
	billPayment bill = new billPayment(this, r, temReservationContract);
	}

}//end client