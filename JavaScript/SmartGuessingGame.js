// Q7. Smart Guessing Game (Number Range)

// Generate random secret number (1–50)
let secretNumber = Math.floor(Math.random() * 50) + 1;

// Test value for user's guess
let userGuess = 47;

// Check guess accuracy
if (userGuess === secretNumber) {
    console.log("Correct guess!");
} else {
    // Check closeness (within ±3)
    if (Math.abs(userGuess - secretNumber) <= 3) {
        console.log("Very close!");
    } else {
        // Check high/low
        if (userGuess > secretNumber) {
            console.log("Too high");
        } else {
            console.log("Too low");
        }
    }
}

// Print both values for reference (optional)
console.log("Your Guess:", userGuess);
console.log("Secret Number:", secretNumber);
