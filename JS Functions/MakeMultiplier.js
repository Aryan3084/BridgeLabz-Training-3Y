"use strict";

// Function that returns another function (closure)
function makeMultiplier(multiplier) {
    // The inner function has access to 'multiplier' via closure
    return function(number) {
        return number * multiplier;
    };
}

// Example usage
const triple = makeMultiplier(3);
console.log(triple(5)); // 15

const double = makeMultiplier(2);
console.log(double(10)); // 20
