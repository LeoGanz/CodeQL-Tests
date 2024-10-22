package codeql;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


public class SensitiveDataInMap_OnlyKeyAsIndicator {

    private static final Logger logger = LogManager.getLogger(SensitiveDataInMap_OnlyKeyAsIndicator.class);

    public static void main(String[] args) {
        String s = "1234";
        Map<String, String> json = new HashMap<>();
        String key = "user_password";
        json.put(key, s);

        String res = json.get(key);
        logger.debug("Result from map: " + res);
    }
}
