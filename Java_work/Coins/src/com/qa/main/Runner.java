package com.qa.main;

import com.qa.coinage.CoinCounting;

public class Runner {

	public static void main(String[] args) {
		CoinCounting calc = new CoinCounting(458, 2000);
		System.out.println(calc.getInitialChange() + " divded as: \n" + calc.printNoOfCoins());

	}
}