package tutorial;

public class OuterClass {
	
	
	public void inner() {
		class InnerClass{
			public void display() {
				System.out.println("This is an inner class");
			}
		}
		InnerClass in=new InnerClass();
		in.display();
	}
}
