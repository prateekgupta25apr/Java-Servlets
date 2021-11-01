package org.prateekgupta.servlet;

import org.prateekgupta.dto.LoginDTO;
import org.prateekgupta.service.Service;
import org.prateekgupta.service.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetByEmailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("GetByEmail.html").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        LoginDTO dto = new LoginDTO();
        dto.setEmail(req.getParameter("email"));
        dto.setPassword(req.getParameter("password"));

        Service service = new ServiceImpl();
        String message = service.validateAndGetByEmail(dto);

        resp.setContentType("text-html");
        PrintWriter writer = resp.getWriter();
        req.getRequestDispatcher("GetByEmail.html").include(req, resp);

        if (message.equals("Invalid Password")||message.equals("Invalid Email")) {
            writer.println("""
                    <script>
                    var tag=document.getElementById("board");
                    tag.style.display="block";""");

            writer.println("tag.innerHTML='" + message + "'");
            writer.println("""
                    tag.className+=' alert-danger';
                    </script>""");
        } else {
            writer.println("""
                    <script>
                    var tag=document.getElementById("output");
                    tag.style.display="block";""");

            writer.println("tag.innerHTML='" + message + "'");
            writer.println("""
                    </script>""");
        }

        writer.close();
    }
}
