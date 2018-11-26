package Contract;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:43 PM
 */
public class rentalContract extends contract {

	public insuranceContract m_insuranceContract;

	public rentalContract(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public insuranceContract getM_insuranceContract() {
		return m_insuranceContract;
	}

	public void setM_insuranceContract(insuranceContract m_insuranceContract) {
		this.m_insuranceContract = m_insuranceContract;
	}
}//end rentalContract