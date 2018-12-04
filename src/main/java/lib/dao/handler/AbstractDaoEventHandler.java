package lib.dao.handler;

import java.util.List;

public class AbstractDaoEventHandler { public interface Callback {
    void handleQuery(String queryName, boolean resultCountBigger, List results);
    boolean isQueryToDbAllowed();
    Integer getMaxResults();
}

    private static Callback nextQueryCallback;

    public static void setNextQueryCallback(Callback callback) {
        AbstractDaoEventHandler.nextQueryCallback = callback;
    }

    public static boolean isNextQueryCallbackQueued() {
        return nextQueryCallback != null;
    }

    public static Callback getNextQueryCallback() {
        Callback callback = nextQueryCallback;
        nextQueryCallback = null;

        return callback;
    }

    public static void ignore() {
        nextQueryCallback = null;
    }
}