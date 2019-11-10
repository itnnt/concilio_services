package vincere.etl.config.datasource;

/**
 * Thread shared context to point to the datasource which should be used. This
 * enables context switches between different environments.
 */
public class RemoteDatabaseContextHolder {

    private static final ThreadLocal<RemoteDatabaseEnvironment> CONTEXT =
        new ThreadLocal<>();

    public static void set(RemoteDatabaseEnvironment databaseEnvironment) {
        CONTEXT.set(databaseEnvironment);
    }

    public static RemoteDatabaseEnvironment getEnvironment() {
        return CONTEXT.get();
    }

    public static void clear() {
        CONTEXT.remove();
    }

}
