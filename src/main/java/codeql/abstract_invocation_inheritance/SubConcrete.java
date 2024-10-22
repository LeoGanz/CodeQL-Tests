package codeql.abstract_invocation_inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubConcrete extends SuperAbstract {

    private static final Logger logger = LoggerFactory.getLogger(SubConcrete.class);

    public static void main(String[] args) {
        new SubConcrete().onOpen();
    }

    @Override
    void onConnection() {
        String res = json.get(MAP_KEY);
        logger.debug("Result from map: " + res);
    }
}
