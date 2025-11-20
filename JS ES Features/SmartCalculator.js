"use strict";

// Q7 – Smart Calculator

const operations = ["add", "divide", "power", "root", "subtract"];
const num1 = 25;
const num2 = 0;

// Loop through all operations
for (let op of operations) {
    try {
        let result;

        switch (op) {
            case "add":
                result = num1 + num2;
                break;

            case "subtract":
                result = num1 - num2;
                break;

            case "divide":
                if (num2 === 0) throw new Error("Division by zero is not allowed");
                result = num1 / num2;
                break;

            case "power":
                result = Math.pow(num1, num2);
                break;

            case "root":
                if (num1 < 0) throw new Error("Cannot take square root of negative number");
                result = Math.sqrt(num1);
                break;

            default:
                throw new Error(`InvalidOperationError: ${op} is not recognized`);
        }

        console.log(`Operation: ${op} | Result: ${result}`);
    } catch (error) {
        console.error(`Operation: ${op} | Error: ${error.message}`);
    }
}
