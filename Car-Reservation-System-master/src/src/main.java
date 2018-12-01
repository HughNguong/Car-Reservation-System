package src;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
	public static int carID = 1;
	public static int truckID = 1;
	public static int vanID = 1;	
	public static int CiD=0;
	public static int tempID;
	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		rentalOffice r1= new rentalOffice(10, 10, 10);
	
		String choice,choice1;
		while(true) {
			System.out.println("Please choose option: p(plus) customer,a(action) action perform, "
					+ "(l1) List of customer, (l2) list of vehicle");
			choice = sc.nextLine(); 
			switch(choice) {
			   case "p":
				  System.out.println("Please enter the name of Customer");
				  String name = sc.nextLine();
				  System.out.println("Please enter the license of "+ name+", 1 for car, 2 for truck license" );
				  int license = sc.nextInt();
				  sc.nextLine();
				  client cl= new client(name, CiD, license);
				  r1.addCustomer(cl);
			     System.out.println(cl.getName()+ " is added to the system with ID: "+ CiD);
			     cl.setID(CiD);	
			     CiD++;
			    
			      break; // optional
			   
			   case"a":
				   if (r1.getListOfCustomer().isEmpty()) {
					   System.out.println("There is no customer");
					   break;
					   }
				   System.out.println("Please enter the ID of Customer you want to perform");
				   tempID = sc.nextInt();
				   sc.nextLine();
				   System.out.println("Please enter the action you want to perform for "+r1.getListOfCustomer().get(tempID).getName() +":"
				   		+ " (r) reserve car, (f) fechVehical,(b) return car back:");
				   choice1 = sc.nextLine(); 
				   
				   switch(choice1) {
				   case "r":
					   System.out.println("Which type of car do you want to resereve");
					   //get client ID from temp ID then do perform
					   String choice2 = sc.nextLine(); 
					   
					   switch(choice2) {
					   case "c":
						  System.out.println("Car reserved");
						  r1.getListOfCustomer().get(tempID).reserveVehicle(r1, "c");
						break;   
					   case "v":
							  System.out.println("Van reserved");
							  r1.getListOfCustomer().get(tempID).reserveVehicle(r1, "v");
							break;
					   case "t":
							  System.out.println("Truck reserved");
							  r1.getListOfCustomer().get(tempID).reserveVehicle(r1, "t");
							break;
					   }
					   
					   break;
				   case "f":
					   System.out.println("Car fetched");
					   r1.getListOfCustomer().get(tempID).requestRent();
					   break;
				   case "b":
					   System.out.println("Return Vehicle");
					   r1.getListOfCustomer().get(tempID).returnVehicle();   
					   break;
				   default: 
					   System.out.println(choice1);
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
			   // You can have any number of case statements.
			   default : // Optional
			      System.out.println("Invalid operation, please input again");
			}
		}
		
	}

}
