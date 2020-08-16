// 4 ways
public class MyApp extends SubAppClass implements IDecoderRead, IPrint, IMailer {

	@Override
	public void mail() {
		System.out.println("sending mail...");
	}

	@Override
	public void print() {
		System.out.println("printing data...");
	}

	@Override
	public void read() {
		System.out.println("reading data...");
	}
	
	@Override
	public void decodeRead() {
		System.out.println("decode reading data...");
	}
	
	@Override
	public void digital() {
		System.out.println("My App printing...");
	}
	
//	@Override
//	public void digital() {
////		IMailer.super.digital();
////		IPrint.super.digital();
//		//System.out.println("My app digital");
//	}

}
