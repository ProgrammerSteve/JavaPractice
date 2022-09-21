package tutorial;

//interfaces are made only to be inherited from
//there won't be any instances of it
public interface Vehicle {
	//any attributes you add here have to be final
	//so it's a constant and can't be called
	final int gears =5;
	
	//create a method without any definition
	void speedUp(int a);
	void slowDown(int a);
	void changeGear(int a);
	
	default void out() {
		System.out.println("Default method");
	}
	
	static int addNine(int b) {
		return b+9;
	}
}
