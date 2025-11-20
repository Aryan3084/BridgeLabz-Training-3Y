// Q9. Odd–Even Number Analyzer

// Array to store numbers 1–30
let numbers = [];

// Fill array using loop
for (let i = 1; i <= 30; i++) {
    numbers.push(i);
}

// Array to store classification results
let results = [];

// Analyze each number
for (let num of numbers) {

    if (num % 3 === 0 && num % 5 === 0) {
        results.push("FizzBuzz");
    } else if (num % 2 === 0) {
        results.push("Even");
    } else {
        results.push("Odd");
    }
}

// Display output
console.log("Numbers:", numbers);
console.log("Analysis:", results);
