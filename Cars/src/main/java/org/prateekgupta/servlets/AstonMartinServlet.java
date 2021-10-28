package org.prateekgupta.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AstonMartinServlet extends HttpServlet {
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
        writer.println("AstonMartin DBX : Rs.3.82Cr<br>");
        writer.println("AstonMartin DB11 : Rs.3.8Cr<br>");
        writer.println("AstonMartin Vantage : Rs.3.0Cr<br>");
        writer.println("AstonMartin Zagato : Rs.3.85Cr<br>");
        writer.println("AstonMartin DBS : Rs.5.0Cr<br>");
        writer.println("</body>");

        writer.close();
    }
}
