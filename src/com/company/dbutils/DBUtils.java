package com.company.dbutils;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @Describe:
 * @Date: 2017/11/15
 * @Modifiedby:
 */
public class DBUtils {
    private static Properties properties = new Properties();

    static{
        try {
            properties.load(new FileReader("db.properties"));
            Class.forName(properties.getProperty("driver"));

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
            return connection;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection(Connection connection){
       try{
           if(connection != null)
               connection.close();
       }catch (SQLException e){
           e.printStackTrace();
       }
    }

    public void closeStatement(Statement statement){
        try{
            if(statement != null)
                statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void closeResultSet(ResultSet resultSet){
        try{
            if(resultSet != null)
                resultSet.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void release(Connection connection, Statement statement, ResultSet resultSet){
        closeResultSet(resultSet);
        closeStatement(statement);
        closeConnection(connection);
    }
    public void release2(Connection connection, Statement statement){
        closeStatement(statement);
        closeConnection(connection);
    }


}
