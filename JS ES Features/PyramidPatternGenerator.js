"use strict";

// Default pyramid height (can be modified by user input)
let height = 5;

// Using let for loop variables (recommended)
console.log("Pyramid using let:");
for (let i = 1; i <= height; i++) {
    let row = "";
    for (let j = 1; j <= i; j++) {
        row += "* ";
    }
    console.log(row);
}

// Using var instead of let
console.log("\nPyramid using var:");
for (var i = 1; i <= height; i++) {
    var row = "";
    for (var j = 1; j <= i; j++) {
        row += "* ";
    }
    console.log(row);
}

// -----------------------------
// Observations:
// 1. With var, loop variables are function-scoped, so re-using them outside the loop is possible.
// 2. With let, loop variables are block-scoped, preventing accidental overwrites.
// 3. "use strict" ensures you declare all variables, avoiding accidental globals.
// 4. Outer loop height can be modified by user input.
