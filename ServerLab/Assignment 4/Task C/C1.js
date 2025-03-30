<p id="text">Original Text</p>
<button onclick="changeText()">Change Text</button>

<img id="image" src="image1.jpg" width="200">
<button onclick="changeImage()">Change Image</button>

<script>
  function changeText() {
    document.getElementById("text").innerText = "Text Changed!";
  }

  function changeImage() {
    document.getElementById("image").src = "image2.jpg";
  }
</script>
