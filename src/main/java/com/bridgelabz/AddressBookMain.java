package com.bridgelabz;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String args[]){
        System.out.println("Welcome to Address Book Program");
        int choice = 1;
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("\n 1.Add Person\n 2.Edit contact \n 3.Display \n 4.Delete  \n" +
                    " 5.Add multiple contacts \n 6.Search by name \n 7.Search by city \n" +
                    " 8.View by city \n 9.View by state");
            System.out.println("Enter Your Choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBook.createPerson();
                    break;
                case 2:
                    addressBook.display();
                    System.out.println("Enter name to Update");
                    String name = scanner.next();
                    System.out.println("Enter what to update");
                    String update = scanner.next();
                    addressBook.updatePerson(name,update);
                    break;
                case 3:
                    addressBook.display();
                    break;
                case 4:
                    System.out.println("Enter name to Delete");
                    String n = scanner.next();
                    addressBook.deletePerson(n);
                    break;
                case 5:
                    int personCount;
                    System.out.println("Enter Number of persons:");
                    personCount = scanner.nextInt();
                    for(int i = 0; i < personCount; i++)
                    {
                        addressBook.createPerson();
                    }
                    break;
                case 6:
                    System.out.println("Enter name:");
                    String name1 = scanner.next();
                    addressBook.searchByName(name1);
                    break;
                case 7:
                    System.out.println("Enter city:");
                    String city1 = scanner.next();
                    addressBook.searchByCity(city1);
                    break;
                case 8:
                    System.out.println("Enter city:");
                    String city = scanner.next();
                    addressBook.viewByCity(city);
                    break;
                case 9:
                    System.out.println("Enter state:");
                    String state1 = scanner.next();
                    addressBook.viewByCity(state1);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
