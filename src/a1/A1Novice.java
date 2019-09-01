package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*		
		Your code goes here.
		Calculate total cost of the items purchased by each customer
		Input: Scanner
		Output: A set of String containing customer info
		*/
		
		
		int customerTotal = scan.nextInt();
		String[] customerInfo = new String[customerTotal];
		
		// Loop for every customer
		for (int customerID = 0; customerID < customerTotal; customerID++) { 
			String customerFirstName = scan.next();
			String customerLastName = scan.next();
			int itemsTotal = scan.nextInt();
			double customerPriceTotal = 0;
			
			// Loop for every item
			for (int itemID = 0; itemID < itemsTotal; itemID ++) {
				int itemNum = scan.nextInt();
				scan.next();
				double itemPrice = scan.nextDouble();
				customerPriceTotal += itemNum * itemPrice;
				
			}
			
			customerInfo[customerID] = customerFirstName.substring(0, 1) + ". "
					 + customerLastName + ": " 
					 + String.format("%.2f", customerPriceTotal);
		}
	
		scan.close();
		
		// Loop to print out every customers' info
		for (int count = 0; count < customerInfo.length; count++) {
			System.out.println(customerInfo[count]);
		}
		
	}
	// You can define / use static helper methods here.
}

