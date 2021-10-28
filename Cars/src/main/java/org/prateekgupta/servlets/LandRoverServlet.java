package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LandRoverServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("LandRover");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("Land Rover Range Rover : Rs.2.1Cr<br>");
        writer.println("Land Rover Defender : Rs.1.22Cr<br>");
        writer.println("Land Rover Range Rover Velar : Rs.80.71L<br>");
        writer.println("Land Rover Range Rover Evoque : Rs.66.6L<br>");
        writer.println("Land Rover Range Rover Sport : Rs.2.1Cr<br>");
        writer.println("</body>");
    }
}
