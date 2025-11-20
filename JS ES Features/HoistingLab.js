"use strict";

// Original snippet explanation:

// 1. var score → hoisted with default value undefined
// 2. function announce → hoisted fully
// 3. let status → hoisted but in TDZ (Temporal Dead Zone), can't access before declaration
// 4. function startGame → hoisted fully
// 5. Calling startGame() before status is declared → ReferenceError

// Predict output:
// console.log(score); // undefined (var hoisted)
// announce(); // "Game started"
// startGame(); // ReferenceError (status not yet initialized)

// -----------------------------
// Fixed version
var score = 50;
let status = "ready";

function announce() {
    console.log("Game started");
}

function startGame() {
    console.log(status);
}

// Execution
console.log(score);    // 50
announce();            // "Game started"
startGame();           // "ready"

// -----------------------------
// Arrow function version
const announceArrow = () => console.log("Game started");
const startGameArrow = () => console.log(status);

console.log(score);       // 50
announceArrow();          // "Game started"
startGameArrow();         // "ready"
