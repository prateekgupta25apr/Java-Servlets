package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LamborghiniServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("Lamborghini");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Lamborghini Aventador : Rs.6.25Cr<br>");
        writer.println("Lamborghini Urus : Rs.3.1Cr<br>");
        writer.println("Lamborghini Huracan Evo : Rs.3.22Cr<br>");
        writer.println("Lamborghini Huracan Evo Spyder : Rs.3.54Cr<br>");
        writer.println("Lamborghini Huracan STO : Rs.4.99Cr<br>");
        writer.println("</body>");

        writer.close();
    }
}
