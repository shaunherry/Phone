package com.shaun.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        System.out.println(this.getVersionNumber() +" says " + this.getRingTone());
        return null;    }
    @Override
    public String unlock() {
        System.out.println("Unlocking");
        return null;    }
    @Override
    public void displayInfo() {
        System.out.println(this.getVersionNumber() + " from "+ this.getCarrier()); 
 
    }
}

