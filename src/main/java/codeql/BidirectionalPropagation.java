package codeql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class BidirectionalPropagation {

    private static final Logger logger = LoggerFactory.getLogger(BidirectionalPropagation.class);

    public static void main(String[] args) {
        String s = "Pass@0rd";
        logger.debug("Contents of s: " + s);
        String password = s;
        doWork(password);
    }

    private static void doWork(String password) {
        Map<String, String> json = new HashMap<>();
        json.put("user_password", password);
    }

}
