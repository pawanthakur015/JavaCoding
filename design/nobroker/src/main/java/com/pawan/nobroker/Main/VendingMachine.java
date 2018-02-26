/**
 * Problem 1
 */
package com.pawan.nobroker.Main;

import java.util.Scanner;

import com.pawan.nobroker.helper.Helper;
import com.pawan.nobroker.helper.Inventory;
import com.pawan.nobroker.service.Product;

/**
 * @author pawankumarthakur
 *
 */
public class VendingMachine {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addToInventory("Coke", 5, 5);
		inventory.addToInventory("Coke", 5, 5);
		inventory.addToInventory("Pepsi", 6, 5);
		inventory.addToInventory("Soda", 7, 5);
		
		/* user choice*/
		Scanner sc = new Scanner(System.in);
		System.out.println("select product: availlable products are Coke, Pepsi, Soda ");
		String productName = sc.next();
		System.out.println("Enter the cion");	
		int cents = sc.nextInt();
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		int tmpCents = 0;
		System.out.println("enter the cents in the form of 1, 5, 10, 25");
		while((cents-tmpCents)!=0) {
			int cent = sc.nextInt(); 
			//System.out.println("cent type : " + cent);
			if(Helper.coinValidation(cent)) {
				tmpCents +=cent;
			} else {
				System.out.println("invalid cent  please enter the valid cent");
			}
		}
		if(cents-tmpCents==0) {
			Product product = inventory.getProduct(productName);
			int change = 0;
			if(product.getProductPrice()*quantity <= cents && inventory.getProductWithCount().get(productName)>=quantity) {
				change = cents-product.getProductPrice()*quantity;
				System.out.println("--remove products from inventory--");
				for(int i=0;i<quantity;i++) {
					inventory.removeProduct(productName);
				}
				System.out.println("Thanku, please get your balance " + change);
			} else {
				System.out.println("product and quantity is not matched");
			}
		} else {
			System.out.println("invalid cents");
		}
	}

}
