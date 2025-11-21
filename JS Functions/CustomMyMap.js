"use strict";

// Add myMap method to Array prototype
Array.prototype.myMap = function(callback) {
    const result = [];
    for (let i = 0; i < this.length; i++) {
        result.push(callback(this[i], i, this)); // callback gets value, index, array
    }
    return result;
};

// Example usage
const numbers = [1, 2, 3];
const doubled = numbers.myMap(num => num * 2);
console.log("Original:", numbers); // [1,2,3]
console.log("Doubled:", doubled);  // [2,4,6]

// Using index in callback
const indexed = numbers.myMap((num, idx) => num + idx);
console.log("With Index:", indexed); // [1,3,5]
