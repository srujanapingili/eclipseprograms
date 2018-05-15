package com.Tek.General;
public class BlocksCode {
	public BlocksCode() {
		int sum1, sum2;
		sum2 = 10;
		for (sum1 = 0; sum1 < 4; sum1++) {
			System.out.println("the value of x is:  " + sum1);
			System.out.println("the value of y is:  " + sum2);
			sum2 = sum2 - 1;
		}

	}

	public static void main(String[] args) {
		BlocksCode block = new BlocksCode();

	}

}
