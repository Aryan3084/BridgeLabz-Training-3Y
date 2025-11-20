"use strict";

// Q8 – Strict Mode Showdown

// Original code causes errors in strict mode:
// 1. Function parameters cannot have duplicate names (a, a)
// 2. Assigning to undeclared variable `total` throws ReferenceError
// 3. delete on a non-configurable variable throws SyntaxError

// Fixed ES6-compliant version
function demoES6(a, b) {
    // Declare variables properly
    let total = 10;

    // Deleting a variable is illegal; instead, we can reset its value
    total = 0;

    console.log(`a: ${a}, b: ${b}, total: ${total}`);
}

// Call fixed function
demoES6(5, 10);
