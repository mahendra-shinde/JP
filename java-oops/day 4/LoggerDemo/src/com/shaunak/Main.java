package com.shaunak;
import org.apache.log4j.Logger;
//import java.util.logging.Logger;

public class Main {

    static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
	// write your code here
        log.info("Info Message!");
        log.debug("Debug Message!");
        log.error("Error Message!");
        log.fatal("Exception Occur",new RuntimeException("Dummy"));
    }
}
