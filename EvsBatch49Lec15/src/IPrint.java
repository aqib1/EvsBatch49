
public interface IPrint {
	void print();
	
	default void digital() {
		System.out.println("Digital printing ...");
	}
	
	default void test() {
		System.out.println("hi there");
	}
}
