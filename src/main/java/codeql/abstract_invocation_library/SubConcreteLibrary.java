package codeql.abstract_invocation_library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubConcreteLibrary extends SuperAbstractLibrary {

    private static final Logger logger = LoggerFactory.getLogger(SubConcreteLibrary.class);

    @Override
    void onConnection() {
        String res = json.get(MAP_KEY);
        logger.debug("Result from map: " + res);
    }
}
