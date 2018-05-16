	    // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.
import java.util.ArrayList;
import java.util.Scanner;

class Contact{
    private String name;
    private String number;

    public Contact(){}

    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }
}

class MobilePhone {
    private ContactList contacts;
    public MobilePhone(){
        this.contacts = new ContactList();
    }

    public void powerOn(){
        boolean isOn = true;
        Scanner scan = new Scanner(System.in);
        int option;
        // Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        while(isOn){
            System.out.print("Choose one of the following by selecting number:\n\t" + 
            "1. Print List of Contacts\n\t2. Add New Contact\n\t3. Update Existing Contact\n\t" +
            "4. Remove Contact\n\t5. Search/Find contact\n\t6. Quit\nEnter your choice here:");
            option = scan.nextInt();
            switch (option) {
                case 1: 
                    this.contacts.printList();
                    break;
                case 2:
                    System.out.println("You have chosen to add a new contact.");
                    System.out.print("Please enter a name: ");
                    String name = scan.next();
                    System.out.print("\nPlease enter a phone number: ");
                    String number = scan.next();
                    this.contacts.addContact(name, number);
                    System.out.println("\nAdded new contact");
                    break;
                case 3: 
                    System.out.println("Update Existing Contact");
                    break;
                case 4:
                    System.out.println("Remove contact");
                    break;
                case 5:
                    System.out.println("Search/find");
                    break;
                case 6:
                    System.out.println("Quit");
                    isOn = false;
                    break;
                default:
                    System.out.println("Choose 1 - 6, not valid selction");
                    break;
            }
        }
        scan.close();
    }
}

public class Main{
    public static void main(String[] args) {
        // create a phone, print out contact list
        MobilePhone iphone = new MobilePhone();
        iphone.powerOn();
    }
}