// Q5. Weather Activity Planner

// Declaring variables
let temperature = 28;     // in °C
let isRaining = false;    // boolean
let windSpeed = 10;       // in km/h

// Decision based on conditions
if (isRaining) {
    console.log("Stay indoors with hot coffee.");
} else if (temperature > 35) {
    console.log("Go swimming.");
} else if (temperature < 15 && windSpeed > 20) {
    console.log("Too cold and windy — stay home.");
} else {
    console.log("Perfect day for a walk.");
}
