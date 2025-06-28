<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link rel="stylesheet" href="Css\Singin$Singup.css">
</head>
<body>
    
    <div class="container">
       
        <div class="signup-box">
             <%@include file="Jsp/Message.jsp" %>
            <h2>Sign Up</h2>
            <form id="signupForm" action="Registration" method="POST">
                <!-- Name Field -->
                <div class="input-box">
                    <input type="text" id="name" name="name" placeholder="Enter your name" required>
                    <span class="error-message" id="name-error"></span>
                </div>

                <!-- Email Field -->
                <div class="input-box">
                    <input type="email" id="email" name="email" placeholder="Enter your email" required>
                    <span class="error-message" id="email-error"></span>
                </div>

                <!-- Password Field -->
                <div class="input-box">
                    <input type="password" id="password" name="password" placeholder="Enter your password" required>
                    <span class="error-message" id="password-error"></span>
                </div>

                <!-- Optional Address Field -->
                <div class="input-box">
                    <input type="text" id="address" name="address" placeholder="Enter your address">
                </div>

                <!-- Sign Up Button -->
                <button type="submit" class="signup-btn">Sign Up</button>

                <!-- Existing Account Link -->
                <div class="extra-links">
                    <p>Already have an account? <a href="Signin.jsp">Sign In</a></p>
                </div>
            </form>
            <div id="success-message" class="success-message"></div>
            <div id="error-message" class="error-message"></div>
        </div>
    </div>

    <script src="script.js"></script>
</body>
</html>
