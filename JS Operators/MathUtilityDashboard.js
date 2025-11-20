// Q3. Math Utility Dashboard

// Given number
let x = 16.75;

// Calculations
let roundedValue = Math.round(x);
let squareRoot = Math.sqrt(x);
let powerValue = Math.pow(x, 3);
let randomValue = Math.floor(Math.random() * 41) + 10; // 10-50

// Formatted output
console.log(`
----- Math Utility Dashboard -----
Original Number : ${x}
Rounded Value   : ${roundedValue}
Square Root     : ${squareRoot}
Cubed Value     : ${powerValue}
Random (10-50)  : ${randomValue}
----------------------------------
`);
