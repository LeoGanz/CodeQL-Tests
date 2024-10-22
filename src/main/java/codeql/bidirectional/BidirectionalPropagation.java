package codeql.bidirectional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class BidirectionalPropagation {

    private static final Logger logger = LoggerFactory.getLogger(BidirectionalPropagation.class);
    private static final Map<String, String> json = Map.of("password", "Pass@0rd");

    public static void main(String[] args) {
        logger.debug(json.toString());
        String password = json.get("password");
        doWork(password);
    }

    private static void doWork(String password) {
    }

}
