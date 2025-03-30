function sendMessage() {
    let userInput = document.getElementById("userInput").value.trim();
    if (userInput === "") return;

    let chatbox = document.getElementById("chatbox");

    // Display user message
    let userMessage = `<p class="user">🧑‍💻 You: ${userInput}</p>`;
    chatbox.innerHTML += userMessage;

    // Bot response logic
    let botResponse = getBotResponse(userInput.toLowerCase());

    // Display bot message
    let botMessage = `<p class="bot">🤖 Bot: ${botResponse}</p>`;
    chatbox.innerHTML += botMessage;

    // Scroll to latest message
    chatbox.scrollTop = chatbox.scrollHeight;

    // Clear input field
    document.getElementById("userInput").value = "";
}

function getBotResponse(input) {
    if (input.includes("hello") || input.includes("hi")) {
        return "Hello! How can I assist you today?";
    } else if (input.includes("how are you")) {
        return "I'm just a bot, but I'm doing great! Thanks for asking.";
    } else if (input.includes("your name")) {
        return "I am ChatBot, your virtual assistant!";
    } else if (input.includes("bye")) {
        return "Goodbye! Have a great day!";
    } else {
        return "I'm not sure about that. Can you ask something else?";
    }
}

// Handle Enter key press
function handleKeyPress(event) {
    if (event.key === "Enter") {
        sendMessage();
    }
}
