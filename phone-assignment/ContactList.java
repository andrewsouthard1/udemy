import java.util.ArrayList;

public class ContactList{
    private ArrayList<Contact> contacts;

    public ContactList(){
		this.contacts = new ArrayList<Contact>();
    }

    public void printList(){
        int length = getSize();
        for(int i=0; i<length; i++){
            String contactName = findContact(i).getName();
            String contactNumber = findContact(i).getNumber();
            System.out.println("Name: " + contactName + "Number: " + contactNumber);
        }
    }

    public int getSize(){
        return this.contacts.size();
    }

    public void addContact(String name, String number){
        Contact contact = new Contact(name,number);
        this.contacts.add(contact);
    }

    private Contact findContact(String name){
        int length = getSize();
        String phoneNum = "333";
        Contact searchContact = new Contact(name, phoneNum);
        boolean exists = false;

        for(int i = 0; i < length; i++){
            Contact currentContact = this.contacts.get(i);
            if (searchContact.name == currentContact.name){
                exists = true;
                break;
            }
        }
        if (exists){
            return searchContact;
        }
        return null;
    }
}