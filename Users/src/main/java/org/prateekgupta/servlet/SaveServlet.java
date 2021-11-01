package org.prateekgupta.servlet;

import org.prateekgupta.dto.UserDTO;
import org.prateekgupta.service.Service;
import org.prateekgupta.service.ServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("SavePage.html").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        UserDTO dto = new UserDTO();
        dto.setName(req.getParameter("name"));
        dto.setEmail(req.getParameter("email"));
        dto.setPassword(req.getParameter("password"));
        dto.setConfirmPassword(req.getParameter("confirm_password"));
        dto.setContactNumber(req.getParameter("contact_number"));
        dto.setDob(req.getParameter("dob"));
        dto.setGender(req.getParameter("gender"));
        dto.setStatus(req.getParameter("status"));
        dto.setCity(req.getParameter("city"));
        dto.setNationality(req.getParameter("nationality"));

        System.out.println(dto);

        Service service = new ServiceImpl();
        String message = service.validateAndSave(dto);

        resp.setContentType("text-html");
        PrintWriter writer = resp.getWriter();
        req.getRequestDispatcher("SavePage.html").include(req, resp);
        writer.println("""
                <script>
                var tag=document.getElementById("board");
                tag.style.display="block";""");

        writer.println("tag.innerHTML='" + message + "'");
        if (message.equals("Details of the user saved"))
        writer.println("""
                tag.className+=' alert-primary';
                </script>""");
        else writer.println("""
                tag.className+=' alert-danger';
                </script>""");
        writer.close();

    }
}
