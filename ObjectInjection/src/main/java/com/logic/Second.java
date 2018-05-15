package com.logic;

public class Second {
	Third thirdA;
	Third thirdB;

	public void setThirdA(Third three) {
		this.thirdA = three;
	}

	public void setThirdB(Third three) {
		this.thirdB = three;
	}
	public void method() {
		System.out.println("the third class object values are   " + thirdA.getName()+"   " + thirdA.getA());
		System.out.println("the third class object values are  " + thirdB.getName() + "   "+ thirdB.getA());
		
	}

}
