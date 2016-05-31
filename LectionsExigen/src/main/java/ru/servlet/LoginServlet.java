package ru.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by user on 13.05.2016.
 */


public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try {

            StudentBean user = new StudentBean();
            user.setUserName(request.getParameter("login"));
            user.setPassword(request.getParameter("password"));
            user = StudentDAO.login(user);

            if (user.isValid()) {

                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", user);
                response.sendRedirect("main.jsp");
            } else
                response.sendRedirect("login-invalid.jsp");
        }catch (Throwable theException)
        {
            System.out.println(theException);
        }

    }

    }
