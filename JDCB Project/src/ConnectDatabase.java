import java.sql.*;
public class ConnectDatabase {
    //jdbc:mysql://localhost:3306/mydb
    private String url = "jdbc:mysql://localhost:3306/mydb";
    private String username = "root";
    private String password = "199500";

    private ResultSet resultSet;

    public String getUrl(){
        return url;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setResultSet(ResultSet resultSet){
        this.resultSet = resultSet;
    }

    public ResultSet getResultSet(){
        return resultSet;
    }
}
