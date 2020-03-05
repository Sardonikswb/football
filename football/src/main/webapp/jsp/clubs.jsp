<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
            crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <title>home</title>
    <style>
        body {
            background: url("img/w.jpg");
            background-size: 100%;
        }
        .section a {
            color: greenyellow;
            text-transform: uppercase;
            text-decoration: none;
            margin: 0;
            position: absolute;
            top: 50%;
            left: 50%;
            -ms-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
        }
        .semilayer {
            padding: 5px; /* Поля вокруг текста */
            background: gray; /*!* Цвет фона *!*/
            margin: 0 auto; /*!* Выравниваем слой по центру *!*/
            width: 100%; /*!* Ширина слоя *!*/
            opacity: 1; /*!* Значение прозрачности *!*/
            filter: alpha(Opacity=90);
        }
    </style>
</head>
<body>
<div class="container">
    <div align="center" style="color: darkgreen">
        <h3>Clubs</h3>
        <table class="table table-striped table-bordered col-md-4  table-hover semilayer">
            <thead>
            <tr class="active">
                <th>name</th>
                <th>cost</th>
                <th>force</th>
                <th>amount</th>
            </tr>
            </thead>
            <c:forEach items="${clubs}" var="club">
                <tr>
                    <td>
                        <div class="button" style="color: darkblue"><a
                                href="${pageContext.request.contextPath}/playerslist?club=${club.getNameClub()}">${club.getNameClub()}</a>
                        </div>
                    </td>
                    <td>${club.getCostClub()}</td>
                    <td>${club.getForceClub()}</td>
                    <td>${club.getAmountPlayers()}</td>
                </tr>
            </c:forEach>
        </table>
        <div class="button btn-lg"><a
                href="${pageContext.request.contextPath}/add" style="color: darkgreen">add player</a>
        </div>
    </div>
</div>
</body>
</html>