package makechangeproject;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double itemAmount = 0.0;
		double paidAmount = 0.0;
		double changeAmount = 0.0;
		double result = 0.0;

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

		changeAmount = round(changeAmount * 100);

		System.out.println("");
		System.out.println("Your change is $" + (changeAmount / 100) + " ." + " Your change will be given back in: ");

//		System.out.println((int)changeAmount);

		// issuing out change feature ***********************

		while (changeAmount > 0) {
			if (changeAmount >= 2000) {
				result = changeAmount / 2000;
				changeAmount = changeAmount % 2000;
				System.out.print((int) (result) + " twenty dollar bill(s), ");
			}

			if (changeAmount >= 1000) {
				result = changeAmount / 1000;
				changeAmount = changeAmount % 1000;
				System.out.print((int) (result) + " ten dollar bill(s), ");
			}
			if (changeAmount >= 500) {
				result = changeAmount / 500;
				changeAmount = changeAmount % 500;
				System.out.print((int) (result) + " five dollar bill(s), ");
			}
			if (changeAmount >= 100) {
				result = changeAmount / 100;
				changeAmount = changeAmount % 100;
				System.out.print((int) (result) + " one dollar bill(s), ");
			}

			if (changeAmount >= 25) {
				result = changeAmount / 25;
				changeAmount = changeAmount % 25;
				System.out.print((int) result + " quarter(s), ");
			}
			if (changeAmount >= 10) {
				result = changeAmount / 10;
				changeAmount = changeAmount % 10;
				System.out.print((int) result + " dime(s), ");
			}
			if (changeAmount >= 5) {
				result = changeAmount / 5;
				changeAmount = changeAmount % 5;
				System.out.print((int) result + " nickel(s), ");
			}
			if (changeAmount >= 1) {
				result = changeAmount / 1;
				changeAmount = changeAmount % 1;
				System.out.print((int) result + " pennie(s), ");
				break;
			}
		}
	}

	public static int round(double changeAmount) {
		int round = 0;
		if (changeAmount >= 0) {
			round = (int) (changeAmount + 0.09);
		}
		return round;
	}
}
