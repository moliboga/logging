package org.example.template;

import org.example.Logger;
import org.example.Main;

public abstract class Network {
    String userName;
    String password;

    Network() {}

    public void post(String message) {
        Logger.getLog().info("Checking user's parameters");
        Logger.getLog().info("Name - " + this.userName);
        Logger.getLog().info("Password - " + "*".repeat(this.password.length()));
        simulateNetworkLatency();
        logIn(this.userName, this.password);
        sendData(message.getBytes());
        logOut();
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
            System.out.println("\n");
        } catch (InterruptedException ex) {
            Logger.getLog().fatal("Interrupted exception...");
        }
    }

    abstract void logIn(String userName, String password);
    abstract void sendData(byte[] data);
    abstract void logOut();
}