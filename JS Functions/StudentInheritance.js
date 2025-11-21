"use strict";

// Person constructor
function Person(name) {
    this.name = name;
}

// Method on Person prototype
Person.prototype.showName = function() {
    console.log(`Name: ${this.name}`);
};

// Student constructor inheriting from Person
function Student(name, branch) {
    Person.call(this, name); // call Person constructor
    this.branch = branch;
}

// Set up inheritance
Student.prototype = Object.create(Person.prototype);
Student.prototype.constructor = Student;

// Add method to Student prototype
Student.prototype.showBranch = function() {
    console.log(`Branch: ${this.branch}`);
};

// Create student objects
const student1 = new Student("Aryan", "Computer Science");
const student2 = new Student("Mina", "Electronics");

// Demonstrate prototype chain
student1.showName();   // Name: Aryan (from Person prototype)
student1.showBranch(); // Branch: Computer Science (from Student prototype)

student2.showName();   // Name: Mina
student2.showBranch(); // Branch: Electronics

// Check prototype chain
console.log(student1.__proto__ === Student.prototype); // true
console.log(student1.__proto__.__proto__ === Person.prototype); // true
