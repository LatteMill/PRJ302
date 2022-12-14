<%-- 
    Document   : Exercise3
    Created on : Sep 29, 2022, 11:31:51 AM
    Author     : leeph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <script>
            function change() {
                document.getElementById("f").submit();
            }
        </script>
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
                    <form action="CalculateEx3" method="POST" style="margin:auto" id="f">
                        <table align="center">
                            <div>
                                <h1 align="center">
                                    <font color ="blue">
                                    TH???C HI???N PH??P TO??N
                                    </font>
                                </h1>
                            </div>
                            <tr>
                                <td>Nh???p n</td>
                                <td>
                                    <input type="text" name="n" value="${requestScope.n}">
                                    (1&lt;n&lt;100)
                                </td>
                            </tr>
                            <tr>
                                <td>Ch???n ph??p to??n</td>
                                <td>
                                    <select name="opt" onchange="change()">
                                        <option value="0">T???ng n s??? li??n ti???p</option>
                                        <option value="1">T??nh n!</option>
                                        <option value="2">In d??y l???</option><!-- hoi anh Kien -->
                                        <option value="3">In d??y s??? ch???n</option>
                                        <option value="4">Ki???m tra s??? nguy??n t???</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><input type="submit" value="Submit" name="T??m"></td>
                            </tr>
                            <tr>
                                <td>K???t qu???: <input type="submit" value="${requestScope.result}"></td>
                            </tr>
                        </table>
                    </form>
                </td>
            </tr>

            <tr id='footer1'>
                <td colspan='2' align='center'>@Copyright by Le Huu Phuoc</td>	
            </tr>
        </table>
    </body>
</html>
