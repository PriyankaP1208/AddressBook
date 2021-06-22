package com.bridgelabz;
import java.io.IOException;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);
    static int choice = 1;
    AddressBook addressBook = new AddressBook();

    public static void main(String args[]) throws Exception {
        System.out.println("Welcome to Address Book Program");
        AddressBookMain addressBookMain = new AddressBookMain();
        AddressBookFileIO addressBookFileIO = new AddressBookFileIO();
        AddressBook addressBook = new AddressBook();
        while (choice != 0) {
            System.out.println("\n 1.Add Person\n 2.Edit contact\n 3.Display\n 4.Delete\n" +
                    " 5.Search contacts\n 6.View contacts\n 7.View count\n 8.Sort\n" +
                    " 9.Write data in txt file\n 10.Read data from txt file");
            System.out.println("Enter Your Choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int personCount;
                    System.out.println("Enter Number of persons:");
                    personCount = scanner.nextInt();
                    for(int i = 0; i < personCount; i++)
                    {
                        addressBook.createPerson();
                    }
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
                    addressBookMain.search();
                    break;
                case 6:
                    addressBookMain.view();
                    break;
                case 7:
                    addressBookMain.viewCount();
                    break;
                case 8:
                    addressBookMain.sort();
                    break;
                case 9:
                    addressBookFileIO.writeInfo();
                    break;
                case 10:
                    addressBookFileIO.readData();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public void search() {
        System.out.println("\n 1.Search by name\n 2.Search by city\n 3.Search by state");
        System.out.println("Enter Your Choice");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter name:");
                String name1 = scanner.next();
                addressBook.searchByName(name1);
                break;
            case 2:
                System.out.println("Enter city:");
                String city1 = scanner.next();
                addressBook.searchByCity(city1);
                break;
            case 3:
                System.out.println("Enter state:");
                String state1 = scanner.next();
                addressBook.searchByState(state1);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

    public void view(){
        System.out.println("\n 1.View by city\n 2.View by state");
        System.out.println("Enter Your Choice");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter city:");
                String city = scanner.next();
                addressBook.viewByCity(city);
                break;
            case 2:
                System.out.println("Enter state:");
                String state = scanner.next();
                addressBook.viewByState(state);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

    public void viewCount(){
        System.out.println("\n 1.View count by city\n 2.View count by state");
        System.out.println("Enter Your Choice");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter city:");
                String city = scanner.next();
                addressBook.viewCountByCity(city);
                break;
            case 2:
                System.out.println("Enter state:");
                String state = scanner.next();
                addressBook.viewCountByState(state);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

    public void sort(){
        System.out.println("\n 1.Sort by name\n 2.Sort by city\n 3.Sort by state");
        System.out.println("Enter Your Choice");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addressBook.sortByName();
                break;
            case 2:
                addressBook.sortByCity();
                break;
            case 3:
                addressBook.sortByState();
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
