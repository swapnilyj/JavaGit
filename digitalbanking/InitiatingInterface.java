package com.digitalbanking;

public class InitiatingInterface implements PopMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InitiatingInterface ii = new InitiatingInterface();
		ii.p2p_transfer();
	}

	public void p2p_transfer(){
		System.out.println("Successfully printed interface method");
		System.out.println("Variable sum is ");
		System.out.println(a+b);
	}
}
