
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leeph
 */
public class CalculateEx3 extends HttpServlet {

    /**
     * This function is used to calculate the sum of a sequence of numbers
     *
     * @param n
     * @return sum
     */
    double sum(double n) {
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        return sum;
    }

    /**
     * This function is used to calculate the factorial of a series of numbers
     *
     * @param n
     * @return sum
     */
    double giaiThua(double n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    /**
     * This function is used to check if a number is prime
     *
     * @param n
     * @return
     */
    public static boolean isPrime(double n) {
        if (n <= 1 || n >= 100) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

//    public String display(int[] arr) {
//        String displayx = "";
//        for (int i = 0; i < arr.length; i++) {
//            if (i < arr.length - 1) {
//                displayx = displayx + arr[i] + "&nbsp;";
//            } else {
//                displayx = displayx + arr[i];
//            }
//        }
//        return displayx;
//    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try {
            double n = Double.parseDouble(req.getParameter("n"));
            String c = req.getParameter("opt");
            double result;

            req.setAttribute("n", n + "");
            /**
             * Check which condition is matched math type
             */
            if (c.equals("0")) {
                if (n <= 1 || n >= 100) {
                    req.setAttribute("result", "Must be bigger than 1 and less than 100");
                }
                req.setAttribute("result", sum(n) + "");
            } else if (c.equals("1")) {
                if (n <= 1 || n >= 100) {
                    req.setAttribute("result", "Must be bigger than 1 and less than 100");
                }
                req.setAttribute("result", giaiThua(n));
            } else if (c.equals("2")) {
                if (n <= 1 || n >= 100) {
                    req.setAttribute("result", "Must be bigger than 1 and less than 100");
                }
                ArrayList<Integer> list = new ArrayList<>();
                int count = 1;
                for (int i = 0; i < n; i++) {
                    list.add(count);
                    count += 2;
                }
                String resultString = "";
                for (Integer i : list) {
                    resultString += i + " ";
                }
                req.setAttribute("result", resultString);
            } else if (c.equals("3")) {
                if (n <= 1 || n >= 100) {
                    req.setAttribute("result", "Must be bigger than 1 and less than 100");
                }
                ArrayList<Integer> list = new ArrayList<>();
                int count = 0;
                for (int i = 0; i < n; i++) {
                    list.add(count);
                    count += 2;
                }
                req.setAttribute("tongDaySo", count);
                String resultString = "";
                for (Integer i : list) {
                    resultString += i + " ";
                }
                req.setAttribute("result", resultString);
            } else {
                if (n <= 1 || n >= 100) {
                    req.setAttribute("result", "Must be bigger than 1 and less than 100");
                }
                req.setAttribute("result", isPrime(n));
            }
        } catch (NumberFormatException formatException) {
            req.setAttribute("result", "Must be double type");
        }
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Exercise3.jsp").forward(req, resp);
    }

}
