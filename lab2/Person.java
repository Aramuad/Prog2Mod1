package lab2;
import java.util.Scanner;
public class Person {
	
	private String first;
	private String last;
	
	Person() {
		first = "Bob";
		last = "Smith";
	}
	Person(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public void setFirst(String firstName) {
		first = firstName;
	}
	public void setLast(String lastName) {
		last = lastName;
	}
	@Override
	public String toString() {
		return first + " " + last;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("Enter your first name: ");
		String fName = sc.nextLine();
		System.out.println("Enter your last name: ");
		String lName = sc.nextLine();
		Person p2 = new Person(fName, lName);
		System.out.println("Person 1: " + p1.toString());
		System.out.println("Person 2: " + p2.toString());
		p1.setFirst("Aly");
		p2.setLast("Sanchez");
		System.out.println("Person 1: " + p1.getFirst() + " " + p1.getLast());
		System.out.println("Person 2: " + p2.getFirst() + " " + p2.getLast());
	}

}
