package day2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(Main.class);
        
        log.info("Test Logger!!!");
        log.error("Test Error!");
        log.warn("Test Warning!");
        log.debug("Test Debug");
	}

}
