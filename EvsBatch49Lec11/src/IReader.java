
public interface IReader {

	void read();
	
	default void test(String v) {
		 System.out.println("IPrinter -> "+ v);
	 }
}
