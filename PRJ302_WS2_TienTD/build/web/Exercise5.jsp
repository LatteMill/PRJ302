<%-- 
    Document   : Exercise5
    Created on : Oct 3, 2022, 9:12:27 AM
    Author     : leeph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function change() {
                document.getElementById("f").submit();
            }
        </script>
        <style>
            table.main {
                width:100%;
                height:600px;
                border:1px solid black;
            }

            table.main #logo{
                background:Blue;
                width:15%;
                height:15%;
            }
            table.main #banner{
                width:85%;
                height:15%;
            }
            table.main #menu1{
                background:Red;
                width:15%;
                height:70%;
                font-size:22;
                text-align:top
            }
            table.main #content1{
                background:yellow;
                width:85%;
                height:70%;
            }
            table.main #footer1{
                background:green;
                width:100%;
                height:15%;
                font-size:25;
            }

        </style>

    </head>
    <body>
        <table class='main'>
            <tr>
                <td id='logo'><img src='images/logo.jpg' width='150px'></td>
                <td id='banner' background='images/banner2.jpg'></td>
            </tr>

            <tr>
                <td id='menu1'>
                    <ul>
                        <li><a href="Exercise1.jsp">Exercise 1</a></li>
                        <li><a href="Exercise2.jsp">Exercise 2</a></li>
                        <li><a href="Exercise3.jsp">Exercise 3</a></li>
                        <li><a href="Exercise4.jsp">Exercise 4</a></li>
                        <li><a href="Exercise5.jsp">Exercise 5</a></li>
                        <li><a href="Exercise6.jsp">Exercise 6</a></li>
                    </ul>
                </td>
                <td id='content1'>
                    <form action="CalculateEx5" method="POST" style="margin:auto" id="f">
                        <div>ĐỐI TƯỢNG STRING</div>
                        <div>
                            <p>Nhập đoạn văn</p>
                            <textarea name="text" rows="5" cols="50" onchange="change()"></textarea>
                        </div>
                        Tổng số ký tự : <input disabled type="text" value="${requestScope.numOfLettes}">
                        <br>
                        Nhập vị trí : <input type="text" name="pos" onchange="change()">
                        <br>
                        Ký tự tương ứng : <input disabled type="text" value="${requestScope.letter}">
                        <br>
                        Nhập chuỗi : <input type="text" name="chain" onchange="change()">
                        <br>
                        Vị trí tương ứng : <input  type="text" value="${requestScope.chains}" disabled>
                        <br>
                        Nhập vị trí cần tách Từ : <input type="text" name="start"> Đến <input type="end" name="pos" onchange="change()">
                        Kết quả <input disabled type="text" value="${requestScope.cut}">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
            </tr>

            <tr id='footer1'>
                <td colspan='2' align='center'>@Copyright by Le Huu Phuoc</td>	
            </tr>
        </table>

    </body>
</html>
