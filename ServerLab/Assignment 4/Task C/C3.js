<input type="text" id="itemInput" placeholder="Enter an item">
<button onclick="addItem()">Add</button>

<ul id="itemList"></ul>

<script>
  function addItem() {
    let input = document.getElementById("itemInput");
    if (input.value.trim() !== "") {
      let li = document.createElement("li");
      li.innerHTML = input.value + ' <button onclick="removeItem(this)">Remove</button>';
      document.getElementById("itemList").appendChild(li);
      input.value = "";
    }
  }

  function removeItem(button) {
    button.parentElement.remove();
  }
</script>
