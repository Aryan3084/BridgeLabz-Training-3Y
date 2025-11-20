// Q4. Academic Performance Evaluator

// Array storing marks of 5 subjects
let marks = [78, 92, 88, 67, 81];

// Check if any subject is less than 35 (automatic detention)
let hasFailedSubject = false;

for (let i = 0; i < marks.length; i++) {
    if (marks[i] < 35) {
        hasFailedSubject = true;
        break;
    }
}

// Calculate total marks
let totalMarks = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];

// Calculate percentage
let percentage = (totalMarks / (marks.length * 100)) * 100;

// Decision Output
if (hasFailedSubject) {
    console.log("Detained (Failed in a subject)");
} else if (percentage >= 85) {
    console.log("Promoted with Distinction");
} else if (percentage >= 50 && percentage < 85) {
    console.log("Promoted");
} else {
    console.log("Detained");
}

// Display percentage (rounded)
console.log("Percentage:", percentage.toFixed(2) + "%");
