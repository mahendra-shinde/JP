package com.mahendra;

import org.apache.log4j.Logger;
public class Main {

    //Create a new Logger object for class "Main"
    //Inherits all properties from "rootLogger"
    static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        log.info("Info Message!");
        log.debug("Debug Message");
        log.error("Error Message");
        log.fatal("Exception Occurred",new RuntimeException("Dummy"));

    }
}
