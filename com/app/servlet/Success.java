package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class Success extends HttpServlet {
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
 
        writer.println("" + "" + "<center>"
                + "Details Added Successfully" + "</center>" + ""
                + "");
    }
 
}
