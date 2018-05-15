package com.Tek.General;

public class If_Else_If {
	public void days() {
		int check = 7;
		String str;
		if (check == 1 || check == 2 || check == 8)
			str = "monday";
		else if (check == 7 || check == 9 || check == 3)
			str = "sunday";
		else
			str = "no day";
		System.out.println("the day is  " + str);
	}

	public static void main(String[] args) {
		If_Else_If obje = new If_Else_If();
		obje.days();

	}

}
