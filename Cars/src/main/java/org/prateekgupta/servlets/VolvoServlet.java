package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class VolvoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("Volvo");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Volvo XC90 : Rs.1.31Cr<br>");
        writer.println("Volvo XC60 : Rs.61.9L<br>");
        writer.println("Volvo XC40 : Rs.41.25L<br>");
        writer.println("Volvo S90 : Rs.61.9<br>");
        writer.println("Volvo S60 : Rs.45.9L<br>");
        writer.println("</body>");
    }
}
