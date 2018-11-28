package src;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
	public static int carID = 1;
	public static int truckID = 1;
	public static int vanID = 1;	
	public static int CiD=0;
	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		rentalOffice r1= new rentalOffice(10, 10, 10);
		LinkedList<client> ListOfCustomer= new LinkedList<client>();
		String choice,choice1;
		while(true) {
			System.out.println("Please choose option: p(plus) customer,a(action) action perform");
			choice = sc.nextLine(); 
			switch(choice) {
			   case "p":
				  System.out.println("Please enter the name of Customer");
				  
				  client cl= new client(sc.nextLine(), CiD);
				  ListOfCustomer.add(cl);
			     System.out.println(cl.getName()+ " is added to the system with ID"+ CiD);
			     CiD++;
			      break; // optional
			   
			   case"a":
				   System.out.println("Please enter the ID of Customer you want to perform");
				   int tempID = sc.nextInt();
				   System.out.println("Please enter the action you want to perform:(r) reserve car:");
				   choice1 = sc.nextLine(); 
				   
				   switch(choice1) {
				   case"r":
					   System.out.println("Car reserve");

				   default: 
					   System.out.println(choice1);
				   }
				   
				   
				   /* Todo here*/
				   
				   
			   
			   // You can have any number of case statements.
			   default : // Optional
			      // Statements
			}
		}
		
	}

}
