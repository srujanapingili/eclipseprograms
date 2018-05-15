package com.Tek.General;

public class ArrayAverage {
	public void average() {
		int numbers[]= {1,2,3,10};
		int total=0;
		for(int sum=0;sum<4;sum++)
			total=total+numbers[sum];
			System.out.println("the average of four numbers is  " + total/4);
	}

	public static void main(String[] args) {
		ArrayAverage arrayav=new ArrayAverage();
		arrayav.average();

	}

}
