class BookItem {
    String title;
    int publicationYear;

    BookItem(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }
}

class AuthorInfo extends BookItem {
    String authorName;
    String bio;

    AuthorInfo(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName + ", Bio: " + bio);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        AuthorInfo book = new AuthorInfo("Java Basics", 2024, "Aryan Singh", "Software Developer and Author");
        book.displayInfo();
    }
}
