/**
 * 
 */
package com.pawan.nobroker.helper;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.pawan.nobroker.service.Product;
import com.pawan.nobroker.serviceImpl.Coke;
import com.pawan.nobroker.serviceImpl.Pepsi;
import com.pawan.nobroker.serviceImpl.Soda;

/**
 * @author pawankumarthakur
 *
 */
public class Inventory {
   Map<String, Integer> productWithCount;
   private Queue<Product> pepsiList;
   private Queue<Product> cokeList;
   private Queue<Product> sodaList;
   
   public Inventory() {
	   productWithCount = new HashMap<String, Integer>();
	   pepsiList = new LinkedList<Product>();
	   cokeList = new LinkedList<Product>();
	   sodaList = new LinkedList<Product>();
   }
   
   public void addToInventory(String productName, int price, int totalProducts) {
	   Product product;
	   switch(productName) {
	   case "Coke" :
		   product = new Coke(productName, price, totalProducts, totalProducts);
		   cokeList.add(product);
		   break;
	   case "Pepsi":
		   product = new Pepsi(productName, price, totalProducts, totalProducts);
		   pepsiList.add(product);
		   break;
	   case "Soda" :
		   product = new Soda(productName, price, totalProducts, totalProducts);
		   sodaList.add(product);
		   break;
		default: 
	   }
	   productWithCount.put(productName, productWithCount.get(productName)==null ? 0 : productWithCount.get(productName)+totalProducts);
   }
   
   public Product getProduct(String productName) {
	   Product product=null;
	   switch(productName) {
	   case "Coke" :
		   product = cokeList.peek();
		   break;
	   case "Pepsi":
		   product = pepsiList.peek();
		   break;
	   case "Soda" :
		   product = sodaList.peek();
		   break;
		default: 
	   }
	   return product;
   }
   
   public void removeProduct(String productName) {
	   switch(productName) {
	   case "Coke" :
		    cokeList.poll();
		   break;
	   case "Pepsi":
		   pepsiList.poll();
		   break;
	   case "Soda" :
		   sodaList.poll();
		   break;
		default: 
	   }
	   productWithCount.put(productName, productWithCount.get(productName)-1);
   }

/**
 * @return the productWithCount
 */
public Map<String, Integer> getProductWithCount() {
	return productWithCount;
}

/**
 * @return the pepsiList
 */
public Queue<Product> getPepsiList() {
	return pepsiList;
}

/**
 * @return the cokeList
 */
public Queue<Product> getCokeList() {
	return cokeList;
}

/**
 * @return the sodaList
 */
public Queue<Product> getSodaList() {
	return sodaList;
}

/**
 * @param productWithCount the productWithCount to set
 */
public void setProductWithCount(Map<String, Integer> productWithCount) {
	this.productWithCount = productWithCount;
}

/**
 * @param pepsiList the pepsiList to set
 */
public void setPepsiList(Queue<Product> pepsiList) {
	this.pepsiList = pepsiList;
}

/**
 * @param cokeList the cokeList to set
 */
public void setCokeList(Queue<Product> cokeList) {
	this.cokeList = cokeList;
}

/**
 * @param sodaList the sodaList to set
 */
public void setSodaList(Queue<Product> sodaList) {
	this.sodaList = sodaList;
}
   
}
