package codeql.string_concat;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringBuilderConcat {

    private static final Logger logger = LoggerFactory.getLogger(StringBuilderConcat.class);

    public static void main(String[] args) {
        String s = "ljklkjljklkjlj";
        StringBuilder sb = new StringBuilder();
        sb.append("User password is: ");
        sb.append(s);
        logger.debug(sb.toString());
    }
}
