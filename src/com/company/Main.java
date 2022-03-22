package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GameConsole gameConsole = new GameConsole("PlayStation 17", "Suny", 2500.0, true);
        LandlinePhone phone = new LandlinePhone("Nokia 310", "Samsung", 12.0);
        MobilePhone mobilePhone = new MobilePhone("Nokis 4421", "Lenuvo", 123.0, true);
        Smartphone smartphone = new Smartphone("Iphun", "Addle", 7000.0, true, true);

        gameConsole.playGames();

        phone.call(mobilePhone);

        mobilePhone.call(smartphone);
        mobilePhone.text(smartphone);

        smartphone.call(phone);
        smartphone.text(mobilePhone);
        smartphone.playGames();
        smartphone.useInternet();

        Device[] devices = {gameConsole, phone, mobilePhone, smartphone};

        for(Device device : devices){
            System.out.println(device);
        }

        System.out.println("=====");

        Arrays.sort(devices, new Comparator<Device>() {
            @Override
            public int compare(Device o1, Device o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });

        for(Device device : devices){
            System.out.println(device);
        }
    }
}
