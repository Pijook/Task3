package com.company;

public class MobilePhone extends Device implements Call, Text{

    private boolean hasSim;

    public MobilePhone(String name, String producer, Double price, boolean hasSim) {
        super(name, producer, price);
        this.hasSim = hasSim;
    }

    @Override
    public void call(Device device) {
        if(!hasSim){
            System.out.println(getName() + " doesn't have sim card!");
        }
        else{
            System.out.println(getName() + " is calling to " + device.getName());
        }
    }

    @Override
    public void text(Device device) {
        if(!hasSim){
            System.out.println(getName() + " doesn't have sim card!");
        }
        else{
            System.out.println(getName() + " is texting to " + device.getName());
        }
    }

    public boolean isHasSim() {
        return hasSim;
    }

    public void setHasSim(boolean hasSim) {
        this.hasSim = hasSim;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "hasSim=" + hasSim +
                "} " + super.toString();
    }
}
