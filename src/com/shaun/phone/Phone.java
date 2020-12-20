package com.shaun.phone;

public abstract class Phone {
	private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    public String getVersionNumber() {
    	return versionNumber;
    }
    
    public String getCarrier() {
    	return carrier;
    	
    }
    
    public abstract void displayInfo();
    
    

}
