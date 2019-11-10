package vincere.etl.config.datasource;

public enum RemoteDatabaseEnvironment {
    strivesale_vincere_io("remote.strivesale.vincere.io.datasource.url"
            , "remote.strivesale.vincere.io.datasource.username"
            , "remote.strivesale.vincere.io.datasource.password"
            , "remote.hibernate.dialect.override"
    ),
    tung_vincere_io("remote.tung.vincere.io.datasource.url"
            , "remote.tung.vincere.io.datasource.username"
            , "remote.tung.vincere.io.datasource.password"
            , "remote.hibernate.dialect.override"
    ),
    ;

    public final String url;
    public final String username;
    public final String password;
    public final String dialect;

    RemoteDatabaseEnvironment(String url, String username, String password, String dialect) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.dialect = dialect;
    }
}
