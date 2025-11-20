// Q9. Random Math Quiz Generator

// Generate two random numbers (1–20)
let num1 = Math.floor(Math.random() * 20) + 1;
let num2 = Math.floor(Math.random() * 20) + 1;

// List of possible operators
let operators = ['+', '-', '*', '/'];

// Select a random operator
let operator = operators[Math.floor(Math.random() * operators.length)];

let correctAnswer;

// Calculate answer using switch
switch (operator) {
    case '+':
        correctAnswer = num1 + num2;
        break;
    case '-':
        correctAnswer = num1 - num2;
        break;
    case '*':
        correctAnswer = num1 * num2;
        break;
    case '/':
        correctAnswer = (num1 / num2).toFixed(2);
        break;
    default:
        correctAnswer = "Invalid Operation";
}

// Display the question and correct answer
console.log(`Question: ${num1} ${operator} ${num2}`);
console.log(`Correct Answer: ${correctAnswer}`);
