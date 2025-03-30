<p id="hoverText" onmouseover="changeColor()" onmouseout="resetColor()">Hover over me!</p>

<script>
  function changeColor() {
    document.getElementById("hoverText").style.color = "red";
  }

  function resetColor() {
    document.getElementById("hoverText").style.color = "black";
  }
</script>
