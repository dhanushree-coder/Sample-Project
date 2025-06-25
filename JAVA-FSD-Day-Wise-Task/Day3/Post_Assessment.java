package Day3;

import java.util.Scanner;

class Book {
    String title;
    boolean isIssued;

    Book(String title) {
        this.title = title;
        this.isIssued = false;
    }
}

class Library {
    Book[] books = new Book[100];
    int count = 0;

    // Add book
    void addBook(String title) {
        books[count++] = new Book(title);
        System.out.println("Book added: " + title);
    }

    // Remove book
    void removeBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--count] = null;
                System.out.println("Book removed: " + title);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Issue book
    void issueBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                if (!books[i].isIssued) {
                    books[i].isIssued = true;
                    System.out.println("Book issued: " + title);
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Display all books
    void showBooks() {
        System.out.println("\n--- Book List ---");
        if (count == 0) {
            System.out.println("No books in library.");
            return;
        }
        for (int i = 0; i < count; i++) {
            String status = books[i].isIssued ? "Issued" : "Available";
            System.out.println((i + 1) + ". " + books[i].title + " - " + status);
        }
    }
}

public class Post_Assessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Show All Books");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String addTitle = sc.nextLine();
                    lib.addBook(addTitle);
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String remTitle = sc.nextLine();
                    lib.removeBook(remTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    lib.issueBook(issueTitle);
                    break;
                case 4:
                    lib.showBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
