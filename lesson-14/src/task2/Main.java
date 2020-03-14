package task2;

import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Commodity c=new Commodity();
		while(true) {
			menu();
			int choice=0;
			try {
				choice=scan.nextInt();
			} catch(Exception e) {
				System.err.println("Enter a num from 1 to 9!!!!");
				e.printStackTrace();
			}
			switch(choice) {
				case 1:{
					c.addProduct();
					break;
				}
				case 2:{
					c.removeProduct();
					break;
				}
				case 3:{
					c.changeProduct();
					break;
				}
				case 4:{
					c.sortName();
					break;
				}
				case 5:{
					c.sortLength();
					break;
				}
				case 6:{
					c.sortWidth();
					break;
				}
				case 7:{
					c.sortWeight();
					break;
				}
				case 8:{
					c.printProduct();
					break;
				}
				case 9:
					c.sorting();
					break;
				
				case 10:{
					System.out.println("exit...");
					c.exit();
					break;
				}
			}
		}

	}
	public static void menu() {
		System.out.println("Enter a number of your choice: ");
		System.out.println("1. To add a product");
		System.out.println("2. To remove a product");
		System.out.println("3. To change products");
		System.out.println("4. To compare with name");
		System.out.println("5. To compare with length");
		System.out.println("6. To compare with width");
		System.out.println("7. To compare with weigth");
		System.out.println("8. To display nth element of the collection");
		System.out.println("9. To sort products using all the features...");
		System.out.println("10. To exit...");
		
	}

}
