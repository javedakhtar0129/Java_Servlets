package com.Telusko;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class abAddServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i+j;
        int t = k*k;

        res.sendRedirect("square");  //This will r

//        PrintWriter browser = res.getWriter();
//        browser.println("Sum: "+ k);

//        req.setAttribute("k",t);   //to send same object to another servlet
//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req,res);
    }
}
