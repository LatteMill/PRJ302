
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
public class CalculateEx1 extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        try{
            double a = Double.parseDouble(req.getParameter("a"));
            double b = Double.parseDouble(req.getParameter("b"));
            String c = req.getParameter("operator");
            
            req.setAttribute("a", a+"");
            req.setAttribute("b", b+"");
            req.setAttribute("c", c+"");
            
            /**
             * Check which condition is matched
             */
            if(c.equalsIgnoreCase("a + b")){
                req.setAttribute("result", a+b);
            }
            else if(c.equalsIgnoreCase("a - b")){
                req.setAttribute("result", a-b);
            }
            else if(c.equalsIgnoreCase("a * b")){
                req.setAttribute("result", a*b);
            }
            else {
                if(b == 0){
                    req.setAttribute("result", "NumberFormatException");
                    throw new ArithmeticException();
                }
                else {
                    req.setAttribute("result", a/b);
                }
            }
        }
        catch(NumberFormatException ex){
            resp.getWriter().print("NumberFormatException");
        }
        catch(ArithmeticException ex){
            resp.getWriter().print("Divide by zero");
        }
        
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Exercise1.jsp").forward(req, resp);
    }
    
}
