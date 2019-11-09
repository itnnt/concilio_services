package vincere.etl.config.routing;

public enum DatabaseEnvironment {
    strivesale_vincere_io("strivesale.vincere.io.datasource.url"
            , "strivesale.vincere.io.datasource.username"
            , "strivesale.vincere.io.datasource.password"
            , "hibernate.dialect.override"
    ),
    tung_vincere_io("tung.vincere.io.datasource.url"
            , "tung.vincere.io.datasource.username"
            , "tung.vincere.io.datasource.password"
            , "hibernate.dialect.override"
    ),
    ;

    public final String url;
    public final String username;
    public final String password;
    public final String dialect;

    DatabaseEnvironment(String url, String username, String password, String dialect) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.dialect = dialect;
    }
}
