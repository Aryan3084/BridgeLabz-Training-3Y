// Q10. Citizen Eligibility Validator

// Input values
let age = 19;
let isCitizen = true;

// Eligibility logic
if (age >= 18) {
    
    if (isCitizen && age >= 21) {
        console.log("Eligible for all services.");
    } else if (isCitizen && age >= 18 && age < 21) {
        console.log("Eligible to vote only.");
    } else if (!isCitizen) {
        console.log("Only age criteria met.");
    }

} else {
    console.log("Not eligible yet.");
}
