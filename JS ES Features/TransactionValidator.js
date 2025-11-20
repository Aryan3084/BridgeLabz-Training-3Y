"use strict";

// Q3 – Transaction Validator

const transactions = [
    { id: 1, amount: 2000 },
    { id: 2, amount: -500 },
    { id: 3 },
    null
];

// Arrays to categorize transactions
let validTransactions = [];
let invalidTransactions = [];

// Loop through transactions
for (let i = 0; i < transactions.length; i++) {
    try {
        let tx = transactions[i];

        // Simulate breakpoint: you can put debugger here to inspect
        // debugger;

        // Check for null
        if (tx === null) {
            throw new Error(`Transaction at index ${i} is null`);
        }

        // Check for missing id or amount
        if (tx.id === undefined || tx.amount === undefined) {
            throw new Error(`Transaction with missing id or amount at index ${i}`);
        }

        // Check for negative amount
        if (tx.amount < 0) {
            throw new Error(`Transaction with negative amount: ID ${tx.id}`);
        }

        // If all checks pass, push to valid
        validTransactions.push(tx);

    } catch (error) {
        // Categorize invalid transactions
        invalidTransactions.push({ index: i, error: error.message });
        console.error("Error:", error.message);
    }
}

// Print final report
console.log("\nValid Transactions:", validTransactions);
console.log("Invalid Transactions:", invalidTransactions);
console.log(`Total Successful: ${validTransactions.length}`);
console.log(`Total Failed: ${invalidTransactions.length}`);
