package org.example.template;

import org.example.Logger;

public class Twitter extends Network {

    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void logIn(String userName, String password) {
        Logger.getLog().info("LogIn success on Twitter");
    }

    public void sendData(byte[] data) {
        Logger.getLog().info("Message: '" + new String(data) + "' was posted on Twitter");
    }

    public void logOut() {
        Logger.getLog().info("User: '" + userName + "' was logged out from Twitter");
    }
}