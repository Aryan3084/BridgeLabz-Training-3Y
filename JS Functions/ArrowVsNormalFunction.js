"use strict";

// Initial object with arrow function
const user1 = {
    name: "Aryan",
    showName: () => {
        console.log("Arrow function:", this.name);
    }
};

user1.showName(); // undefined because arrow functions do not have their own 'this'

// Fixed version using normal function
const user2 = {
    name: "Aryan",
    showName() { // normal function
        console.log("Normal function:", this.name);
    }
};

user2.showName(); // "Aryan"
