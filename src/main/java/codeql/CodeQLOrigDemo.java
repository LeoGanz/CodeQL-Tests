package codeql;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodeQLOrigDemo {

    private static final Logger logger = LoggerFactory.getLogger(CodeQLOrigDemo.class);

    public static void main(String[] args) {
        String password = "Pass@0rd";

        // BAD: user password is written to debug log
        logger.debug("User password is " + password);
    }
}
