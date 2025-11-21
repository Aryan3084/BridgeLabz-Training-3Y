"use strict";

// Person constructor
function Person(name) {
    this.name = name;
}
Person.prototype.showName = function() {
    console.log(`Person Name: ${this.name}`);
};

// Faculty constructor
function Faculty(name, department) {
    Person.call(this, name); // inherit name
    this.department = department;
}
// Set up inheritance
Faculty.prototype = Object.create(Person.prototype);
Faculty.prototype.constructor = Faculty;
Faculty.prototype.showDepartment = function() {
    console.log(`Department: ${this.department}`);
};

// Professor constructor
function Professor(name, department, title) {
    Faculty.call(this, name, department); // inherit name & department
    this.title = title;
}
// Set up inheritance
Professor.prototype = Object.create(Faculty.prototype);
Professor.prototype.constructor = Professor;
Professor.prototype.showTitle = function() {
    console.log(`Title: ${this.title}`);
};

// Create Professor object
const prof = new Professor("Dr. Aryan", "Computer Science", "Head of Department");

// Access all methods up the chain
prof.showName();       // Person method
prof.showDepartment(); // Faculty method
prof.showTitle();      // Professor method

// Verify prototype chain
console.log(prof.__proto__ === Professor.prototype);         // true
console.log(prof.__proto__.__proto__ === Faculty.prototype); // true
console.log(prof.__proto__.__proto__.__proto__ === Person.prototype); // true
