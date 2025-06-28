<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    // Retrieve the message from the session if it exists
    String message = (String) session.getAttribute("message");  
    if (message != null) {
%>
        <!-- Display message in an alert box -->
        <div class="alert alert-success alert-dismissible fade show" role="alert">
            <strong><%= message %></strong>
            <!-- Close button to dismiss the alert -->
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>

<%
        // Remove the message from session after it's been displayed
        session.removeAttribute("message");
    }
%>
