"use strict";

// Callback function to show end message
function showEndMessage() {
    console.log("Welcome to the course!");
}

// Main function with callback
function greetUser(name, callback) {
    console.log(`Hello ${name}`);
    callback(); // Execute the callback function
}

// Demonstrate callback flow
greetUser("Aryan", showEndMessage);
