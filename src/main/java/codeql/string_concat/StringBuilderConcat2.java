package codeql.string_concat;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringBuilderConcat2 {
    private static final Logger logger = LoggerFactory.getLogger(StringBuilderConcat2.class);

    public static void main(String[] args) {
        String s = "ljklkjljklkjlj";
        StringBuilder passwords = new StringBuilder();
        passwords.append("123456");
        passwords.append(s);
        logger.debug(passwords.toString());
    }
}
