package codeql;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


public class SensitiveDataInMap {

    private static final Logger logger = LogManager.getLogger(SensitiveDataInMap.class);

    public static void main(String[] args) {
        String password = "Pass@0rd";
        Map<String, String> json = new HashMap<>();
        String key = "user_password";
        json.put(key, password);

        String res = json.get(key);
        logger.debug("User password is " + res);
    }
}
