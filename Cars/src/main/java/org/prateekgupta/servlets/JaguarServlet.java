package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JaguarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("Jaguar");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Jaguar F-Type : Rs.2.62Cr<br>");
        writer.println("Jaguar XE : Rs.48.5L<br>");
        writer.println("Jaguar F-Pace : Rs.1.5Cr<br>");
        writer.println("Jaguar XF : Rs.76L<br>");
        writer.println("Jaguar I-Pace : Rs.1.12Cr<br>");
        writer.println("</body>");
    }
}
