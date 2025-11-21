"use strict";

// Constructor function
function Car(brand, model) {
    this.brand = brand;
    this.model = model;
}

// Add method to prototype
Car.prototype.getDetails = function() {
    console.log(`Car Brand: ${this.brand}, Model: ${this.model}`);
};

// Create car objects
const car1 = new Car("Toyota", "Corolla");
const car2 = new Car("Honda", "Civic");

// Call prototype method
car1.getDetails(); // Car Brand: Toyota, Model: Corolla
car2.getDetails(); // Car Brand: Honda, Model: Civic
