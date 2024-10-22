package codeql;

import java.util.HashMap;
import java.util.Map;

public abstract class SuperAbstract {
    public static final String MAP_KEY = "user_password";
    protected Map<String, String> json;

    public SuperAbstract() {
        String password = "Pass@0rd";
        json = new HashMap<>();
        json.put(MAP_KEY, password);
    }

    public void onOpen() {
        onConnection();
    }

    abstract void onConnection();
}
