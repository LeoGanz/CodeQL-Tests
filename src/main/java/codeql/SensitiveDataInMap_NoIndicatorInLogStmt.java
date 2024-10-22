package codeql;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


public class SensitiveDataInMap_NoIndicatorInLogStmt {

    private static final Logger logger = LogManager.getLogger(SensitiveDataInMap_NoIndicatorInLogStmt.class);

    public static void main(String[] args) {
        String password = "Pass@0rd";
        Map<String, String> json = new HashMap<>();
        String key = "user_password";
        json.put(key, password);

        String res = json.get(key);
        logger.debug("Result from map: " + res);
    }
}
