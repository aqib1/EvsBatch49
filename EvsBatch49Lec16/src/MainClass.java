
public class MainClass {

	public void test() {

	}

	public static void code(MainClass m) {
//		code(null);
//		try {
//			m.test();
//		} catch (NullPointerException e) {
//			return; //->
//		} finally {
//			System.out.println("should i run ?");
//		}
	}

	public static void main(String[] args) {
		
//		code(null);
//		while(true) {
//			System.out.println("Hi");
//		}

//		int [] arr = {1, 2};
//		try {
//		System.out.println(arr[3]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println(" dont play with me!!! ");
//		}
//		
//
		String value = "12a4";
		int number = 0;
		try {
			number = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new MyException(e.getMessage(), e);
		}
		System.out.println(number);

		// Exception
		// - unexpected behaviors
		// - error
		// ?

		/*
		 * Throwable -> Exception -> IOException
		 * 
		 * ->RuntimeException -> NullPointerException -> ArrayOutOfBoundException ->
		 * NumberFormatException
		 * 
		 * -> compile time exception/ checked exception -> run time exception/ unchecked
		 * exception
		 * 
		 * 
		 * 
		 */

//			code(null);

	}

}
