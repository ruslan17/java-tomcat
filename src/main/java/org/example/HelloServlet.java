package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

//        var user = userService.getUser();


        out.println("Hello, Tomcat!");

//        out.println("<html><body>");
//        out.println("<h2>Hello, Tomcat!</h2>");
//        out.println("</body></html>");
    }
}
