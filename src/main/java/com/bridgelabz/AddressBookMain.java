package com.bridgelabz;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String args[]){
        System.out.println("Welcome to Address Book Program");
        int choice=1;
        AddressBook addressBook = new AddressBook();
        Scanner scanner=new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1.Add Person\n 2.Edit contact \n 3.Display \n 4.Delete");
            System.out.println("Enter Your Choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBook.createPerson();
                    break;
                case 2:
                    addressBook.Display();
                    System.out.println("Enter name to Update");
                    String name=scanner.next();
                    System.out.println("Enter what to update");
                    String update=scanner.next();
                    addressBook.UpdatePerson(name,update);
                    break;
                case 3:
                    addressBook.Display();
                    break;
                case 4:
                    System.out.println("Enter name to Delete");
                    String n=scanner.next();
                    addressBook.DeletePerson(n);
                    break;

            }

        }
    }
}
