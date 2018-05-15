package com.Tek.General;

public class ExampleSwitch {
	public void days() {
		int sun=10;
		String reason;
		switch(sun) {
			case 0:
			case 3:
			case 2:
				reason="working day";
				System.out.println(reason);
				break;
			case 7:
			case 5: 
			case 6:
				reason="holiday";
				System.out.println(reason);
				break;
				default: 
					reason="noday";
					System.out.println(reason);
		
	}
	}
	public static void main(String[] args) {
		ExampleSwitch ex=new ExampleSwitch();
		ex.days();


	}

}
