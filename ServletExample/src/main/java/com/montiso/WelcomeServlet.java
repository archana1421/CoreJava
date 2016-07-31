package com.montiso;

/**
 * Created by armanchi on 7/20/2016.
 */
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@javax.servlet.annotation.WebServlet(name = "WelcomeServlet")

public class WelcomeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n=request.getParameter("username");
        out.print("Welcome "+n);

        

        out.close();
    }

}
