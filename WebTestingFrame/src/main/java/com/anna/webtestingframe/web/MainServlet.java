package com.anna.webtestingframe.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.anna.databaseconnection.domain.services.TestSuiteServiceImpl;


public class MainServlet extends HttpServlet {
    

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }
    
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        TestSuiteServiceImpl testSuiteServiceImpl = new TestSuiteServiceImpl();
        request.setAttribute("testsuitelist",   testSuiteServiceImpl.testSuiteList());
        request.getRequestDispatcher("WEB-INF/main.jsp").forward(request, response);
    } 

}
