package codeql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class SensitiveDataInMap {

    private static final Logger logger = LoggerFactory.getLogger(SensitiveDataInMap.class);

    public static void main(String[] args) {
        String password = "Pass@0rd";
        Map<String, String> json = new HashMap<>();
        String key = "user_password";
        json.put(key, password);

        String res = json.get(key);
        logger.debug("User password is " + res);
    }
}
