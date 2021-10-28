package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MercedesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("Mercedes");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Mercedes GLA : Rs.47.7L<br>");
        writer.println("Mercedes GLS : Rs.2.3Cr<br>");
        writer.println("Mercedes S-Class : Rs.1.61Cr<br>");
        writer.println("Mercedes E-Class : Rs.82.4L<br>");
        writer.println("Mercedes AMG GT : Rs.2.63Cr<br>");
        writer.println("</body>");
    }
}
