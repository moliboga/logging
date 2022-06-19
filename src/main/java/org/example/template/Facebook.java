package org.example.template;

import org.example.Logger;
import org.example.Main;

public class Facebook extends Network {
    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void logIn(String userName, String password) {
        Logger.getLog().info("LogIn success on Facebook");
    }

    public void sendData(byte[] data) {
        Logger.getLog().info("Message: '" + new String(data) + "' was posted on Facebook");
    }

    public void logOut() {
        try{
            int num = 5 / 0;
        } catch (ArithmeticException e){
            Logger.getLog().error("Unexpected error");
        }
        Logger.getLog().info("User: '" + userName + "' was logged out from Facebook");
    }
}
