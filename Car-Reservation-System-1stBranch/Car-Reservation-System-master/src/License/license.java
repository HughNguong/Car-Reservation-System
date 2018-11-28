package License;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:42 PM
 */
public class license {

	private int license;
	public truckLicense m_truckLicense;
	public carLicense m_carLicense;

	public license(){

	}

	public void finalize() throws Throwable {

	}
	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public truckLicense getM_truckLicense() {
		return m_truckLicense;
	}

	public void setM_truckLicense(truckLicense m_truckLicense) {
		this.m_truckLicense = m_truckLicense;
	}

	public carLicense getM_carLicense() {
		return m_carLicense;
	}

	public void setM_carLicense(carLicense m_carLicense) {
		this.m_carLicense = m_carLicense;
	}

	public int requestLicense(){
		return 0;
	}
}//end license