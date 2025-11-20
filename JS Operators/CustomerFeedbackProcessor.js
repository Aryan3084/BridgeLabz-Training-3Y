// Q7. Customer Feedback Processor

// Feedback string
let feedback = "Great product! Fast delivery and amazing sound quality!";

// Count number of words
let wordCount = feedback.split(" ").length;

// Check for negative keywords
let hasNegativeWords = feedback.toLowerCase().includes("bad") || 
                       feedback.toLowerCase().includes("poor");

// Output response
if (!hasNegativeWords) {
    console.log("Positive Feedback");
} else {
    console.log("Needs Improvement");
}

// Display summary
console.log("Feedback:", feedback);
console.log("Word Count:", wordCount);
