// Q2. Multi-Type Data Summary

// Declaring variables of different data types
let userName = "Aryan";                // string
let userAge = 21;                      // number
let isActive = true;                   // boolean
let hobbies = ["coding", "music"];     // array
let userDetails = { city: "Delhi" };   // object
let score = null;                      // null
let pendingTask;                       // undefined

// Creating a summary array with label, value, and type
let summary = [
    { label: "User Name", value: userName, type: typeof userName },
    { label: "User Age", value: userAge, type: typeof userAge },
    { label: "Active Status", value: isActive, type: typeof isActive },
    { label: "Hobbies", value: hobbies, type: Array.isArray(hobbies) ? "array" : typeof hobbies },
    { label: "User Details", value: userDetails, type: typeof userDetails },
    { label: "Score", value: score, type: typeof score },  // typeof null = "object" (JS quirk)
    { label: "Pending Task", value: pendingTask, type: typeof pendingTask }
];

// Printing formatted table
console.table(summary);
