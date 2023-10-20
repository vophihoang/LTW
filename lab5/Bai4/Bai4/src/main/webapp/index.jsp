<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div id="contact">
        <div class="container">
            <h2 class="title text-center">Contact Us</h2>

            <form class="form-floating" action="<c:url value="/check"/> " method="post">
                <div class="form-floating">
                    <input type="text" class="form-control" name="name"
                        placeholder="name@example.com" value="Enter Your Name" >
                    <label >FULL NAME*</label>
                    <p style="color: red"><c:if test="${nameError != null}">${nameError} </c:if> </p>
                </div>
                <div class="row g-2">
                    <div class="col-md">
                        <div class="form-floating">
                            <input type="text" name="email" class="form-control" placeholder="name@example.com" value="Enter Your Email">
                            <label >EMAIL*</label>
                            <p style="color: red"><c:if test="${emailError != null}">${emailError} </c:if> </p>
                        </div>
                    </div>
                    <div class="col-md">
                        <div class="form-floating">
                            <input type="text" name="phoneNumber" class="form-control" placeholder="name@example.com" value="Enter Number Phone">
                            <label >PHONE</label>
                            <p style="color: red"><c:if test="${phoneNumberError != null}">${phoneNumberError} </c:if> </p>
                        </div>
                    </div>
                </div>
                <div class="form-floating">
                    <select class="form-select" name="services" id="floatingSelect" aria-label="Floating label select example">
                      <option selected value="">Please choose</option>
                      <option value="1">One</option>
                      <option value="2">Two</option>
                      <option value="3">Three</option>
                    </select>
                    <label for="floatingSelect">NEEDED SERVICE*</label>
                    <p style="color: red"><c:if test="${serviceError != null}">${serviceError} </c:if> </p>
                </div>
                <div class="form-floating">
                    <textarea class="form-control" name="message" id="floatingTextarea2" style="height: 100px"  value="Enter Number Phone"></textarea>
                    <label for="floatingTextarea2">MESSAGE</label>
                    <p style="color: red"><c:if test="${messageError != null}">${messageError} </c:if> </p>
                </div>
                <div class="d-grid">
                   <button class="btn btn-submit" type="submit">Submit</button>
                </div>
            </form>
        </div>
    </div>
</body>

</html>