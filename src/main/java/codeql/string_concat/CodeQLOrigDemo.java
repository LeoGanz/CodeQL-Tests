package codeql.string_concat;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodeQLOrigDemo {

    private static final Logger logger = LoggerFactory.getLogger(CodeQLOrigDemo.class);

    public static void main(String[] args) {
        String oAuthToken = "ljklkjljklkjlj";

        // BAD: user oAuthToken is written to debug log
        String message = "User oAuthToken is " + oAuthToken;
        logger.debug(message);
    }
}
