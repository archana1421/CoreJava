package com.montiso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by armanchi on 7/21/2016.
 */
@javax.servlet.annotation.WebServlet(name = "ForwardServlet")
public class ForwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setContentType("text/html");
        Attribute ab=new Attribute();

        ab.setValue("Welcome, today is Monday");
        RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/newfw.jsp");

        //Request Scope of the attribute
        request.setAttribute("message",ab);
        rd.forward(request,response);
    }
}
