<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $(document).ready(function() {
        $("#loginForm").submit(function(event) {
            event.preventDefault();
            $.ajax({
                url: "login",
                type: "POST",
                data: $(this).serialize(),
                dataType: "json",
                success: function(response) {
                    if (response.status === "success") {
                        window.location.href = "welcome.jsp";
                    } else {
                        $("#message").html("<p style='color:red;'>" + response.message + "</p>");
                    }
                }
            });
        });
    });
</script>

<form id="loginForm">
    <input type="text" name="username" required>
    <input type="password" name="password" required>
    <button type="submit">Login</button>
</form>
<div id="message"></div>
