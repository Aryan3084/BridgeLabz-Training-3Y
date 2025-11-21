"use strict";

// Q9 – Shopping Cart Total

class Cart {
    constructor() {
        this.items = [];
        this.discountPercent = 0;
    }

    // Add item to cart
    addItem(name, price, quantity) {
        this.items.push({ name, price, quantity });
    }

    // Calculate total before discount
    getTotal() {
        return this.items.reduce((sum, item) => sum + item.price * item.quantity, 0);
    }

    // Apply coupon if valid
    applyCoupon(coupon) {
        const couponRegex = /^(SAVE|DISC)(\d{1,2})$/i;
        const match = coupon.match(couponRegex);
        if (match) {
            this.discountPercent = Number(match[2]);
            console.log(`Coupon applied! ${this.discountPercent}% discount.`);
        } else {
            console.log("Invalid coupon code.");
        }
    }

    // Calculate total after discount
    getFinalTotal() {
        const total = this.getTotal();
        const final = total - (total * this.discountPercent / 100);
        return final.toFixed(2);
    }

    // Display cart details
    displayCart() {
        console.log("Cart Items:");
        this.items.forEach(item => {
            console.log(`${item.name} - ₹${item.price} x ${item.quantity} = ₹${(item.price * item.quantity).toFixed(2)}`);
        });
        console.log(`Total: ₹${this.getTotal().toFixed(2)}`);
        console.log(`Final Total after discount: ₹${this.getFinalTotal()}`);
    }
}

// Example usage
const myCart = new Cart();
myCart.addItem("Laptop", 45000, 1);
myCart.addItem("Shoes", 2500, 2);
myCart.addItem("Book", 600, 3);

console.log("Before coupon:");
myCart.displayCart();

// Apply a coupon
myCart.applyCoupon("SAVE10"); // 10% discount
console.log("\nAfter applying coupon:");
myCart.displayCart();
