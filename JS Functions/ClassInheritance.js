"use strict";

// ES6 Class version
class Person {
    constructor(name) {
        this.name = name;
    }

    showName() {
        console.log(`Name: ${this.name}`);
    }
}

class Student extends Person {
    constructor(name, branch) {
        super(name); // call Person constructor
        this.branch = branch;
    }

    showBranch() {
        console.log(`Branch: ${this.branch}`);
    }
}

// Create student objects
const student1 = new Student("Aryan", "Computer Science");
const student2 = new Student("Mina", "Electronics");

// Demonstrate methods
student1.showName();   // Name: Aryan
student1.showBranch(); // Branch: Computer Science

student2.showName();   // Name: Mina
student2.showBranch(); // Branch: Electronics

// Compare with prototype version
console.log(student1 instanceof Student); // true
console.log(student1 instanceof Person);  // true
