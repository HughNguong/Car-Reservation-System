package src;

import Contract.reservationContract;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:35 PM
 */
public class billPayment {

	private int totalAmount;

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public billPayment(client c,rentalOffice r,reservationContract rc){
		int calAmount=0 ;
		calAmount = (main.realday-rc.getStartday()) * 10;
		// TODO calculate the amount
		r.setGrossRevenue(r.getGrossRevenue()+ calAmount);
		System.out.println();
		System.out.println(c.getName()+" has to pay "+ calAmount +" euro\n");
		
	}

	public void finalize() throws Throwable {

	}
}//end billPlayment