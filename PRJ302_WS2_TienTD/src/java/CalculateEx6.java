
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
public class CalculateEx6 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try {
            double a = Double.parseDouble(req.getParameter("a"));
            double b = Double.parseDouble(req.getParameter("b"));
            String res = "";
            if (a == 0) {
                if (b == 0) {
                    req.setAttribute("res", "Phương trình này có vô số nghiệm.");
                } else {
                    req.setAttribute("res", "Phương trình vô nghiệm.");
                }
            } else {
                res = String.valueOf(-b / a);   // ép kiểu để cho ra kết quả chính xác
                req.setAttribute("res", "Phương trình có 1 nghiệm x = " + res);
            }
        } catch (Exception e) {
            resp.getWriter().print("Vui lòng nhập kiểu chữ số");
        }
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Exercise6.jsp").forward(req, resp);
    }

}
