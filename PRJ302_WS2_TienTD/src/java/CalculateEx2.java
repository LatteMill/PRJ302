
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leeph
 */
public class CalculateEx2 extends HttpServlet {

    /**
     * Find max value
     */
    double findBig(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    /**
     * Find min value
     */
    double findSmall(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= c && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            double a = Double.parseDouble(req.getParameter("a"));
            double b = Double.parseDouble(req.getParameter("b"));
            double c = Double.parseDouble(req.getParameter("c"));
            String res = req.getParameter("choice");
            /**
             * Check which condition is matched
             */

            req.setAttribute("a", a + "");
            req.setAttribute("b", b + "");
            req.setAttribute("c", c + "");
            if (res.equals("big")) {
                req.setAttribute("result", findBig(a, b, c));
            } else {
                req.setAttribute("result", findSmall(a, b, c));
            }
        } catch (Exception e) {
            req.setAttribute("result", "Wrong.");
        }
        doGet(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Exercise2.jsp").forward(req, resp);
    }

}
