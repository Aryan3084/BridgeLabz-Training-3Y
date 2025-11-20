// Q4. Array Performance Analyzer

// Function to generate random score between 30–100
function getRandomScore() {
    return Math.floor(Math.random() * 71) + 30;
}

// Create array of 8 random scores
let scores = Array(8).map ? Array.from({ length: 8 }, getRandomScore)
                         : Array.from({ length: 8 }, () => getRandomScore()); 

// Highest & lowest score
let highest = Math.max(...scores);
let lowest = Math.min(...scores);

// Average score using reduce
let average = scores.reduce((sum, s) => sum + s, 0) / scores.length;

// Count passed students
let passedCount = scores.filter(score => score >= 50).length;

// Final formatted output
console.log(`
------ Student Performance Summary ------
Scores           : ${scores.join(", ")}
Highest Score    : ${highest}
Lowest Score     : ${lowest}
Average Score    : ${average.toFixed(2)}
Students Passed  : ${passedCount} out of ${scores.length}
-----------------------------------------
`);
