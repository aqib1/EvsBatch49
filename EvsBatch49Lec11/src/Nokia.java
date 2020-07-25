
public class Nokia extends Phone{
	
	public void sendMessage() {
		System.out.println("sending message");
	}
	
	public void cameraFunction() {
		System.out.println("camera checking");
	}
	
	@Override
	public void repairMobile() {
		this.sendMessage();
		this.cameraFunction();
	}

}
