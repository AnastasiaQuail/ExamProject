package ru.servlet;

import javax.sql.DataSource;
import java.sql.Connection;



/**
 * Created by user on 13.05.2016.
 */
public class ConnectionManager {
    static Connection con;
    static String url;
    DataSource bdSource;

    public void DataSourceExample() {
      
      //  bdSource.setDriverClassName("com.mysql.jdbc.Driver");
        //bdSource.setUrl("jdbc:mysql://localhost:3306/student");
       // bdSource.setUsername("root");
        //bdSource.setPassword("ljkkb");
         }

   /* public static Connection getConnection()
    {

        try
        {


            try
            {
                con = bdSource.getConnection();


            }

            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }

        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }

        return con;
    }*/

}
