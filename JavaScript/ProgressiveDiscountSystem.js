// Q6. Progressive Discount System

// Input total purchase amount
let totalPurchase = 8200;

// Variable to store discount percentage
let discountPercent = 0;

// Apply discount based on amount
if (totalPurchase >= 10000) {
    discountPercent = 25;
} else if (totalPurchase >= 5000) {
    discountPercent = 15;
} else if (totalPurchase >= 2000) {
    discountPercent = 5;
} else {
    discountPercent = 0;
}

// Calculate final amount
let discountAmount = (totalPurchase * discountPercent) / 100;
let finalPrice = totalPurchase - discountAmount;

// Print details (rounded)
console.log("Original Total: ₹" + Math.round(totalPurchase));
console.log("Discount Applied: " + discountPercent + "%");
console.log("Final Price After Discount: ₹" + Math.round(finalPrice));
