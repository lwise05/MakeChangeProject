package makechangeproject;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double itemAmount = 0.0;
		double paidAmount = 0.0;
		double changeAmount = 0.0;
		double result = 0;
		double newAmount = 0;
//		int changeInt = 0;

		System.out.print("Hello customer! Please enter the price of your item: ");
		itemAmount = sc.nextDouble();

		System.out.print("Please enter the amount of money you are paying with: ");
		paidAmount = sc.nextDouble();

		if (paidAmount < itemAmount) {
			System.out.print(
					"Oops! You didn't provide enough money to cover your item. Please enter an amount that covers the cost of your item: ");
			paidAmount = sc.nextDouble();
		} else if (paidAmount == itemAmount) {
			System.out.println("You paid with exact change so no change is needed. Enjoy your purchase! ");
		}

		changeAmount = paidAmount - itemAmount;
		System.out.println("Your change is $" + changeAmount);

		changeAmount = (int)changeAmount * 100;
//		System.out.println((int)changeAmount);

		// issuing out change feature ***********************

		while (changeAmount > 0) {
		if (changeAmount >= 2000) {
			result = changeAmount / 2000;
			changeAmount = changeAmount % 2000;
			System.out.print("Your change back is " + (int) (result) + " twenty dollar bill(s)");
		}

		if (changeAmount >= 1000) {
			result = changeAmount / 1000;
			changeAmount = changeAmount % 1000;
			System.out.print(" and " + (int) (result) + " ten dollar bill(s)");
		}
		if (changeAmount >= 500) {
			result = changeAmount / 500;
			changeAmount = changeAmount % 500;
			System.out.print(" and " + (int) (result) + " five dollar bill(s)");
		}
		if (changeAmount >= 100) {
			result = changeAmount / 100;
			changeAmount = changeAmount % 100;
			System.out.print(" and " + (int) (result) + " one dollar bill(s)");
		}
		if (changeAmount >= 25) {
			result = changeAmount / 25;
			changeAmount = changeAmount % 25;
			System.out.print(" and " + (int) (result) + " quarter(s)");
		}
		}
}
}