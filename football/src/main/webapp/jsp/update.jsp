
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
    <title>update</title>
    <style>
        body {
            background: url("img/corner.jpg");
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
    </style>
</head>
<body>
<div class="container">
    <div class="col-md-4">
        <h2>Update Player</h2>
    </div>
    <form role="form" class="form-horizontal" method="post">
        <div class="col-md-4">
            <input type="text" class="form-control" placeholder="${player.getName()}" name="name">
            <input type="text" class="form-control" placeholder="${player.getRating()}" name="rating">
            <input type="text" class="form-control" placeholder="${player.getPosition()}" name="position" list="pos">
            <datalist id="pos">
                <option value="gk"></option>
                <option value="df"></option>
                <option value="md"></option>
                <option value="fr"></option>
            </datalist>
            <input type="text" class="form-control" placeholder="${player.getCost()}" name="cost">
            <input type="text" class="form-control" placeholder="${player.getClub()}" name="club">
            <button type="submit" class="btn btn-success">confirm</button>
        </div>
    </form>
    <form action="${pageContext.request.contextPath}/clubs">
        <button type="submit" class="btn btn-danger">return</button>
    </form>
</div>
</body>
</html>
