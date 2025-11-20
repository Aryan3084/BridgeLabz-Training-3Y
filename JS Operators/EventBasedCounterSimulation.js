// Q6. Event-Based Counter Simulation

// Global counter variable
let count = 0;

// Function to simulate event system
function counterEvents() {

    // Nested functions modify the outer variable
    function increment() {
        count++;
        console.log("Count After Increment:", count);
    }

    function decrement() {
        count--;
        console.log("Count After Decrement:", count);
    }

    // Simulating clicks by manually calling functions
    increment(); // Click 1
    increment(); // Click 2
    decrement(); // Click 3
    increment(); // Click 4
}

// Running the event simulation
counterEvents();

// Final count
console.log("Final Count Value:", count);
