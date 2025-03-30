// 1) Declare and use variables
var globalVar = "I'm a var (old way)";
let age = 25;
const pi = 3.14159;

console.log(globalVar, age, pi);

// 2) Functions for basic calculations
function calculateBMI(weight, height) {
    return (weight / (height * height)).toFixed(2);
}

function convertTemperature(celsius) {
    return (celsius * 9/5) + 32;
}

console.log("BMI:", calculateBMI(70, 1.75));
console.log("Temperature in Fahrenheit:", convertTemperature(25));

// 3) Conditional statements
function validateAge(age) {
    if (age < 0) {
        return "Invalid age";
    } else if (age < 18) {
        return "Minor";
    } else {
        return "Adult";
    }
}

console.log(validateAge(20));

function getDayName(dayNumber) {
    switch(dayNumber) {
        case 1: return "Monday";
        case 2: return "Tuesday";
        case 3: return "Wednesday";
        case 4: return "Thursday";
        case 5: return "Friday";
        case 6: return "Saturday";
        case 7: return "Sunday";
        default: return "Invalid day";
    }
}

console.log(getDayName(3));

// 4) Loops for dynamic list generation
function generateUserList(users) {
    let userList = "<ul>";
    for (let i = 0; i < users.length; i++) {
        userList += `<li>${users[i]}</li>`;
    }
    userList += "</ul>";
    return userList;
}

console.log(generateUserList(["Alice", "Bob", "Charlie"]));

// While loop example
let counter = 5;
while (counter > 0) {
    console.log("Countdown:", counter);
    counter--;
}

// Do-while loop example
let num = 1;
do {
    console.log("Number:", num);
    num++;
} while (num <= 3);
