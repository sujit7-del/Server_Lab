<form action="login" method="post">
    <input type="text" name="username" required>
    <input type="password" name="password" required>
    <button type="submit">Login</button>
</form>
<p style="color:red;"><%= request.getParameter("error") != null ? request.getParameter("error") : "" %></p>
