package com.company;

public class LandlinePhone extends Device implements Call {

    public LandlinePhone(String name, String producer, Double price) {
        super(name, producer, price);
    }

    @Override
    public void call(Device device) {
        System.out.println(getName() + " is calling to " + device.getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
