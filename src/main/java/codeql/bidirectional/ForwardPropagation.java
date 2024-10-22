package codeql.bidirectional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ForwardPropagation {

    private static final Logger logger = LoggerFactory.getLogger(ForwardPropagation.class);
    private static final Map<String, String> json = Map.of("password", "Pass@0rd");

    public static void main(String[] args) {
        String password = json.get("password");
        logger.debug(json.toString());
    }

}
