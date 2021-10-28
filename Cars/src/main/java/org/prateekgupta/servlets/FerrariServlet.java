package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FerrariServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("Ferrari");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Ferrari Roma : Rs.3.76Cr<br>");
        writer.println("Ferrari Portofino : Rs.3.5Cr<br>");
        writer.println("Ferrari 812 : Rs.5.75Cr<br>");
        writer.println("Ferrari SF90 Stradale : Rs.7.5Cr<br>");
        writer.println("Ferrari F8 Tributo : Rs.4.02Cr<br>");
        writer.println("</body>");
    }
}