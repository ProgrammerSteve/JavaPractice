package tutorial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
//		//primitive data types
//		int helloWorld=9;
//		double num2=5.0;
//		boolean b=true;
//		char c='t';
//		//non-primitive data types
//		String str="tim";
//		int tim=helloWorld;
//		int x;
//		x=5;
//		int y=7;
//		int z=57;
//		int sum=x+y+z;
//		int u =z/y;
//		double d=Math.pow(x, y);
//		double div=x/(double)y;
//		System.out.println("Hello World!");
//		System.out.println(helloWorld+num2);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(str);
//		System.out.println(tim);
//		System.out.println(sum);
//		System.out.println(u);
//		System.out.println(d);
//		System.out.println(div);	
//		int x= 56 % 5;
//		System.out.println(x);
//		int a=6;
//		int b=23;
//		int c=10;
		// > < == >= <= !=
		// check is strings are equal: string1.equals("string2")
//		boolean compare= a > b || c < b;
//		System.out.println(compare);
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter an integer");
//		String scanned=sc.next();
//		int x= Integer.parseInt(scanned);
//		System.out.println(x);
		
		
//		Scanner sc= new Scanner(System.in);
//		String s=sc.nextLine();
//		if(s.equals("tim")) {
//			System.out.println("You typed tim");
//		}else if(s.equals("bob")){
//			System.out.println("You typed bob");
//		} else {
//			System.out.println("You didn't type tim or bob");
//		}
//		System.out.println("End of Program");
		
//		System.out.println("Enter your age: ");
//		Scanner sc= new Scanner(System.in);
//		String s=sc.nextLine();
//		int age=Integer.parseInt(s);
//		if(age>=18) {
//			System.out.println("input your favorite food:");
//			String food=sc.nextLine();
//			if(food.equals("pizza")) {
//				System.out.println("mine too");
//			}else {
//				System.out.println("not mine");
//			}
//			System.out.println("you are an adult");
//		}else if(age>=13){
//			System.out.println("you are a teenager");
//		}else {
//			System.out.println("you are not a teenager or an adult");
//		}
		
		//you should declare the number you want to enter into the array
		//put the type of arr you want followed by square brackets to initialize
//		int[] newArr=new int[5];
//		String[] strArr=new String[5];
//		
//		strArr[0]="hello";
//		strArr[1]="hi";
//		strArr[2]="tim";
//		strArr[3]="bill";
//		strArr[4]="joe";
//		
//		int[] nums= {2,3,54,6,6};
//		double[] nums2= {2.0,3.0};
//		
//		int x= nums[4];
//		System.out.println(x);
		
		
		//for loops
//		int x=0;
//		int[] arr= {1,5,7,3,4,5};
//		for(int i=0;i<arr.length;i++) {
//			x+=i;
//			if(arr[i]==5) {
//				System.out.println("Found a 5! at index "+i);
//			}
//		}
//		System.out.println(x);
		
		
		//for each loop
		//for int elements inside the array called arr
//		int [] arr= {1,5,7,3,4,5};
//		int count=0;
//		for(int element:arr) {
//			System.out.println(element+" "+count);
//			count++;
//		}
		
//		String[] names= new String[5];
//		Scanner sc= new Scanner(System.in);
//		for(int i=0;i<names.length;i++) {
//			System.out.print("Input name:");
//			String input=sc.nextLine();
//			names[i]=input;
//		}
//		System.out.println("");
//		System.out.println("Names inputted:");
//		for(String name:names) {
//			System.out.println(name);
//			if(name.equals("tim")) {
//				System.out.println("Encountered Tim. Breaking loop");
//				break;
//			}
//		}
		
		//while loops
//		int counter=0;
//		while(counter<5) {
//			System.out.println("count: " + counter);
//			counter++;
//		}
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Type 10...");
//		System.out.print("Type a number: ");
//		int x = sc.nextInt();
//		while(x!=10) {
//			System.out.println("Type 10...");
//			System.out.print("Type a number: ");
//			x=sc.nextInt();
//		}
		
		//do while loop
//		Scanner sc= new Scanner(System.in);
//		int x;
//		do {
//			System.out.println("Type 10...");
//			System.out.print("Type a number: ");
//			x=sc.nextInt();
//		}while(x!=10);
		
		
//		//sets and lists
//		//you need to import Set and HashSet
//		//there isn't really a specific order associated with the Set
//		//since values should be unique, adding 5 a second time won't do anything
//		Set<Integer> t= new HashSet<Integer>();
//		t.add(5);
//		t.add(7);
//		t.add(5);
//		t.add(9);
//		t.add(-8);
//		
//		//to see if something exists in a set, use contains() method
//		boolean containFive=t.contains(5);
//		
//		//to remove, use the remove() method
//		t.remove(9);
//		
//		//to clear the set, use the clear() method
//		//to see if a set is empty, use the isEmpty() method, boolean output
//		//to get length of a set, use the size() method, integer output
//		
//		System.out.println(t);
//		System.out.println(containFive);
//		
//		//Besides a HashSet, there is also a TreeSet and LinkedHashSet
//		//there is an order associated with the set
//		Set<Integer> tree= new TreeSet<Integer>();
//		tree.add(5);
//		tree.add(7);
//		tree.add(5);
//		tree.add(9);
//		tree.add(-8);
//		System.out.println("tree:");
//		System.out.println(tree);
//		
//		Set<Integer> link= new LinkedHashSet<Integer>();
//		link.add(5);
//		link.add(7);
//		link.add(5);
//		link.add(9);
//		link.add(-8);
//		System.out.println("linked:");
//		System.out.println(link);
//		
//		//To make a list, use ArrayList<Integer>
//		//and initialize with new ArrayList<Integer>()
//		//Array lists are the same as an array,but slower
//		//you can dynamically change the size by adding or removing elements
//		ArrayList<Integer> x = new ArrayList<Integer>();
//		//add with the add(value) method
//		x.add(5);
//		x.add(6);
//		x.add(7);
//		x.add(8);
//		x.add(9);
//		//get an element by index with get(index) method
//		x.get(0);
//		//set an element value by index, with the set(index,value) method
//		//you need to have an element existing at the index to change it
//		//or an error will be thrown
//		x.set(0, 4);
//		
//		//size() to get size
//		//isEmpty() to get a boolean stating if empty
//		//to get values from a certain index range, use the subList(index1,index2) method
//		//going from 0 to 2, would mean we stop before we reach 2, so 0,1
//		x.subList(0,2);
//		
//		System.out.println("ArrayList:");
//		System.out.println(x);
//		
//		System.out.println("Array SubList:");
//		System.out.println(x.subList(0,2));
//		
//		//To make a LinkedList, data structure
//		LinkedList<Integer> l=new LinkedList<Integer>();
//		l.add(1);
//		l.add(2);
//		System.out.println("linkedlist:");
//		System.out.println(l);
		
		
//		//Hash maps (HashMap, TreeMap, LinkedHashMap)
//		//a key value pair, hash tables
//		//Hash map doesn't retain an order
//		//if a value for a key is declared again, it'll override it
//		Map m= new HashMap();
//		//to add an entry, use the put(key,value) method
//		m.put("tim", 5);
//		m.put("joe", "x");
//		m.put(11, 9999);
//		m.put(11, 9998);
//		//to pull the set value for a key, use the get(key) method
//		System.out.println("map:");
//		System.out.println(m);
//		System.out.println(m.get("tim"));
//		
//		//for tree maps, keys need to be of the same datatype
//		Map tree= new TreeMap();
//		tree.put("key1", 1);
//		tree.put("key2", 2);
//		tree.put("key3", 3);
//		System.out.println("treemap:");
//		System.out.println(tree);
//		
//		//it retains the order you put items into the hash table
//		Map linkMap= new LinkedHashMap();
//		linkMap.put("key1", 1);
//		linkMap.put("key3", 3);
//		linkMap.put("key2", 2);
//		
//		//trying to get a value from a map, a null value is returned if it doesn't exist
//		//checking for the value or key can be done with containsValue(value) and containsKey(key) method
//		boolean containsTwo=linkMap.containsValue(3);
//		boolean containsKeyOne=linkMap.containsKey("key1");
//		
//		
//		System.out.println("linkMap:");
//		System.out.println(linkMap);
//		
//		System.out.print("Bool for containsTwo: ");
//		System.out.println(containsTwo);
//		
//		System.out.print("Bool for containsKeyOne: ");
//		System.out.println(containsKeyOne);
//		
//		//you can access the values of a map with the values() method
//		System.out.print("values: ");
//		System.out.println(linkMap.values());
//		
//		//you can access the keys of a map with the keySet() method
//		System.out.print("keys: ");
//		System.out.println(linkMap.keySet());
		
		
//		//examples, you can turn a string into a char array to iterate through it
//		//Using a map, we can count the number of characters in the string
//		Map m = new HashMap();
//		String str="hello my name is tim and I am cool";
//		
//		for(char x:str.toCharArray()) {
//			if(m.containsKey(x)) {
//				int old=(int) m.get(x);
//				m.put(x, old+1);
//			}else {
//				m.put(x, 1);
//			}
//		}
//		m.remove(' ');
//		System.out.println(m);
//		
//		
//		//sorting an array
//		int[] arr= {-99,5,6,3,2,8,7,1,0};
//		
//		//when using the sort method, you put the starting index and the index where you want to stop
//		//you exclude the stopping value so 1,7 will exclude index 7
//		Arrays.sort(arr,1,7);
//		
//		System.out.println("array sorted:");
//		for(int i:arr) {
//			System.out.print(i+", ");
//		}
//		
//		//excluding the index parameters will sort the entire array
//		Arrays.sort(arr);
//		System.out.println(" ");
//		System.out.println("array all sorted:");
//		for(int i:arr) {
//			System.out.print(i+", ");
//		}
		
		//calls a public method to act as a function in the main method
//		tim("hi",3);
//		System.out.println(add2(6));
//		System.out.println(strMethod("hi"));
		
		
		//created an instance of the dog class from the Dog.java file
		//the public method from the dog class can be used
		Dog tim= new Dog("Tim",4);
		Dog bill= new Dog("Bill",7);
		Dog bob= new Dog("Bob",11);
		tim.speak();
		bill.speak();
		bob.speak();
		
		//a public method getAge() was used to access the private attributes of the class
		//a public method, setAge() is also used to change the private attribute
		System.out.println("tim is "+tim.getAge());
		tim.setAge(5);
		System.out.println("tim is "+tim.getAge());
		
		//Cat class inherits from the Dog class
		//this allows us to use the same methods
		//in Cat class we overwrite the speak method in the Dog class
		Cat jill=new Cat("Jill",3,"fish");
		jill.speak();
		
		//utilizing our alternative constructor methods to make Cat objects
		Cat tom= new Cat("Tom");
		Cat jerry= new Cat("Jerry",3);
		
	}
	
	//creates a method, void returns nothing
	//Putting type of the parameter along with the name lets you have an arguement in the method
	public static void tim(String str, int x) {
		for(int i=0;i<x;i++) {
			System.out.println(str);
		}
	}
	
	public static int add2(int x) {
		return x+2;
	}
	
	public static String strMethod(String x) {
		return x+"!";
	}

}
