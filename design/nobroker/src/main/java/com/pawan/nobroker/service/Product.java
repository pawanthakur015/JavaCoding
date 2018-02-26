/**
 * 
 */
package com.pawan.nobroker.service;

/**
 * @author pawankumarthakur
 *
 */
public class Product {

	String productName;
	int  productPrice;
	int totalProducts;
	int availableProduct;
	
	
	public Product(String productName, int productPrice, int totalProducts, int availableProduct) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.totalProducts = totalProducts;
		this.availableProduct = availableProduct;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @return the productPrice
	 */
	public int getProductPrice() {
		return productPrice;
	}
	/**
	 * @return the totalProducts
	 */
	public int getTotalProducts() {
		return totalProducts;
	}
	/**
	 * @return the availableProduct
	 */
	public int getAvailableProduct() {
		return availableProduct;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @param totalProducts the totalProducts to set
	 */
	public void setTotalProducts(int totalProducts) {
		this.totalProducts = totalProducts;
	}
	/**
	 * @param availableProduct the availableProduct to set
	 */
	public void setAvailableProduct(int availableProduct) {
		this.availableProduct = availableProduct;
	}
	
	
	
}
