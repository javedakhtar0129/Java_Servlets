package com.Telusko;

/*
1. to use servlets we extend HttpServlet to our class.
2. to perform our task service() method is must to be used.
3. for a user to send data & a servlet to receive data we use two objects to handle
   it which is request object and response object.
4. since getParameter is giving a string value so we wrap this value under Integer Class
   under it parseInt method.
5. We are calling a "add" action from index.html but our servlet name is AddServlet, for
   the html to know what servlet has to be called we use a web descriptor called web.xml
6. In web.xml for each servlet we create a 'servlet' tag and a 'servlet-mapping' tag and to link
   both these two we use 'servlet-name' tag.
7. 'url-pattern' tells the form action we are calling, add a / before it
8. to print output on the browser we use response object
9. Whenever we have to fetch data from the server we use 'get' & and whenever
   we have to submit data to the server we use 'post'.By default in the form it
   uses a get method,post can be used to maintain secrecy because it doesnt show on url.
10.To make sure our servlet process only 'get' or 'post' methods, we can use doPost() or doGet()
   instead of service().
11.To pass a value to the other servlet through this servlet we addAtrriblutes(key,value) to
   the request object because the same is being dispatched(forwarded) further.
*/

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class aaAddServlet extends HttpServlet {
    // doPost(),doPost()
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));  //read 4. above
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;
        k=k*k;
        req.setAttribute("k",k);  //(key,value) to forwarded servlet that is SquareServlet
        System.out.println("Result is: " + k);  //this prints data on the console

//        PrintWriter browser = res.getWriter();  //getWriter gives text
//        browser.println("Result is: " + k);

        RequestDispatcher rd = req.getRequestDispatcher("sq"); //to tell the xml file what is the action
        rd.forward(req,res);
    }
}
