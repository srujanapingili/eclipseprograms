package com.Tek.General;

public class For_Each {
	public void each() {
		int array[]= {1,4,5,6};
		int sum=0;
		for(int array1:array) {
			System.out.println("the value is  "+array1);
			sum+=array1;
			if(array1==1)break;
							}
		System.out.println("the summation is   "+sum);
	}

	public static void main(String[] args) {
		For_Each fe=new For_Each();
		fe.each();

	}

}
