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
			System.out.println("Please choose option:\n(a) Add customer\n(p) Perform actions\n"
					+ "(l1) List of customer\n(l2) list of vehicle\n(add) end working day.");
			choice = sc.nextLine(); 
			switch(choice) { // Rental action
			   case "a":
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
			   
			   case"p":// Client action
				   if (r1.getListOfCustomer().isEmpty()) {
					   System.out.println("There is no customer");
					   break;
					   }
				   System.out.println("Please enter the ID of Customer you want to perform");
				   for (int i= 0 ; i<r1.getListOfCustomer().size(); i ++) {
					   System.out.println(r1.getListOfCustomer().get(i).getName()+ " ID: "+r1.getListOfCustomer().get(i).getID()+
							   " license: " +r1.getListOfCustomer().get(i).license);
				   }
				   tempID = sc.nextInt();
				   sc.nextLine();
				   
				   System.out.println("Please enter the action you want to perform for "+r1.getListOfCustomer().get(tempID).getName() +":"
				   		+ "\n(r) reserve car\n(f) fechVehical\n(b) return car back\n(l1) list reservation contract\n(l2) list rental contract:");
				   choice1 = sc.nextLine(); 
				   
				   switch(choice1) { 
				   case "r":
					   System.out.println("Which type of car do you want to resereve");
					   //get client ID from temp ID then do perform
					   String choice2 = sc.nextLine(); 
					   System.out.println("How many day you want to reserve this vehicle?");
					   int d= sc.nextInt();
					   sc.nextLine();
					   switch(choice2) {
					   case "c":
						  r1.getListOfCustomer().get(tempID).reserveVehicle(r1, "c",d);
						break;   
					   case "v":
							  r1.getListOfCustomer().get(tempID).reserveVehicle(r1, "v",d);
							break;
					   case "t":
							  r1.getListOfCustomer().get(tempID).reserveVehicle(r1, "t",d);
							break;
					   }
					   
					   break;
				   case "f":
					   try
						{
							int ID;
							System.out.println("Reservation Contract ID:");
							ID = sc.nextInt();
							sc.nextLine();
							r1.getListOfCustomer().get(tempID).requestRent(r1, ID);
							break;
						}
						catch(Exception e) {
							System.out.println("No contract found!");
						}
					   break;
				   case "b":
					   System.out.println("Return Vehicle");
					   r1.getListOfCustomer().get(tempID).returnVehicle();   
					   break;
				   case "l1":
					   for (int i= 0 ; i<r1.getListOfCustomer().get(tempID).resContract.size(); i ++) {
						   System.out.println( "ID: "+r1.getListOfCustomer().get(tempID).rentContract.get(i).getContractID()+
								   " Vehicle: " +r1.getListOfCustomer().get(tempID).rentContract.get(i).getClass());
					   }
					   break;
				   case "l2":
					   break;
				   default: 
					   
					   break;
				   }
				   /* Todo here*/
				   
				   break;
			   case "l1":
				   for (int i= 0 ; i<r1.getListOfCustomer().size(); i ++) {
					   System.out.println(r1.getListOfCustomer().get(i).getName()+ " id: "+r1.getListOfCustomer().get(i).getID()+
							   " license: " +r1.getListOfCustomer().get(i).license);
				   }
				   break;
			   case "add":
				   realday ++;
				   System.out.println("Shutting down /**************************/ New day starts/**************************/ \n");
				   System.out.println("Day "+ realday+ ". Good Morning");
				   
				   break;
			   // You can have any number of case statements.
			   default : // Optional
			      System.out.println("Invalid operation, please input again");
			}
		}
		
	}

}
