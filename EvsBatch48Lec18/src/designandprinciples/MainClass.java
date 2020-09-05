package designandprinciples;

import java.util.concurrent.TimeUnit;

public class MainClass {

	// SOLID

	/**
	 * S = Single responsibility principle O = Open close principle L = Liskov's
	 * substitution principle I = Interface segregation principle D = Dependency
	 * Inversion 1- Lower module should not depend directly to higher module but on
	 * abstraction 2- abstraction should not depend on details but details should
	 * depend on abstraction
	 * 
	 * Task -> - You have to design a university system, where fall 2020 enrolling,
	 * - Made student and teacher classes (SRP), some teachers are also lab
	 * attendents - and some are only teachers (LSP),
	 * 
	 * - There is exam fall and we need to calculate result, remember that
	 * complusory - subject fail criteria is 50% while other have 35% (OCP)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				
				System.out.println("Sepreate thread -> "+ Thread.currentThread().getName());
			}
		}); thread1.start();
		
		Thread thread = new Thread(new Runnable() {
			public void run() {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				System.out.println("Sepreate thread -> "+ Thread.currentThread().getName());
			}
		}); thread.start();
		
		
		System.out.println("Hi i am main method thread -> "+ Thread.currentThread().getName());
		
		

//		int res = MathOpr.getInstance().add(10)
//				.sub(1).mul(2).div(9).getResult();
//		System.out.println(res);

//		List<Devloper> li = Arrays.asList(new BackEndDev(), new FrontEndDev());
//		Manager m = new Manager(li);
//		m.manage();
//		AreaCalculator ac = new AreaCalculator();
//		ac.calculate(new Circle());
//		ac.calculate(new Rectange());
//		ac.calculate(new Square());

	}

}
