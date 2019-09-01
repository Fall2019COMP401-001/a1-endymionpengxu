package a1;

import java.util.Scanner;

public class A1Adept {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Your code goes here.
		
		/* Calculate the total cost of items purchased by each customer
		 * And then compare these values
		 * to find the biggest cost, smallest cost and average cost
		 * Input: Scanner
		 * Output: A formatted String series containing the biggest, smallest, and average costs
		 */
		
		int allItemCount = scan.nextInt();
		String[] itemList = new String[allItemCount];
		double[] itemPriceList = new double[allItemCount];
		
		for (int itemID = 0; itemID < allItemCount; itemID++) {
			itemList[itemID] = scan.next();
			itemPriceList[itemID] = scan.nextDouble();
		}
		
		int allCustomerCount = scan.nextInt();
		String[] customerInfo = new String[allCustomerCount];
		double[] customerOrderInfo = new double[allCustomerCount];
		
		for (int customerID = 0; customerID < allCustomerCount; customerID ++) {
			String customerFirstName = scan.next();
			String customerLastName = scan.next();
			int itemCount = scan.nextInt();
			double customerPrice = 0;
			
			for (int itemID = 0; itemID < itemCount; itemID ++) {
				
				int itemAmount = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = 0;
				
				for (int count = 0; count < itemList.length; count++) {
					if (itemName.equals(itemList[count])) { 
						itemPrice = itemPriceList[count];
					}
				}
				
				customerPrice += itemPrice * itemAmount;
				
			}
			
			customerInfo[customerID] = customerFirstName + " " + customerLastName;
			customerOrderInfo[customerID] = customerPrice;
		}
		
		scan.close();
		
		int highestPriceID = 0;
		int lowestPriceID = 0;
		double highestPrice = customerOrderInfo[0];
		double lowestPrice = customerOrderInfo[0];
		double priceSum = 0;
		
		for (int customerID = 0; customerID < customerInfo.length; customerID ++) {
			if (highestPrice < customerOrderInfo[customerID]) {
				highestPrice = customerOrderInfo[customerID];
				highestPriceID = customerID;
			} else if (lowestPrice > customerOrderInfo[customerID]) {
				lowestPrice = customerOrderInfo[customerID];
				lowestPriceID = customerID;
			}
			
			priceSum += customerOrderInfo[customerID];
			
		}
			
		System.out.println("Biggest: " + customerInfo[highestPriceID] 
				+ " (" + String.format("%.2f", highestPrice) + ")");
		System.out.println("Smallest: " + customerInfo[lowestPriceID] 
				+ " (" + String.format("%.2f", lowestPrice) + ")");
		System.out.println("Average: " + String.format("%.2f", priceSum / allCustomerCount));
		
	}
	
	// You can define / use static helper methods here.

	
}