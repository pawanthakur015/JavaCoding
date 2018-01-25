/**
 * 
 */
package com.pawan.design.srevice;

import com.pawan.design.bean.Currency;

/**
 * @author pawankumarthakur
 *
 */
public interface DispenseChain {
	
	public void setNextChain(DispenseChain dispenseChain);
	public void dispense(Currency currency);

}
