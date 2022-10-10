
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leeph
 */
public class CalculateEx4 extends HttpServlet {

    public String layChuoi(String s, int start, int end) {
        String ouput = "";
        for (int i = start; i <= end; i++) {
            ouput += s.charAt(i);
        }
        return ouput;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String text = req.getParameter("text");
            String result = text.trim().toLowerCase().replaceAll("\\W", "");
            String c = req.getParameter("opt");
            String texture = req.getParameter("text");

            /**
             * Check which condition is matched math type
             */
            if (c.equals("inMang")) {
                req.setAttribute("ketQua", texture);
            } else if (c.equals("tongLe")) {
                int count = 1;
                for (int i = 0; i < texture.length(); i++) {
                    count += 2;
                }
                req.setAttribute("tongLe", count);
            } else if (c.equals("tichChan")) {
                ArrayList<Integer> list = new ArrayList<>();
                int count = 1;
                for (int i = 0; i < texture.length(); i++) {
                    count *= 2;
                }
                String resultString = "";
                req.setAttribute("tichChan", count);
            } else {
                
            }

            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < result.length(); i++) {
                if (!list.contains(result.charAt(i))) {
                    list.add(result.charAt(i));
                }
            }
        } catch (NumberFormatException ex) {
            req.setAttribute("error", "Please input number");
        } catch (ArrayIndexOutOfBoundsException ex) {
            req.setAttribute("error", "Out of index");
        }
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Exercise4.jsp").forward(req, resp);
    }

}
