package com.pawan.design.test;

import java.util.Scanner;

import com.pawan.design.bean.Currency;
import com.pawan.design.srevice.DispenseChain;
import com.pawan.design.sreviceImpl.Dollar10Despenser;
import com.pawan.design.sreviceImpl.Dollar20Despenser;
import com.pawan.design.sreviceImpl.Dollar50Despenser;

public class ATMDispenseChainTest {

	private DispenseChain dispenseChain1;
	
	public ATMDispenseChainTest() {
		this.dispenseChain1 = new Dollar50Despenser();
		DispenseChain dispenseChain2 = new Dollar20Despenser();
		DispenseChain dispenseChain3 = new Dollar10Despenser();
		
		dispenseChain1.setNextChain(dispenseChain2);
		dispenseChain2.setNextChain(dispenseChain3);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ATMDispenseChainTest atmDispenser = new ATMDispenseChainTest();
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		atmDispenser.dispenseChain1.dispense(new Currency(amount));
	}

}
