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
                        <div>?????I T?????NG STRING</div>
                        <div>
                            <p>Nh???p ??o???n v??n</p>
                            <textarea name="text" rows="5" cols="50" onchange="change()"></textarea>
                        </div>
                        T???ng s??? k?? t??? : <input disabled type="text" value="${requestScope.numOfLettes}">
                        <br>
                        Nh???p v??? tr?? : <input type="text" name="pos" onchange="change()">
                        <br>
                        K?? t??? t????ng ???ng : <input disabled type="text" value="${requestScope.letter}">
                        <br>
                        Nh???p chu???i : <input type="text" name="chain" onchange="change()">
                        <br>
                        V??? tr?? t????ng ???ng : <input  type="text" value="${requestScope.chains}" disabled>
                        <br>
                        Nh???p v??? tr?? c???n t??ch T??? : <input type="text" name="start"> ?????n <input type="end" name="pos" onchange="change()">
                        K???t qu??? <input disabled type="text" value="${requestScope.cut}">
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
