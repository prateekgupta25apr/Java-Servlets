package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AudiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("AstonMartin");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Audi Q2 : Rs.34.99L<br>");
        writer.println("Audi A4 : Rs.43.19L<br>");
        writer.println("Audi A6 : Rs.57.08L<br>");
        writer.println("Audi e-tron : Rs.1.0Cr<br>");
        writer.println("Audi A8 : Rs.1.57Cr<br>");
        writer.println("</body>");

        writer.close();
    }
}
