// Q1. Scope Conflict Resolver

// Global variable
let bonus = 5000;

function calculateSalary() {
    // Local variables
    let salary = 40000;
    let isPermanent = true; // change to false to test behavior

    // Apply bonus only if employee is permanent
    if (isPermanent) {
        salary += bonus; // accessing global bonus
    }

    console.log("Total Salary:", salary);
}

// Calling function
calculateSalary();

// Demonstrating change does NOT affect global scope
console.log("Global Bonus:", bonus);
