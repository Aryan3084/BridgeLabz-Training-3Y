// Q3. Monthly Expense Tracker

// Array storing expenses for different categories
let expenses = [12000, 3000, 15000, 4000, 2500]; 
// [food, travel, rent, bills, leisure]

// Calculate total expense
let totalExpense = expenses[0] + expenses[1] + expenses[2] + expenses[3] + expenses[4];

// Calculate average expense
let averageExpense = totalExpense / expenses.length;

// Add 10% tax using assignment operator
totalExpense += totalExpense * 0.10;

// Display results (rounded values)
console.log("Total Expense After Tax: ₹" + totalExpense.toFixed(2));
console.log("Average Monthly Expense: ₹" + averageExpense.toFixed(2));
console.log("Final Payable Amount: ₹" + totalExpense.toFixed(2));
