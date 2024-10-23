package codeql.string_concat;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlusConcat2 {

    private static final Logger logger = LoggerFactory.getLogger(PlusConcat2.class);

    public static void main(String[] args) {
        String s = "ljklkjljklkjlj";
        logger.debug("User password is: " + s);
    }
}
