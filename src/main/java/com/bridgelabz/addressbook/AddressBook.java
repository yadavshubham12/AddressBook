package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {

    Scanner scanner = new Scanner(System.in);

    Contact contacts[] = new Contact[3];
    public void createContact(){
        Contact contact = new Contact();
        System.out.println("Pls enter first name");
        String firstName = scanner.next();
        contact.setFirstName(firstName);
        System.out.println("Pls enter last name");
        String lastName = scanner.next();
        contact.setLastName(lastName);
        System.out.println("Pls enter city");
        String city = scanner.next();
        contact.setCity(city);
        System.out.println("Pls enter address");
        String address = scanner.next();
        contact.setAddress(address);
        System.out.println("Pls enter state");
        String state = scanner.next();
        contact.setState(state);
        System.out.println("Pls enter zip");
        int zip = scanner.nextInt();
        contact.setZip(zip);
        System.out.println("Pls enter phone number");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNum(phoneNumber);
        System.out.println("Pls enter email");
        String email = scanner.next();
        contact.setEmail(email);
        System.out.println(contact);
        return Contact;
    }
    public void addContact(){
        Contact newContact = createContact();
        boolean isNullPlace = false;
        for (int i = 0; i < contacts.length; i++){
            if (contacts[i].equals(null)){
                contacts[i] = newContact;
                isNullPlace = true;

            }
        }
        if (isNullPlace == false){
            System.out.println("Address book is already full");
        }
        else {
            System.out.println("Contact added successfully");
        }
    }
}
