<button onclick="askUser()">Enter Name</button>
<p id="userInput"></p>

<script>
  function askUser() {
    let name = prompt("Please enter your name:");
    if (name) {
      document.getElementById("userInput").innerText = "Hello, " + name + "!";
    }
  }
</script>
