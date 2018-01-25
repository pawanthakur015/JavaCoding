/**
 * 
 */
package com.pawan.design.sreviceImpl;

import com.pawan.design.bean.Currency;
import com.pawan.design.srevice.DispenseChain;

/**
 * @author pawankumarthakur
 *
 */
public class Dollar10Despenser implements DispenseChain {

	private DispenseChain dispenseChain;

	@Override
	public void setNextChain(DispenseChain dispenseChain) {
		this.dispenseChain = dispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		int currencyTmp = currency.getCurrency();
		if (currencyTmp >= 10) {
			int num = currencyTmp / 10;
			System.out.println("Total number of 10$ " + num + " dispense currency --");
			int remaining = currencyTmp % 10;
			if (remaining != 0) {
				this.dispenseChain.dispense(new Currency(remaining));
			}
		} else {
			this.dispenseChain.dispense(currency);
		}
	}

}
