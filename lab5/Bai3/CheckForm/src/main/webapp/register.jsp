<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div id="login">
        <div class="container">
            <div class="signin">
                <h1 class="title">Register</h1>
                <label class="error"><c:if test="${registerError != null}">${registerError}</c:if></label>
                <form method="post" action="<c:url value='/register'/>">
                    <div class="form-group">
                        <input type="text" name="username" placeholder="username or email" class="input-sigin">
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" placeholder="password" class="input-sigin">
                    </div>
                    <div>
                        <input type="submit" class="btn-signin" value="Register">
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>