package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LexusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("Lexus");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Lexus LS : Rs.2.22Cr<br>");
        writer.println("Lexus ES : Rs.61.71L<br>");
        writer.println("Lexus RX : Rs.1.09Cr<br>");
        writer.println("Lexus LX : Rs.2.32Cr<br>");
        writer.println("Lexus LC 500h : Rs.2.15Cr<br>");
        writer.println("</body>");
    }
}
