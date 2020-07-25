
public class SoftwareEngineers extends Person {
	

	private String level;
	private String coreLanguage;
	private double paidTax;
	
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCoreLanguage() {
		return coreLanguage;
	}
	
	public double calculateTax(int years) {
		return years * paidTax;
	}
	public double calculateTax(int years, int month) {
		return (years * paidTax)  - month;
	}
	
	public void setCoreLanguage(String coreLanguage) {
		this.coreLanguage = coreLanguage;
	}
	
	public void setPaidTax(double paidTax) {
		this.paidTax = paidTax;
	}
	
	public double getPaidTax() {
		return paidTax;
	}
	
	//private (X)
	//public  -> same/less accessible 
	//protected -> same package, child classes [same, public]
	//default -> same package [same, protected, public]
	
	
	@Override
	public void setCnic(String cnic) {
		super.setCnic("SS"+cnic);
	}
	
}
