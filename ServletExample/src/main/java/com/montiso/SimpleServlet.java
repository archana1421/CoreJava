package com.montiso; /**
 * Created by armanchi on 7/20/2016.
 */


import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.time.LocalDateTime;


@javax.servlet.annotation.WebServlet(name = "SimpleServlet")
public class SimpleServlet extends HttpServlet {
    private String message;
    private String currentTime;

    public void init() throws ServletException
    {
        // Do required initialization
        message = "Hello";
        currentTime=LocalDateTime.now().toString();
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        String name=request.getParameter("name");
        if(name==null)
        {
            out.print("Please enter the name parameter");
        }
        else
        // Actual logic goes here.

        out.print(message+" "+name+" \n"+currentTime);
    }

    public void destroy()
    {
        // do nothing.
    }


}
