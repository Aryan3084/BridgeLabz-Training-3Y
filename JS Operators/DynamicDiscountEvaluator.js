// Q8. Dynamic Discount Evaluator

const cart = [
    { item: "Laptop", category: "electronics", price: 45000 },
    { item: "Shoes", category: "fashion", price: 2500 },
    { item: "Book", category: "education", price: 600 }
];

// Apply category-wise discounts
for (let i = 0; i < cart.length; i++) {
    if (cart[i].category === "electronics") {
        cart[i].price -= cart[i].price * 0.10;
    } else if (cart[i].category === "fashion") {
        cart[i].price -= cart[i].price * 0.05;
    }
}

// Calculate total after category discounts
let total = cart.reduce((sum, product) => sum + product.price, 0);

// Apply extra overall discount if total > 50000
if (total > 50000) {
    total -= total * 0.05;
}

// Display final result
console.log("Final Cart Total:", Math.round(total));
console.log("Updated Cart:", cart);
