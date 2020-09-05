package designandprinciples;

public class FrontEndDev implements Devloper {

	public void frontend() {
		System.out.println("HTML is a programming lan, and you can make fun of me");
	}

	@Override
	public void develop() {
		this.frontend();

	}
}
