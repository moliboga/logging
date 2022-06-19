package org.example;

import org.apache.log4j.PropertyConfigurator;

import java.io.File;

public class Logger {
    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Logger.class);

    static{
        String log4jConfigFile = System.getProperty("user.dir")
                + File.separator + "log4j.properties";
        PropertyConfigurator.configure(log4jConfigFile);
    }

    public static org.apache.log4j.Logger getLog(){
        return log;
    }
}
