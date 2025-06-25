package Day2;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class Post_Assessment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact[] contacts = new Contact[100];  // max 100 contacts
        int count = 0;

        while (true) {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add contact");
            System.out.println("2. View contacts");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                if (count >= contacts.length) {
                    System.out.println("Address book is full!");
                    continue;
                }
                System.out.print("Enter name: ");
                String name = scanner.nextLine().trim();
                System.out.print("Enter phone: ");
                String phone = scanner.nextLine().trim();

                contacts[count++] = new Contact(name, phone);
                System.out.println("Contact added!");

            } else if (choice.equals("2")) {
                System.out.println("\n--- All Contacts ---");
                if (count == 0) {
                    System.out.println("No contacts stored.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.printf("%d. %s — %s%n", i+1, contacts[i].name, contacts[i].phone);
                    }
                }

            } else if (choice.equals("3")) {
                System.out.println("Bye!");
                break;

            } else {
                System.out.println("Invalid choice, please choose 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
