
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leeph
 */
public class CalculateEx5 extends HttpServlet {

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
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < result.length(); i++) {
                if (!list.contains(result.charAt(i))) {
                    list.add(result.charAt(i));
                }
            }
            req.setAttribute("numOfLettes", list.size());
            int pos = Integer.parseInt(req.getParameter("pos"));
            if (pos < 1 || pos > text.length()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            req.setAttribute("letter", text.charAt(pos - 1));
            String chain = req.getParameter("chain");
            req.setAttribute("chains", text.indexOf(chain));
            int start = Integer.parseInt(req.getParameter("start"));
            int end = Integer.parseInt(req.getParameter("end"));
            req.setAttribute("cut", layChuoi(text, start, end));

        } catch (NumberFormatException ex) {
            req.setAttribute("error", "Please input number");
        } catch (ArrayIndexOutOfBoundsException ex) {
            req.setAttribute("error", "Out of index");
        }
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Exercise5.jsp").forward(req, resp);
    }

}
