package task1;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> persons=new ArrayList<>();
		persons.add(new Person("Ivan",43));
		persons.add(new Person("Oleh",12));
		persons.add(new Person("Vadym",12));
		persons.add(new Person("Oleksandr",32));
		persons.add(new Person("Oleksandr",78));
		persons.add(new Person("Anton",32));
		persons.add(new Person("Oleh",65));
		
		System.out.println("Before sorting:");
		for(Person person:persons) {
			System.out.println(person);
		}
		System.out.println();
		System.out.println("After sorting using Comparable");
		Collections.sort(persons);
		for(Person person:persons) {
			System.out.println(person);
		}
		System.out.println();
		System.out.println("After sorting using Comparator");
		Collections.sort(persons,new PersonAllFieldsComparator());
		for(Person person:persons) {
			System.out.println(person);
		}
	}

}
