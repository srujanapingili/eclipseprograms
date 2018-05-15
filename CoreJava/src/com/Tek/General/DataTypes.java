package com.Tek.General;

public class DataTypes {
	public void cal(int days) {
	long hours;
	long minutes;
	hours=days*24;
	minutes=hours*60;
	System.out.println("the days of "+days);
	System.out.println(days +"days contain" +hours +"hours" );
	
	System.out.println(hours +"hours contain"+minutes+"minutes");
	}


	public static void main(String[] args) {
		DataTypes data=new DataTypes();
		data.cal(8);
	

	}

}
