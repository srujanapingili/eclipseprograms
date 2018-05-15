package com.Tek.General;

public class PrimeNumber {
	public void prime() {
		int number;
		boolean ispri;
		number=8;
		if(number<2)ispri=false;
		else ispri=true;
		for(int sum=2;sum<=number/sum;sum++) {
			if(number%2==0) {
				ispri=false;
				break;
			}
		}
		if(ispri)System.out.println("the number is prime");
		else System.out.println("the value is not prime");
	}

	public static void main(String[] args) {
		PrimeNumber pn=new PrimeNumber();
		pn.prime();

	}

}
