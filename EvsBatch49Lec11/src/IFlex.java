
public class IFlex implements IPrinter, IReader{

	@Override
	public void print() {
		
	}

	@Override
	public void read() {
		
	}
	
	@Override
	public void test(String v) {
		System.out.println("iflex");
		IPrinter.super.test(v);
	}

}
