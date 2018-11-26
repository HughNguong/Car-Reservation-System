package Contract;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:44 PM
 */
public class reservationContract extends contract {

	public rentalContract m_rentalContract;

	public reservationContract(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public rentalContract getM_rentalContract() {
		return m_rentalContract;
	}

	public void setM_rentalContract(rentalContract m_rentalContract) {
		this.m_rentalContract = m_rentalContract;
	}
}//end reservationContract