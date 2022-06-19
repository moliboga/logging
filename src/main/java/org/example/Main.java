package org.example;

import org.example.template.Facebook;
import org.example.template.Network;
import org.example.template.Twitter;

public class Main {

    public static void main(String[] args) {

        Network network = null;
        String userName = "artem";
        String password = "135246";
        String message = "artem message";

        int choice = 1;
//        int choice = 2;

        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }

        network.post(message);
    }
}