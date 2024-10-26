package makechangeproject;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double itemAmount = 0.0;
		double paidAmount = 0.0;
		int changeAmount = 0;
//		int changeInt = 0;

		System.out.print("Hello customer! Please enter the price of your item: ");
		itemAmount = sc.nextDouble();
		
		System.out.print("Please enter the amount of money you are paying with: ");
		paidAmount = sc.nextDouble();
		
		if (paidAmount < itemAmount) {
			System.out.print("Oops! You didn't provide enough money to cover your item. Please enter an amount that covers the cost of your item: ");
			paidAmount = sc.nextDouble();
		}
		else if (paidAmount == itemAmount) {
			System.out.println("You paid with exact change so no change is needed. Enjoy your purchase! ");
		}
		
		changeAmount = (int)((paidAmount - itemAmount) * 100) ;
//		System.out.println(changeAmount);
//		changeAmount = changeAmount * 100;
//		System.out.println(changeAmount);
//		changeInt = (int) (changeAmount);
		System.out.println(changeAmount);
		
		if (changeAmount % 20 == 1) {
			System.out.println(changeAmount);
		}
		
	}

}
