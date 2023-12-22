package effective.java.chap2.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.INSTANCE;
        System.out.println(connectionManager.getConnection());
    }
}
