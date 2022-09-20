package tutorial;

//extends takes the methods from dogs and gives it to the cat class
//this is called inheritance, the Dog would be the superclass in this case
public class Cat extends Dog {
	
	private String food;
	
	public Cat(String name, int age, String food) {
		//super is used to call the constructor from the superclass Dog
		// you can still add additional attributes to the Cat constructor
		super(name,age);
		this.food=food;
	}
	
	//giving an alternative way to set up the Cat class with second and third constructor
	//by setting up default parameters, we are defining the age and food
	public Cat(String name, int age) {
		super(name,age);
		this.food="fish";
	}
	public Cat(String name) {
		super(name,0);
		this.food="fish";
	}
	
	
	//We are redefining the speak method from the Dog class and overwriting it
	//because we are accessing the private variable "name" from Dog class, 
	//we need to change it to public so the Cat class can use it with this.name
	public void speak() {
		System.out.println("Meow my name is "+ this.name+ " and I get fed "+this.food);
	}
	
	public void meow() {
		System.out.println("meow...");
	}
}
