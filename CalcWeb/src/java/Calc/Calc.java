/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author admin
 */
@WebServlet(urlPatterns = "/cal")
public class Calc extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String first = req.getParameter("first");
        String second = req.getParameter("second");
        String operator = req.getParameter("operator");
        int n = Integer.parseInt(first);
        int m = Integer.parseInt(second);

        switch (operator) {
            case "+":
                resp.getWriter().println("<h1 style='font-size:30px;'>" + (n + m) + "</h1>");
                break;
            case "-":
                resp.getWriter().println("<h1 style='font-size:30px;'>" + (n - m) + "</h1>");
                break;
            case "*":
                resp.getWriter().println("<h1 style='font-size:30px;'>" + (n * m) + "</h1>");
                break;
            case "/":
                if (m == 0) {
                    resp.getWriter().println("Cannot divided by 0");
                    break;
                }
                resp.getWriter().println("<h1 style='font-size:30px;'>" + (n / m) + "</h1>");
                break;
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String first = req.getParameter("first");
        String second = req.getParameter("second");
        String operator = req.getParameter("operator");
        int n = Integer.parseInt(first);
        int m = Integer.parseInt(second);

        switch (operator) {
            case "+":
                resp.getWriter().println("<h1 style='font-size:30px;'>" + (n + m) + "</h1>");
                break;
            case "-":
                resp.getWriter().println("<h1 style='font-size:30px;'>" + (n - m) + "</h1>");
                break;
            case "*":
                resp.getWriter().println("<h1 style='font-size:30px;'>" + (n * m) + "</h1>");
                break;
            case "/":
                if (m == 0) {
                    resp.getWriter().println("Cannot divided by 0");
                    return;
                }
                resp.getWriter().println("<h1 style='font-size:30px;'>" + (n / m) + "</h1>");
                break;
        }

    }
}
