package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Your code goes here.
		
		/*
		 * Calculate the times each items were purhased 
		 * and the number of customers purchasing this item
		 * Input: Scanner
		 * Output: A formatted series of strings
		 *         stating how many customers purchased how many this items.
		 */
		
		int allItemCount = scan.nextInt();
		String[] itemList = new String[allItemCount];
		double[] itemPriceList = new double[allItemCount];
		int[] itemCounter = new int[allItemCount];
		int[] itemCustomerCounter = new int[allItemCount];
		
		for (int itemID = 0; itemID < allItemCount; itemID ++) {
			itemList[itemID] = scan.next();
			itemPriceList[itemID] = scan.nextDouble();
			itemCounter[itemID] = 0;
			itemCustomerCounter[itemID] = 0;
		}
		
		int allCustomerCount = scan.nextInt();
		
		for (int customerID = 0; customerID < allCustomerCount; customerID ++) {
			scan.next(); // Input customer first name
			scan.next(); // Input customer last name
			int itemCount = scan.nextInt();
			boolean[] itemStatus = new boolean[allItemCount];
			
			for (int itemID = 0; itemID < allItemCount; itemID ++) {
				itemStatus[itemID] = false;
			}
			
			for (int itemID = 0; itemID < itemCount; itemID ++) {
				int itemNum = scan.nextInt();
				String itemName = scan.next();
				
				for (int loopCount = 0; loopCount < itemList.length; loopCount ++) {
					if (itemName.equals(itemList[loopCount])) {
						itemCounter[loopCount] += itemNum;
						if (!itemStatus[loopCount]) {
							itemStatus[loopCount] = true;
							itemCustomerCounter[loopCount] ++;
							
						}
					}
				}
				
			}
		}
		
		scan.close();
 		
		for (int itemID = 0; itemID < itemCounter.length; itemID ++) {
			if (itemCounter[itemID] == 0) {
				System.out.println("No customers bought " + itemList[itemID]);
			} else {
				System.out.println(itemCustomerCounter[itemID] 
						+ " customers bought " + itemCounter[itemID] 
						+ " " + itemList[itemID]);
			}
		}
		
	}
	
	// You can define / use static helper methods here.
}