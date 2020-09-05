package designandprinciples;

public class BackEndDev implements Devloper {

	public void backend() {
		System.out.println("i am developing backend");
	}

	@Override
	public void develop() {
		this.backend();
		
	}
}
