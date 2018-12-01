
package src;

import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;

import Contract.contract;
import Contract.reservationContract;
import Vehicle.car;
import Vehicle.truck;
import Vehicle.van;
import Vehicle.vehicle;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 6:02:40 PM
 */
public class rentalOffice {

	private int OfficeID;
	private int noOfCar, noOfVan, noOfTruck;
	
	
	public contract m_contract;
	public billPayment m_billPayment;
	
	
	private Scanner sc;
	public LinkedList <car> cars = new LinkedList<car> ();
	public LinkedList <van> vans = new LinkedList<van> ();
	public LinkedList <truck> trucks = new LinkedList<truck>();
	public LinkedList<client> ListOfCustomer= new LinkedList<client>();
	
	public LinkedList<client> getListOfCustomer() {
		return ListOfCustomer;
	}


	public void addCustomer(client c) {
		ListOfCustomer.add(c);
	}


	public rentalOffice(int c, int v, int t){
		System.out.println("Please enter the Office ID: ");
		sc = new Scanner(System.in);
		this.OfficeID = sc.nextInt();
		setNoOfCar(c);
		setNoOfVan(v);
		setNoOfTruck(t);
	
		for (int i = 1; i <= c; i++) {		
		car car1 = new car();
		cars.add(car1);
		}
		for (int i = 1; i <= v; i++) {		
			van van1 = new van();
			vans.add(van1);
			}
		
		for (int j = 1; j <= t; j++) {		
			truck truck1 = new truck();
			trucks.add(truck1);
			}
		
		
		System.out.println("Office: "+ this.getOfficeID()+" has "+ cars.size()+" cars,"+ trucks.size()+" trucks and "+ vans.size()+" vans");
		System.out.println("Welcome to our reservation system");
		
	}
	

	public int getOfficeID() {
		return OfficeID;
	}


	public void setOfficeID(int officeID) {
		OfficeID = officeID;
	}


	public int getNoOfCar() {
		return noOfCar;
	}


	public void setNoOfCar(int noOfCar) {
		this.noOfCar = noOfCar;
	}


	public int getNoOfVan() {
		return noOfVan;
	}


	public void setNoOfVan(int noOfVan) {
		this.noOfVan = noOfVan;
	}


	public int getNoOfTruck() {
		return noOfTruck;
	}


	public void setNoOfTruck(int noOfTruck) {
		this.noOfTruck = noOfTruck;
	}


	public void finalize() throws Throwable {

	}
	public void cancelContract(){

	}

	public boolean checkAvailability(){
		return false;
	}

	public void createContract(client c, vehicle v){
		
		contract con = new reservationContract();
		con.setContractID(ListOfCustomer.get(main.tempID).getID());
		//To do, set vehicle
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