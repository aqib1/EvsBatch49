
public class IPhone extends Phone {

	public void appStore() {
		System.out.println("checking app store");
	}
	
	public void iCloud() {
		
		System.out.println("checking icloud");
	}
	
	@Override
	public void repairMobile() {
		this.appStore();
		this.iCloud();
	}
}
