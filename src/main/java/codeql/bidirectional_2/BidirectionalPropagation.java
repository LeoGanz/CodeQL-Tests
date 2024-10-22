package codeql.bidirectional_2;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class BidirectionalPropagation {

    private static final Logger logger = LoggerFactory.getLogger(BidirectionalPropagation.class);
    private static final Map<String, String> json = new HashMap<>();

    public static void main(String[] args) {
        String s = getString();
        logger.debug("String is " + s);
        String password = s;
        json.put("password", password);
    }

    private static String getString() {
        return "Pass@0rd";
    }

}
