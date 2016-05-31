package ru.servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by user on 13.05.2016.
 */
public class StudentDAO {
    static Connection currentCon = null;
    static ResultSet rs = null;

    public static StudentBean login(StudentBean bean) {
        Statement stmt = null;

        String login = bean.getUsername();
        String password = bean.getPassword();

        String searchQuery =
                "SELECT * FROM student WHERE login='"
                        + login
                        + "' AND password='"
                        + password
                        + "';";
        System.out.println("Your user name is " + login);
        System.out.println("Your password is " + password);
        System.out.println("Query: " + searchQuery);


     /*   try {

           // currentCon = ConnectionManager.getConnection();
            //stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
            boolean more = rs.next();
            if (!more) {
                System.out.println("Sorry, you are not a registered user!");
                bean.setValid(false);
            } else if (more) {
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");

                System.out.println("Welcome " + firstName);
                bean.setFirstName(firstName);
                bean.setLastName(lastName);
                bean.setValid(true);
            }
        } catch (Exception ex) {
            System.out.println("Log In failed: An Exception has occurred! " + ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
                stmt = null;
            }

            if (currentCon != null) {
                try {
                    currentCon.close();
                } catch (Exception e) {
                }

                currentCon = null;
            }
        }*/

        return bean;
    }
}

