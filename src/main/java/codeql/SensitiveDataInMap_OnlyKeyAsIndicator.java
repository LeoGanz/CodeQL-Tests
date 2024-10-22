package codeql;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Map;


public class SensitiveDataInMap_OnlyKeyAsIndicator {

    private static final Logger logger = LoggerFactory.getLogger(SensitiveDataInMap_OnlyKeyAsIndicator.class);

    public static void main(String[] args) {
        String s = "Pass@0rd";
        Map<String, String> json = new HashMap<>();
        String key = "password";
        json.put(key, s);

        String res = json.get(key);
        logger.debug("Result from map: " + res);
    }
}
