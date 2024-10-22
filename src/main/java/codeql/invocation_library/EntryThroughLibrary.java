package codeql.invocation_library;

import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class EntryThroughLibrary extends WebSocketListener {

    private static final Logger logger = LoggerFactory.getLogger(EntryThroughLibrary.class);

    @Override
    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        String password = "Pass@0rd";
        Map<String, String> json = new HashMap<>();
        String key = "user_password";
        json.put(key, password);

        String res = json.get(key);
        logger.debug("User password is " + res);
    }

}
