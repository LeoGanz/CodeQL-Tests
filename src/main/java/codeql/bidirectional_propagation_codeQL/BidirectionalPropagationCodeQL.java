package codeql.bidirectional_propagation_codeQL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BidirectionalPropagationCodeQL {

    private static final Logger logger = LoggerFactory.getLogger(BidirectionalPropagationCodeQL.class);
    private static final ObjectStore objectStore = new ObjectStore();

    public static void main(String[] args) {
        String s = getString();
        logger.debug("String is " + s);
        String password = s;
        objectStore.set(password);
    }

    private static String getString() {
        return "Pass@0rd";
    }

    static class ObjectStore{
        private Object obj;
        public void set(Object obj){
            this.obj = obj;
        }
        public Object get(){
            return obj;
        }
    }

}
