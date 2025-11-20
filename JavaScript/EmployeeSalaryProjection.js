// Q8. Employee Salary Projection

// Current salary and yearly increment rate
let currentSalary = 40000;    // per month
let incrementRate = 8;        // percentage per year

// Array to store salary projection data
let salaryData = [];

// Calculate salary for next 5 years
for (let year = 1; year <= 5; year++) {
    currentSalary += (currentSalary * incrementRate) / 100; // applying increment
    salaryData.push({
        Year: year,
        Salary: Math.round(currentSalary)
    });
}

// Display projection in table format
console.table(salaryData);
