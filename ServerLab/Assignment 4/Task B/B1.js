<form onsubmit="showAlert(event)">
  <input type="text" placeholder="Enter something" required>
  <button type="submit">Submit</button>
</form>

<script>
  function showAlert(event) {
    event.preventDefault(); // Prevent actual form submission
    alert("Form submitted successfully!");
  }
</script>
