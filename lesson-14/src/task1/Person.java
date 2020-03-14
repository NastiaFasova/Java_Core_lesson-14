package task1;
import java.util.ArrayList;

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	@Override
	public int compareTo(Person o) {
		if(this.name.compareTo(o.getName())>0) {
			return 1;
		} else if(this.name.compareTo(o.getName())<0) {
			return -1;
		} else {
			if(this.age>o.getAge()) {
				return 1;
			} else if(this.age<o.getAge()) {
				return -1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	

}
