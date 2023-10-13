$(document).ready(function() {
    $("#formValidation").validate({
        rules: {
            username: {
                required: true,
                minlength: 5
            },
            password: {
                required: true
            }
        },
        messages: {
            username: {
                required: "Username or email is required",
                minlength: "Please enter at least 5 characters"
            },
            password: {
                required: "Password is required"
            }
        },
        submitHandler: function(form) {
            form.submit();
        }
    });
});
