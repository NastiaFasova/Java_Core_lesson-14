package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;


public class Commodity implements Comparable<Commodity>{

	private String name;
	private double length;
	private double width;
	private double weight;
	private ArrayList<Commodity> products = new ArrayList<>();

	public Commodity(String name, double length, double width, double weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public Commodity() {}

	public void addProduct() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a name, length(cm), width(cm) and weight(kg) of the product you would like to add: ");
		String name="";
		double length=0;
		double width=0; 
		double weight=0;
		try {
			name=scan.next();
			length=scan.nextDouble();
			width=scan.nextDouble();
			weight=scan.nextDouble();
		} catch(InputMismatchException e) {
			System.err.println("Wrong input...");
			e.printStackTrace();
		}
		products.add(new Commodity(name,length,width,weight));
		print();
	}

	public void removeProduct() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a name of a product you would like to remove");
		String name=scan.next();
		Iterator<Commodity> iterator = products.iterator();
		while(iterator.hasNext()) {
			Commodity next = iterator.next();
			if(next.getName().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
		print();
	}
	
	
	public void changeProduct() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a name of a product you would like to change");
		String name=scan.next();
		int index=0;
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getName().equalsIgnoreCase(name));
			index=i;
		}
		System.out.println("Enter a name, length, width and weight of the product you would like to add: ");
		String newName="";
		double length=0;
		double width=0; 
		double weight=0;
		try {
			newName=scan.next();
			length=scan.nextDouble();
			width=scan.nextDouble();
			weight=scan.nextDouble();
		} catch(Exception e) {
			System.err.println("Wrong input...");
			e.printStackTrace();
		}
		products.set(index,new Commodity(newName,length,width,weight));
		print();
		
	}
	
	
	public void sortName() {
		System.out.println("Sorting by name: ");
		System.out.println();
		Collections.sort(products, new CommodityNameComparator());
		print();
		
	}

	public void sortLength() {
		System.out.println("Sorting by length: ");
		System.out.println();
		Collections.sort(products, new CommodityLengthComparator());
		print();
	}

	public void sortWidth() {
		System.out.println("Sorting by width: ");
		System.out.println();
		Collections.sort(products, new CommodityWidthComparator());
		print();
	}

	public void sortWeight() {
		System.out.println("Sorting by weight: ");
		System.out.println();
		Collections.sort(products, new CommodityWeightComparator());
		print();
	}

	public void printProduct() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sequence number of the element you want to be printed: ");
		int index=0;
		try {
			 index=scan.nextInt();
		} catch(Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < products.size(); i++) {
			if (index == i) {
				System.out.println(products.get(i));
			}
		}
	}

	public void exit() {
		System.exit(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}


	@Override
	public int compareTo(Commodity o) {
		if(this.getName().compareTo(o.getName())>0) {
			return 1;
		} else if(this.getName().compareTo(o.getName())<0) {
			return -1;
		} else {
			if(this.getLength()>o.getLength()) {
				return 1;
			} else if(this.getLength()<o.getLength()) {
				return -1;
			} else {
				if(this.getWidth()>o.getWidth()) {
					return 1;
				} else if(this.getWidth()<o.getWidth()) {
					return -1;
				} else {
					if(this.getWeight()>o.getWeight()) {
						return 1;
					} else if(this.getWeight()<o.getWeight()) {
						return -1;
					}
				}
			}
		}
		
			
		return 0;
	}
	public void sorting() {
		System.out.println("Sorting using comparing all the fields:");
		System.out.println();
		Collections.sort(products);
		print();
	}
	public void print() {
		for(Commodity product : products) {
			System.out.println(product);
		}
	}

}
