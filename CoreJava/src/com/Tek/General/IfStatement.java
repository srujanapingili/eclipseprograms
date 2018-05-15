
// this is If statement program

package com.Tek.General;

public class IfStatement {

	public static void main(String[] args) {
		int firstNum, secondNum;
		firstNum = 4;
		secondNum = 9;
		if (firstNum < secondNum)
			System.out.println("secondNumber is greater than firstNumber");
		if (firstNum > secondNum)
			System.out.println("firstNumber is greater than secondNumber");
		firstNum = firstNum * 4;
		if (firstNum > secondNum)
			System.out.println("firstNumber is greater than secondNumber");
		if (firstNum == secondNum)
			System.out.println("firstNumber is equal to secondNumber");

	}

}
