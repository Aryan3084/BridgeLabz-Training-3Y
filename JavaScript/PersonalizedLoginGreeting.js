// Q1. Personalized Login Greeting

// Variable stores user's name
let userName = "Aryan";

// Variable stores the current hour of the day (0–23)
let currentHour = new Date().getHours();

// Time-based conditional greeting
if (currentHour < 12) {
    console.log(`Good Morning ${userName}!`);
} else if (currentHour >= 12 && currentHour < 17) {
    console.log(`Good Afternoon ${userName}!`);
} else {
    console.log(`Good Evening ${userName}!`);
}
