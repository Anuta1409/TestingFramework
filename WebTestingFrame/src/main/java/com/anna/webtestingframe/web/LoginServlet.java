/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anna.webtestingframe.web;

import com.anna.webtestingframe.web.domain.HibernateUtil;
import com.anna.webtestingframe.web.domain.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;

/**
 *
 * @author Anna
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
       
        if ((login == null) || (password == null)){
            //go to login  
            response.sendRedirect("");
        }else{
            //autorization, if user was found then autorize him
            // else go to login
            Session session = HibernateUtil.getSessionFactory().openSession();
            ArrayList<Users> usersList = (ArrayList) session.createSQLQuery("select * from users where login = '"+ 
                                    login + "' and password = '"+ password +"'").addEntity(Users.class).list();
            session.close();
            //if (login.equals("test")&& password.equals("test")){
            if (!usersList.isEmpty()){
                Cookie cookie = new Cookie("auth", "test"); //auth - authentication ; save session ID
                cookie.setMaxAge(1800);
                response.addCookie(cookie);
                response.sendRedirect("main");
            }else{
                response.sendRedirect("");
            }
        }
        
    }

}
