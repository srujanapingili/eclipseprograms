package com.Tek.General;

public class Do_While_Loop {
	public void comp() {
		int fix = 1;
		do {
			System.out.println("the value is   " + fix);
			fix--;
		} while (fix > 0);
	}

	public static void main(String[] args) {
		Do_While_Loop dwl = new Do_While_Loop();
		dwl.comp();

	}

}
