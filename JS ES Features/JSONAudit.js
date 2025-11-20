"use strict";

// Q9 – JSON Audit

const rawData = [
    '{"user":"Alex","age":25}',
    '{"id":2}',
    '{invalid}',
    '{"user":"Mina","age":"22"}'
];

let cleanData = [];
let errors = [];

for (let i = 0; i < rawData.length; i++) {
    try {
        let obj = JSON.parse(rawData[i]);

        // Check required keys
        if (!obj.user || !obj.age) {
            throw new Error("Missing required keys (user or age)");
        }

        // Convert age to Number
        obj.age = Number(obj.age);

        // Filter under-18 users
        if (obj.age < 18) {
            throw new Error(`User under 18: ${obj.user}`);
        }

        // Push valid entry
        cleanData.push(obj);

    } catch (error) {
        // Log error with line number
        errors.push({ line: i, message: error.message });
        console.error(`Error at line ${i}: ${error.message}`);
    }
}

// Print final clean data
console.log("\nClean Data:", cleanData);
console.log("Errors Logged:", errors);
