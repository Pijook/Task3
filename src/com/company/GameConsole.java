package com.company;

public class GameConsole extends Device implements Games, Internet {

    private boolean hasInternetConnection;

    public GameConsole(String name, String producer, Double price, boolean hasInternetConnection) {
        super(name, producer, price);
        this.hasInternetConnection = hasInternetConnection;
    }

    @Override
    public void playGames() {
        if(!hasInternetConnection){
            System.out.println("Cannot connect to internet!");
        }
        else{
            System.out.println("Playing small theft auto!");
        }
    }

    @Override
    public void useInternet() {
        if(!hasInternetConnection){
            System.out.println("Cannot connect to internet!");
        }
        else{
            System.out.println("Entering www.youtube.com");
        }
    }

    public boolean isHasInternetConnection() {
        return hasInternetConnection;
    }

    public void setHasInternetConnection(boolean hasInternetConnection) {
        this.hasInternetConnection = hasInternetConnection;
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "hasInternetConnection=" + hasInternetConnection +
                "} " + super.toString();
    }
}
