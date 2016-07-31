package com.montiso;

/**
 * Created by armanchi on 7/20/2016.
 */
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


@javax.servlet.annotation.WebServlet(name = "LoginServlet")

public class LoginServlet extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        PrintWriter out = response.getWriter();

        String n=request.getParameter("username");
        String p=request.getParameter("userpass");

        if(n.equals("archana") && p.equals("reddy123")){
            Cookie ck1=new Cookie("userid",n);

            response.addCookie(ck1);//adding cookie in the response


            RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
            rd.forward(request,response);
        }
        else{
            response.setContentType("text/html");
            out.print("Bad Login\n");
            out.print("<a href='index.jsp'>Click here to Login</a>");
        }

        out.close();
    }
}
