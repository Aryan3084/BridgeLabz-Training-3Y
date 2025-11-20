"use strict";

// Q2 – Employee Bonus Calculator

const employees = [
    { name: "Amit", salary: "45000", years: "5" },
    { name: "Sara", salary: "38000", years: "2" },
    { name: "Kiran", salary: "52000", years: "7" }
];

// Loop through employees
for (let i = 0; i < employees.length; i++) {
    try {
        let emp = employees[i];

        // Validate required properties
        if (!emp.name || !emp.salary || !emp.years) {
            throw new Error(`Missing data for employee at index ${i}`);
        }

        // Convert salary and years to numbers
        let salary = Number(emp.salary);
        let years = Number(emp.years);

        if (isNaN(salary) || isNaN(years)) {
            throw new Error(`Invalid numeric value for employee: ${emp.name}`);
        }

        // Calculate bonus
        let bonus = years > 3 ? salary * 0.10 : salary * 0.05;

        // Print formatted employee details
        console.log(`Employee: ${emp.name} | Salary: ₹${salary} | Years: ${years} | Bonus: ₹${bonus.toFixed(2)}`);

    } catch (error) {
        console.error("Error processing employee:", error.message);
    }
}
