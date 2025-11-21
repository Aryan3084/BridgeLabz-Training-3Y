"use strict";

// Q1: E-Commerce Product Manager

// Product class definition
class Product {
    constructor(id, name, price, category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Method to apply discount (e.g., 10%)
    applyDiscount(discountPercent) {
        this.price = this.price - (this.price * discountPercent / 100);
    }

    // Method to display product details
    displayDetails() {
        return `ID: ${this.id} | Name: ${this.name} | Price: ₹${this.price.toFixed(2)} | Category: ${this.category}`;
    }
}

// Create multiple product objects
const products = [
    new Product(1, "Laptop", 45000, "Electronics"),
    new Product(2, "Shoes", 2500, "Fashion"),
    new Product(3, "Book", 600, "Education"),
    new Product(4, "Headphones", 1200, "Electronics")
];

// Apply discount to one product (optional)
products[0].applyDiscount(10); // 10% discount on Laptop

// Display all products
console.log("All Products:");
products.forEach(p => console.log(p.displayDetails()));

// Filter and display products with price > 1000
const expensiveProducts = products.filter(p => p.price > 1000);
console.log("\nProducts with price > 1000:");
expensiveProducts.forEach(p => console.log(p.displayDetails()));
