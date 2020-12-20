package com.shaun.phone;

public class PhoneTester {
	public static void main (String[] args) {
		
	Galaxy s9 = new Galaxy("S9", 99, "Verizpn", "Ring Ding Dong");
	IPhone iphone12 = new IPhone("Iphone 12", 100 , "AT&T", "Bleep Bleep");
	
	s9.displayInfo();
	s9.ring();
	s9.unlock();
	
	System.out.println("yo");
	
	iphone12.displayInfo();
	iphone12.ring();
	iphone12.unlock();
	
	}
}