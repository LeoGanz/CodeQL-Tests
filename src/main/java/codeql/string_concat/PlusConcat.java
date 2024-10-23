package codeql.string_concat;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlusConcat {

    private static final Logger logger = LoggerFactory.getLogger(PlusConcat.class);

    public static void main(String[] args) {
        String s = "ljklkjljklkjlj";
        String message = "User password is: " + s;
        logger.debug(message);
    }
}
