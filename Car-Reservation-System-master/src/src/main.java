package src;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
	public static int carID = 1;
	public static int truckID = 1;
	public static int vanID = 1;	
	public static int CiD=0;
	public static int tempID;
	public static int realday=1;
	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		rentalOffice r1= new rentalOffice(1, 1, 1);
	
		String choice,choice1;
		while(true) {
			System.out.println("===========================Main page===========================");
			System.out.println("Please choose option:\n(a) Add customer\n(p) Perform actions\n"
					+ "(l1) List of customer\n(add) end working day.");
			choice = sc.nextLine(); 
			switch(choice) { // Rental action
			   case "a": // adding customer
				  System.out.println("Please enter the name of Customer");
				  String name = sc.nextLine();
				  System.out.println("Please enter the license of "+ name+", (1) car license, (2) truck license" );
				  int license = sc.nextInt();
				  sc.nextLine();
				  client cl= new client(name, CiD, license);
				  r1.addCustomer(cl);
			     System.out.println(cl.getName()+ " is added to the system with ID: "+ CiD);
			     cl.setID(CiD);	
			     CiD++;
			    
			      break; // optional
			   
			   case"p":// Client action // customer perform action
				   if (r1.getListOfCustomer().isEmpty()) {
					   System.out.println("There is no customer");
					   break;
					   }
				   System.out.println("Please enter the ID of Customer you want to perform:");
				   r1.printListofCustomer();
				   tempID = sc.nextInt();
				   sc.nextLine();
				   client tempC= r1.ListOfCustomer.get(tempID);
				   System.out.println("=========================== "+ tempC.getName() +" personal page===========================\nPlease enter the action you want to perform:"
				   		+ "\n(r) reserve car\n(f) fechVehical\n(b) back the vehicle to office\n(c) cancel reservation\n(l1) list reservation contract"
				   		+ "\n(l2) list rental contract:");
				   choice1 = sc.nextLine(); 
				   
				   switch(choice1) { 
				   case "r":
					   System.out.println("Which type of car do you want to resereve (c)ar,(v)van,(t)truck:");
					   //get client ID from temp ID then do perform
					   String choice2 = sc.nextLine(); 
					   System.out.println("How many days you want to reserve this vehicle?");
					   int d= sc.nextInt();
					   sc.nextLine();
					   switch(choice2) {
					   case "c":
						  tempC.reserveVehicle(r1, "c",d);
						break;   
					   case "v":
							  tempC.reserveVehicle(r1, "v",d);
							break;
					   case "t":
							  tempC.reserveVehicle(r1, "t",d);
							break;
					   }
					   
					   break;
				   case "f":// fectching car
					   try
						{
							int ID;
							System.out.println(tempC.getName()+" has "+tempC.resContract.size()+ " reservation contract(s)");
							tempC.printListofRes();
							System.out.println("Enter reservation contract ID to fetch vehicle:");
							ID = sc.nextInt();
							sc.nextLine();
							tempC.requestRent(r1, ID);
						
						}
						catch(Exception e) {
							System.out.println("No contract found!");
						}
					   break;
					   
				   case "b": // return vehicle
					   if (tempC.rentContract.isEmpty()) System.out.println("This client haven't fetch any vehicles");
					   else {  
					   System.out.println("Which rental contract ID you want to terminate");
					   
					   tempC.printListofRental();
					   int RentID = sc.nextInt();
					   sc.nextLine();
					   
					   tempC.returnVehicle(r1,RentID);
					   
					   }
					   break;
				   case "c":
					   if (tempC.resContract.isEmpty()) System.out.println("This client has no reservation contract to cancel");
					   else {
					   System.out.println("Which contract ID do you want to terminate?");
					   tempC.printListofRes();
					   int tempID1= sc.nextInt();
					   sc.nextLine();
					   tempC.endContract(tempID1,r1);
					   }
					   break;
				   case "l1": // list reservation contract  
						 r1.ListOfCustomer.get(tempID).printListofRes();  
					   break;
				   case "l2":// list rental contract
					   r1.ListOfCustomer.get(tempID).printListofRental();
					   break;
				   default: 
					   
					   break;
				   }
				   /* Todo here*/
				   
				   break;
			   case "l1": // list list of customer
				   r1.printListofCustomer();
				   break;
			   case "add": // add day
				   realday ++;
				   System.out.println("Shutting down system /**************************/ New day starts/**************************/ \n");
				   System.out.println("The company gross revenue is "+ r1.getGrossRevenue());
				   System.out.println("\nDay "+ realday+ ". Good Morning");
				   // TODO, check contract end. terminate contract
				   break;
			   default : // Optional
			      System.out.println("Invalid operation, please input again");
			}
		}
		
	}

}
