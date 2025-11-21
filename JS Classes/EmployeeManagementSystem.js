"use strict";

// Q6 – Employee Management System

// Employee class
class Employee {
    constructor(id, name, department, salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary; // monthly salary
    }

    // Calculate annual salary
    getAnnualSalary() {
        return this.salary * 12;
    }

    // Apply bonus percentage to monthly salary
    applyBonus(percent) {
        this.salary += (this.salary * percent / 100);
    }

    // Display employee details
    displayDetails() {
        return `ID: ${this.id} | Name: ${this.name} | Dept: ${this.department} | Monthly Salary: ₹${this.salary.toFixed(2)} | Annual Salary: ₹${this.getAnnualSalary().toFixed(2)}`;
    }
}

// Create employee objects
const employees = [
    new Employee(1, "Amit", "HR", 4000),
    new Employee(2, "Sara", "Finance", 5000),
    new Employee(3, "Kiran", "Tech", 6000),
    new Employee(4, "Mina", "Support", 3500),
    new Employee(5, "Ravi", "Tech", 7000)
];

// Apply bonus (example 10%) to all employees
employees.forEach(emp => emp.applyBonus(10));

// Display each employee's details
console.log("Employee Details After Bonus:");
employees.forEach(emp => console.log(emp.displayDetails()));

// Calculate total annual payout using reduce
const totalAnnualPayout = employees.reduce((sum, emp) => sum + emp.getAnnualSalary(), 0);
console.log(`\nTotal Annual Payout of Company: ₹${totalAnnualPayout.toFixed(2)}`);
