<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
    <div id="login">
        <div class="container">
            <div class="signin">
                <h1 class="title">Sign In</h1>
                <label class="success"><c:if test="${registerSuccess != null}">${registerSuccess}</c:if></label>
                <label class="error"><c:if test="${wrongUser != null}">${wrongUser}</c:if></label>
                <form method="post" action="<c:url value='/login'/>">
                    <div class="form-group">
                        <input type="text" name="username" placeholder="username or email" class="input-sigin">
                        <label class="error"><c:if test="${errorUsername != null}">${errorUsername}</c:if></label>
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" placeholder="password" class="input-sigin">
                        <label class="error"><c:if test="${errorPass != null}">${errorPass}</c:if></label>
                    </div>
                    <div>
                        <input type="submit" class="btn-signin" value="SIGN IN">
                    </div>
                </form>
                <div class="or-login">
                    <p>Or login with</p>
                    <ul class="social-media">
                        <li ><a href="" class="facebook"><i class="fa-brands fa-facebook-f"></i></a></li>
                        <li ><a href="" class="google"><i class="fa-brands fa-google"></i></a></li>
                      </ul>
                </div>
                <a class="sign-up" href="<c:url value='/register'/>">Sign up</a>
            </div>
        </div>
    </div>
</body>
</html>