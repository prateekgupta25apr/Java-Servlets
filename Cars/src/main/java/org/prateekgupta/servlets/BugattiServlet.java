package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BugattiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("Bugatti");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Bugatti Veyron : $1.9M<br>");
        writer.println("Bugatti Chiron : $2.9M<br>");
        writer.println("Bugatti Divo : $5.4M<br>");
        writer.println("Bugatti Centodieci : $8.6M<br>");
        writer.println("Bugatti La Voiture Noire : $12M<br>");
        writer.println("</body>");

        writer.close();
    }
}
