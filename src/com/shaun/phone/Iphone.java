package com.shaun.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	System.out.println(this.getVersionNumber() +" says " + this.getRingTone());
        return null;    }
    @Override
    public String unlock() {
    	System.out.println("Unlocking via facial recognition");
        return null;
    }
    @Override
    public void displayInfo() {
    	System.out.println(this.getVersionNumber() + " from " +this.getCarrier()); 
    }           
    }
}

