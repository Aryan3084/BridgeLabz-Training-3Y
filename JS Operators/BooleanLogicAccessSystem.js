// Q5. Boolean Logic Access System

// Security condition variables
let isDoorLocked = true;
let isWindowClosed = true;
let isAlarmOn = true;
let isOwnerInside = false;   // Change to true to test access

// Apply security logic
if (isAlarmOn && isDoorLocked && isWindowClosed && isOwnerInside) {
    console.log("Secure");
} else {
    console.log("Unsafe");
}
