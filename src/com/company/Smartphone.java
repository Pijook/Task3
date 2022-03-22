package com.company;

public class Smartphone extends Device implements Call, Games, Internet, Text {

    private boolean hasInternetConnection;
    private boolean hasSim;

    public Smartphone(String name, String producer, Double price, boolean hasInternetConnection, boolean hasSim) {
        super(name, producer, price);
        this.hasInternetConnection = hasInternetConnection;
        this.hasSim = hasSim;
    }

    public boolean isHasInternetConnection() {
        return hasInternetConnection;
    }

    public void setHasInternetConnection(boolean hasInternetConnection) {
        this.hasInternetConnection = hasInternetConnection;
    }

    public boolean isHasSim() {
        return hasSim;
    }

    public void setHasSim(boolean hasSim) {
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

    @Override
    public void playGames() {
        if(!hasInternetConnection){
            System.out.println("Cannot connect to internet!");
        }
        else{
            System.out.println("Playing peaceful birds!");
        }
    }

    @Override
    public void useInternet() {
        if(!hasInternetConnection){
            System.out.println("Cannot connect to internet!");
        }
        else{
            System.out.println("Entering www.reddit.com");
        }
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "hasInternetConnection=" + hasInternetConnection +
                ", hasSim=" + hasSim +
                "} " + super.toString();
    }
}
