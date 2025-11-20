"use strict";

// Q4 – Debugging Mystery

function showMessage() {
    // Under strict mode, undeclared variables cause a ReferenceError
    // Fix: declare the variable using let/const/var
    let greeting = "Welcome"; 

    // Optional: put a breakpoint here to watch 'greeting' in VS Code
    // debugger;

    console.log(greeting);
}

// Call the function
showMessage();
