package com.bridgelabz;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String args[]){
        System.out.println("Welcome to Address Book Program");
        int choice=1;
        AddressBook addressBook = new AddressBook();
        Scanner s=new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1.Add Person\n ");
            System.out.println("Enter Your Choice");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    addressBook.createPerson();
                    break;
            }
        }
    }
}
