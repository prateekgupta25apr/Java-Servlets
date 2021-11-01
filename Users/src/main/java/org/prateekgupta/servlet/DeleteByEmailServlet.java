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

public class DeleteByEmailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("DeleteByEmail.html").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        LoginDTO dto = new LoginDTO();
        dto.setEmail(req.getParameter("email"));
        dto.setPassword(req.getParameter("password"));

        Service service = new ServiceImpl();
        String message=service.validateAndDelete(dto);

        resp.setContentType("text-html");
        PrintWriter writer = resp.getWriter();
        req.getRequestDispatcher("DeleteByEmail.html").include(req, resp);
        writer.println("""
                <script>
                var tag=document.getElementById("board");
                tag.style.display="block";""");
        writer.println("tag.innerHTML='" + message + "'");
        if (message.equals("User details deleted"))
            writer.println("""
                tag.className+=' alert-primary';
                </script>""");
        else writer.println("""
                tag.className+=' alert-danger';
                </script>""");
        writer.close();
    }
}
