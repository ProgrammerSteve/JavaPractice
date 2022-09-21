package tutorial;

public class Dog {
	//attribute variables
	//private ensures that the variables are only accessible within this class
	//name needs to be public since it gets accessed by a subclass
	//the public keyword can be changed to protected so that only files within the package
	//can see the variable
	protected String name;
	protected int age;
	
	//the static keyword lets us statically change count
	//meaning all instances of Dog will change together
	//count doesn't care about what instance it is in, it's an attribute
	//works overall in all the instances
	//In the constructor Dog.count allows us to call the attribute in
	//a static way
	protected static int count=0;
	
	//constructor method
	//this keyword is used to reference the objects attributes
	public Dog(String name, int age) {
		this.name=name;
		this.age=age;
		Dog.count+=1;
	}
	
	public void speak() {
		System.out.println("I am "+this.name+" and I am "+ this.age+" years old");
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	
	//static void is a method that's accessible without an instance of the Dog class
	//methods that aren't static need an instance to use.
	//static methods can't access attributes for an instance
	//ex. Dog.display();
	public static void display() {
		System.out.println("I am a dog");
	}
	
	//private methods can be thought of as functions that can only be used
	//in the class it is in
	//An example of using a private method is for math functions that are
	//used only within the class
	private int add2() {
		return this.age+2;
	}
}
