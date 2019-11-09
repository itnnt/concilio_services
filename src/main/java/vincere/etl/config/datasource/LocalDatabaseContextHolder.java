package vincere.etl.config.datasource;

/**
 * Thread shared context to point to the datasource which should be used. This
 * enables context switches between different environments.
 */
public class LocalDatabaseContextHolder {

    private static final ThreadLocal<LocalDatabaseEnvironment> CONTEXT =
        new ThreadLocal<>();

    public static void set(LocalDatabaseEnvironment databaseEnvironment) {
        CONTEXT.set(databaseEnvironment);
    }

    public static LocalDatabaseEnvironment getEnvironment() {
        return CONTEXT.get();
    }

    public static void clear() {
        CONTEXT.remove();
    }

}
