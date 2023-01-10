package com.bridgelabz.addressbook;

import java.util.Scanner;

public class Address_Book {
    Scanner scanner = new Scanner(System.in);

    Contacts contacts[] = new Contacts[3];
    private Contacts createContact(){
        Contacts contact = new Contacts();
        System.out.println("Enter the first name");
        String firstName = scanner.next();
        contact.setFirstName(firstName);
        System.out.println("Enter the last name");
        String lastName = scanner.next();
        contact.setLastName(lastName);
        System.out.println("Enter the address");
        String address = scanner.next();
        contact.setAddress(address);
        System.out.println("Enter the state");
        String state = scanner.next();
        contact.setState(state);
        System.out.println("Enter the phone number");
        long PhNo = scanner.nextLong();
        contact.setPhoneNum(PhNo);
        System.out.println("Enter the City ");
        String city = scanner.next();
        contact.setCity(city);
        System.out.println("Enter the email ");
        String email = scanner.next();
        contact.setEmail(email);
        return contact;

    }
    public void addContact(){
        for (int i = 0; i < contacts.length; i++){
            System.out.println(contacts[i]);
        }
        Contacts newContact = createContact();
        boolean isNullPlace = false;
        for (int i = 0; i < contacts.length; i++){
            if (contacts[i] == (null)){
                contacts[i] = newContact;
                isNullPlace = true;
            }
        }
        if (isNullPlace == false){
            System.out.println("Addressbook is already full");
        }else {
            System.out.println("Contact added successfully");
        }
    }
}
