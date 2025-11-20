"use strict";

// Q10 – Nested Hoisting and Closures

function outer() {
    console.log(count); // undefined due to hoisting of var count in outer
    var count = 5;

    function inner() {
        console.log(count); // undefined due to hoisting of var count in inner
        var count = 10;
    }

    inner();
}

outer();

// -----------------------------
// Explanation of Output:
// 1. outer(): var count is hoisted, initialized as undefined at start of function execution.
//    So console.log(count) prints undefined, then count is assigned 5.
// 2. inner(): var count inside inner is hoisted, shadowing outer's count.
//    console.log(count) prints undefined, then count is assigned 10.
// 3. Separate memory contexts (function scopes) ensure outer and inner counts are independent.
// 4. Call stack:
//    - outer() called → outer execution context created
//    - inner() called → inner execution context created
//    - inner() completes → returns
//    - outer() completes → returns

// -----------------------------
// Arrow function version
function outerArrow() {
    var count = 5;

    const innerArrow = () => {
        // Arrow function does NOT create its own 'this' or hoisted vars differently
        // But var inside arrow still behaves normally
        console.log(count); // refers to outerArrow's count, prints 5
    }

    innerArrow();
}

outerArrow(); // Output: 5
