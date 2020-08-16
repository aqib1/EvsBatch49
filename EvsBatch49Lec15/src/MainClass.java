import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainClass {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);	
	
	
//	list.stream().forEach(System.out::println);
	
	
	
	//Integer function(String data);
//	IFunctional iFunctional = d -> d.length();
	
//    int result = list.stream().filter(x-> x==3).findFirst().orElse(-1);
//	System.out.println(result);
	
	//** java 1.8 
	// lambdas (functional programming)
	// streams -> (data structure and collection)  
	
	// special method 
	
	
//	int32 -> int
//	int64 -> long
//	uint
	
	// Boxing unBoxing
//	Boxing -> Primitive type -> Wrapper
//	UnBoxing -> Wrapper -> Primitive type
//	int x = 25;
//	Integer integer = x; // boxed
//	Integer integer1 = 55;
//	int x1 = integer1; // unboxed
	
	
	// Type Casting
	// up casting  -> implicit
	// down casting  -> explicit
//	int y = 25; // 32 bits
//	double d = y; // 64 bits -> 32bits.32bits
//	System.out.println(d);
	
	//Up casting
	 // all methods
//	IPrint iPrint = new MyApp(); // all overrided
//	 iPrint.digital();
//	 iPrint.test();
	
	// down casting
//	double d1 = 25.345;
//	int y1 = (int)d1;
//	System.out.println(y1);
	// application -> document read, print and email
	
//	MyApp myApp = new MyApp();
//	myApp.print();
//	myApp.mail();
}
}
