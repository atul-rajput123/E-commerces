<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
   <link rel="stylesheet" href="Css\Singin$Singup.css">
</head>
<body>
    <div class="container">
       
        <div class="signin-box">
             <%@include file="Jsp\Message.jsp" %>
            <h2>Sign In</h2>
            <form action="Signin" method="POST">
                <div class="input-box">
                    <input type="email" id="email" name="email" placeholder="Enter your email" required>
                    <span class="error-message" id="email-error"></span>
                </div>
                <div class="input-box">
                    <input type="password" id="password" name="password" placeholder="Enter your password" required>
                    <span class="error-message" id="password-error"></span>
                </div>
                <button type="submit" class="signin-btn">Sign In</button>
                <div class="extra-links">
                    <a href="#">Forgot password?</a>
                    <p>Don't have an account? <a href="Registration.jsp">Sign Up</a></p>
                </div>
            </form>
            <div id="success-message" class="success-message"></div>
            <div id="error-message" class="error-message"></div>
        </div>
    </div>

    <script src="script.js"></script>
</body>
</html>
