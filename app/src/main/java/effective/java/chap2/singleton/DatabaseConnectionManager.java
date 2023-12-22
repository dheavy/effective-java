package effective.java.chap2.singleton;

public enum DatabaseConnectionManager {
    INSTANCE;

    private Connection connection;

    private Connection connection() {
        this.connection = new Connection();
        // try-catch here instead
        return this.connection;
    }

    public Connection getConnection() {
        return connection();
    }

    public void closeConnection() {
        // close connection
    }
}
