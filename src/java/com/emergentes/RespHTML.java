package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespHTML", urlPatterns = {"/RespHTML"})
public class RespHTML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/HTML");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Respuesta HTML</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<hl>HTML generado desde un Servlet</hl>");
            out.println("</body>");
            out.println("</htrnl>");
        } finally {
            out.close();
        }
    }
}

