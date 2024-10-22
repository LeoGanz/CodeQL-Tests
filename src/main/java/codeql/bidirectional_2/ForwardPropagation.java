package codeql.bidirectional_2;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ForwardPropagation {

    private static final Logger logger = LoggerFactory.getLogger(ForwardPropagation.class);
    private static final Map<String, String> json = new HashMap<>();

    public static void main(String[] args) {
        String s = getString();
        String password = s;
        json.put("password", password);
        logger.debug("Object is " + password);
    }

    private static String getString() {
        return "Pass@0rd";
    }
}
