package codeql.abstract_invocation_library;

import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public abstract class SuperAbstractLibrary extends WebSocketListener {
    public static final String MAP_KEY = "user_password";
    protected Map<String, String> json;

    public SuperAbstractLibrary() {
        String password = "Pass@0rd";
        json = new HashMap<>();
        json.put(MAP_KEY, password);
    }

    @Override
    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        onConnection();
    }

    abstract void onConnection();
}
