package com.montiso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by armanchi on 7/21/2016.
 */


@WebServlet(name = "DataServlet")
public class DataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<DataObject> dataList=new ArrayList<>();
        DataObject db1=new DataObject("Person1","I am first",10);
        DataObject db2=new DataObject("Person2","I am second",20);
        DataObject db3=new DataObject("Person3","I am third",30);
        dataList.add(db1);
        dataList.add(db2);
        dataList.add(db3);
        Data d=new Data();
        d.setDataitems(dataList);
        //request Scope
        request.setAttribute("data",d);
        RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/outdata.jsp");
        rd.forward(request,response);


    }
}
