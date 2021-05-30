package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class AddressBook {
    public static ArrayList<Contact> contact = new ArrayList<>();
    // ArrayList<Contact> contact = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //Create new person in AddressBook
    public void createPerson()
    {
        boolean status;
        Contact contact1 = new Contact();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter first name:");
        String firstName = sc.nextLine();
        status=checkDuplicates(firstName, contact); //Checking Duplicates
        if (!status)
        {
            contact1.firstName = firstName;
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
        else {
            System.out.println("User already present");
            createPerson();
        }
    }

    //Display all data in AddressBook
    public void display()
    {
        for(Contact c : contact)
        {
            System.out.println(c);
        }
    }

    //Update person contact in AddressBook
    public void updatePerson(String name,String u)
    {
        int flag = 0;
        for(Contact c : contact)
        {
            if(c.firstName.equals(name))
            {
                flag = 1;
                switch (u)
                {
                    case "address":
                        System.out.println("Enter Your address");
                        c.address = sc.nextLine();
                        break;
                    case "city":
                        System.out.println("Enter Your city Name");
                        c.city = sc.nextLine();
                        break;
                    case "state":
                        System.out.println("Enter Your state Name");
                        c.state = sc.nextLine();
                        break;
                    case "phone":
                        System.out.println("Enter Your phone Number");
                        c.phoneNo = sc.nextLine();
                        break;
                    case "zip":
                        System.out.println("Enter Your zip");
                        c.zip = sc.nextInt();
                        break;
                }
            }
        }
        if(flag == 0)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("Update Successfully");
        }
    }

    //Update person contact in AddressBook
    public void deletePerson(String name)
    {
        int flag = 0;
        Iterator<Contact> itr=contact.iterator();
        while(itr.hasNext())
        {
            Contact a = itr.next();
            if(a.firstName.equals(name))
            {
                flag = 1;
                itr.remove();
            }
        }
        if(flag == 0)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("Delete Successfully");
        }
    }

    //Checking duplicate entries
    public boolean checkDuplicates(String name, ArrayList<Contact> personList)
    {
        for (Contact cn : personList) {
            if (cn.getFirstName().equals(name)) {
                //System.out.println("Person Already Present");
                return true;
            }
        }
        return false;
    }

    //Search by name
    public void searchByName(String name)
    {
        for (Contact cn : contact)
        {
            if(name.equals(cn.firstName))
            {
                System.out.println(cn.toString());
            }
        }
    }

    //Search by city
    public void searchByCity(String city1)
    {
        for (Contact cn : contact)
        {
            if(city1.equals(cn.city))
            {
                System.out.println("Name is:" + cn.firstName);
            }
        }
    }

    public void viewByState(String state1)
    {
        for (Contact cn : contact)
        {
            if(state1.equals(cn.state))
            {
                System.out.println(cn.toString());
            }
        }
    }
}



