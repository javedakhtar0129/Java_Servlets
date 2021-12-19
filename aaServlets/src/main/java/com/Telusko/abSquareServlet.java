package com.Telusko;
/*
1. To call a servlet from another servlet we create an object of RequestDispatcher()
   and then from request object we call getRequestDispatcher("sq") and we pass the action
   that has to be done. Action is further written in xml file.
2. To fetch the forwarded attribute from another servlet we use getAttribute(key);
*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class abSquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();  //to print on browser
        int square = (int)req.getAttribute("k"); //This is passing an object of an object
        out.println("Hello to Square Servlet\n"+"Square: "+square);
    }
}
