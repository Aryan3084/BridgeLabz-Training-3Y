"use strict";

// Q1 – Dynamic Data Parser

// Mixed API data
const apiData = ["25", "true", "false", "NaN", " ", "100px", "3.14", null, undefined];

// Arrays to store valid and invalid numbers
let validNumbers = [];
let invalidNumbers = [];

// Loop through each value
for (let i = 0; i < apiData.length; i++) {
    let value = apiData[i];

    // Convert to Number
    let numValue = Number(value);
    
    // Check if valid number
    if (!isNaN(numValue) && value !== null && value !== undefined && value.toString().trim() !== "") {
        validNumbers.push(numValue);
    } else {
        invalidNumbers.push(value);
    }

    // Convert to Boolean
    let boolValue = Boolean(value);

    // Convert to String
    let strValue = String(value);

    // Log detailed report for each item
    console.log(`Original: ${value} | Number: ${numValue} | Boolean: ${boolValue} | String: "${strValue}"`);
}

// Print arrays of valid and invalid numbers
console.log("\nValid Numbers Array:", validNumbers);
console.log("Invalid Numbers Array:", invalidNumbers);
