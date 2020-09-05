package designandprinciples;

public class MathOpr {
	
	private static MathOpr mathOpr = null;
	private MathOpr() {
		
	}
	
	public static MathOpr getInstance() {
		if(mathOpr == null)
			mathOpr = new MathOpr();
		
		return mathOpr;
	}
	
	private int result;

	public MathOpr add(int n1) {
		result += n1;
		return this;
	}

	public MathOpr sub(int n1) {
		result -= n1;
		return this;
	}

	public MathOpr mul(int n1) {
		result *= n1;
		return this;
	}
	
	public MathOpr div(int n1) {
		result /= n1;
		return this;
	}
	
	public int getResult() {
		return result;
	}
	

}
