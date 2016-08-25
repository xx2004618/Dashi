package db;

public class DBUtil { // this is the config file of the DB connection.
    private static final String HOSTNAME = "localhost";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "laiproject";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
//    private static final String PASSWORD = "123123123";
    public static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
   			 + "?user=" + USERNAME + "&password=" + PASSWORD + "&autoreconnect=true";
    
}