package concilio.config.routing;

public enum DatabaseEnvironment {

    DEVELOPMENT("", "", "", ""),
    TESTING("", "", "", ""),
    PRODUCTION("", "", "", ""),
    local_strivesale_vincere_io("local.strivesale.vincere.io.datasource.url"
            , "local.strivesale.vincere.io.datasource.username"
            , "local.strivesale.vincere.io.datasource.password"
            , "local.hibernate.dialect.override"
    ),
    local_tung_vincere_io("local.tung.vincere.io.datasource.url"
            , "local.tung.vincere.io.datasource.username"
            , "local.tung.vincere.io.datasource.password"
            , "local.hibernate.dialect.override"
    ),
    remote_strivesale_vincere_io("remote.strivesale.vincere.io.datasource.url"
            , "remote.strivesale.vincere.io.datasource.username"
            , "remote.strivesale.vincere.io.datasource.password"
            , "remote.hibernate.dialect.override"
    ),
    remote_tung_vincere_io("remote.tung.vincere.io.datasource.url"
            , "remote.tung.vincere.io.datasource.username"
            , "remote.tung.vincere.io.datasource.password"
            , "remote.hibernate.dialect.override"
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
