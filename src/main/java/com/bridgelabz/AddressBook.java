package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    public static ArrayList<Contact> contact = new ArrayList<>();
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

    //Delete person contact in AddressBook
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
                return true;
            }
        }
        return false;
    }

    //Search by name
    public void searchByName(String name)
    {
        List<Contact> streamList = contact.stream().filter(person1 -> name.equals(person1.getFirstName()) ).collect(Collectors.toList());
        System.out.println("Persons in city: " + streamList);
    }

    //Search by city
    public void searchByCity(String city1)
    {
        List<Contact> streamList = contact.stream().filter(person1 -> city1.equals(person1.getCity()) ).collect(Collectors.toList());
        System.out.println("Persons in city: " + streamList);
    }

    //Search by state
    public void searchByState(String state1)
    {
        List<Contact> streamList = contact.stream().filter(person1 -> state1.equals(person1.getState()) ).collect(Collectors.toList());
        System.out.println("Persons in city: " + streamList);
    }

    //View by city
    public void viewByCity(String city1)
    {
        List<Contact> streamList = contact.stream().filter(person1 -> city1.equals(person1.getCity()) ).collect(Collectors.toList());
        System.out.println("Persons in city: " + streamList);
        Dictionary infoCity = new Hashtable();
        for (Contact cn : contact)
        {
            if(city1.equals(cn.city))
            {
                infoCity.put(cn.getCity(), city1);
            }
        }
        System.out.println("Contacts in address book:" + infoCity);
    }

    //View by state
    public void viewByState(String state1)
    {
        List<Contact> streamList = contact.stream().filter(person1 -> state1.equals(person1.getState()) ).collect(Collectors.toList());
        System.out.println("Persons in city: " + streamList);
        Dictionary infoCity = new Hashtable();
        for (Contact cn : contact)
        {
            if(state1.equals(cn.city))
            {
                infoCity.put(cn.getState(), state1);
            }
        }
        System.out.println("Contact in address book :" + infoCity);
    }

    //Get count by city
    public void viewCountByCity(String city1)
    {
        int cnt= (int) contact.stream().filter(person1 -> city1.equals(person1.getCity()) ).count();
        System.out.println("Total Person Count in " + city1 + " city is:" + cnt);
    }

    //Get count by state
    public void viewCountByState(String state1) {
        int cnt= (int) contact.stream().filter(person1 -> state1.equals(person1.getState()) ).count();
        System.out.println("Total Person Count in " + state1 + " city is:" + cnt);
    }

    //Sort by name
    public void sortByName()
    {
        List<Contact> nameSortedList=contact.stream().sorted((e1,e2)->e1.getFirstName().compareTo(e2.getFirstName())).collect(Collectors.toList());
        System.out.println("Sorted Persons Alphabetically\n: "+nameSortedList);
    }
}



