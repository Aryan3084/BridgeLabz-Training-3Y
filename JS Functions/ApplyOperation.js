"use strict";

// Function that takes an array and a callback operation
function applyOperation(numbers, operation) {
    return numbers.map(operation); // Apply callback to each element
}

// Example array
const nums = [1, 2, 3, 4];

// Double each number
const doubled = applyOperation(nums, num => num * 2);
console.log("Doubled:", doubled);

// Square each number
const squared = applyOperation(nums, num => num ** 2);
console.log("Squared:", squared);
