
public interface IPrinter {
	 void print();
	 
	 default void test(String v) {
		 System.out.println("IPrinter -> "+ v);
	 }
}
