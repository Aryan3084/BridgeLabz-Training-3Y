"use strict";

// Q3 – Library Management System

// Book class definition
class Book {
    constructor(title, author, ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isIssued = false; // initially not issued
    }

    // Issue the book
    issueBook() {
        if (this.isIssued) {
            console.log(`Book "${this.title}" is already issued.`);
        } else {
            this.isIssued = true;
            console.log(`Book "${this.title}" has been issued.`);
        }
    }

    // Return the book
    returnBook() {
        if (!this.isIssued) {
            console.log(`Book "${this.title}" was not issued.`);
        } else {
            this.isIssued = false;
            console.log(`Book "${this.title}" has been returned.`);
        }
    }

    // Display book details
    displayDetails() {
        return `Title: ${this.title} | Author: ${this.author} | ISBN: ${this.ISBN} | Issued: ${this.isIssued}`;
    }
}

// Create an array of books
const library = [
    new Book("The Alchemist", "Paulo Coelho", "ISBN001"),
    new Book("1984", "George Orwell", "ISBN002"),
    new Book("To Kill a Mockingbird", "Harper Lee", "ISBN003"),
    new Book("Clean Code", "Robert C. Martin", "ISBN004")
];

// Display all available books
console.log("Available Books:");
library.filter(book => !book.isIssued).forEach(book => console.log(book.displayDetails()));

// Function to issue a book by ISBN
function issueBookByISBN(ISBN) {
    const book = library.find(b => b.ISBN === ISBN);
    if (book) {
        book.issueBook();
    } else {
        console.log(`Book with ISBN ${ISBN} not found.`);
    }
}

// Example: Issue a book
issueBookByISBN("ISBN002");

// Display available books after issuing
console.log("\nAvailable Books After Issuing:");
library.filter(book => !book.isIssued).forEach(book => console.log(book.displayDetails()));
