
public class Samsung extends Phone{

	public void appStores() {
		System.out.println("testing app store");
	}
	
	public void checkSpeakers() {
		System.out.println("check speakers");
	}
	
	@Override
	public void repairMobile() {
		this.appStores();
		this.checkSpeakers();
	}
}
