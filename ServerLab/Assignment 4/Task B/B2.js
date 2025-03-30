<ul id="itemList">
  <li>Item 1 <button onclick="deleteItem(this)">Delete</button></li>
  <li>Item 2 <button onclick="deleteItem(this)">Delete</button></li>
</ul>

<script>
  function deleteItem(button) {
    if (confirm("Are you sure you want to delete this item?")) {
      button.parentElement.remove();
    }
  }
</script>
