package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public void createPerson(){
        ArrayList<Contact> contact = new ArrayList<>();
        Contact contact1 = new Contact();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        contact1.firstName = sc.nextLine();
        System.out.println("Enter last name:");
        contact1.lastName = sc.nextLine();
        System.out.println("Enter address:");
        contact1.address = sc.nextLine();
        System.out.println("Enter city:");
        contact1.city = sc.nextLine();
        System.out.println("Enter state:");
        contact1.state = sc.nextLine();
        System.out.println("Enter phone number:");
        contact1.phoneNo = sc.nextLine();
        System.out.println("Enter email id:");
        contact1.mailId = sc.nextLine();
        System.out.println("Enter zip:");
        contact1.zip = sc.nextInt();
        System.out.println("Added Successfully.");
        contact.add(contact1);
    }
}



