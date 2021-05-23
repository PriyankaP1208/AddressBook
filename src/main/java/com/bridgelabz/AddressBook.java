package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class AddressBook {
    ArrayList<Contact> contact = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
     void createPerson(){
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
        System.out.println(contact);
    }
    public void Display(){
        for(Contact c : contact){
            System.out.println(c);
        }
    }
    public void UpdatePerson(String name,String u)
    {
        int flag=0;
        for(Contact c : contact)
        {
            if(c.firstName.equals(name))
            {
                flag=1;
                switch (u)
                {
                    case "address":
                        System.out.println("Enter Your address");
                        c.address=sc.nextLine();
                        break;
                    case "city":
                        System.out.println("Enter Your city Name");
                        c.city=sc.nextLine();
                        break;
                    case "state":
                        System.out.println("Enter Your state Name");
                        c.state=sc.nextLine();
                        break;
                    case "phone":
                        System.out.println("Enter Your phone Number");
                        c.phoneNo=sc.nextLine();
                        break;
                    case "zip":
                        System.out.println("Enter Your zip");
                        c.zip=sc.nextInt();
                        break;

                }
            }
        }
        if(flag==0)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("Update Successfully");
        }
    }
    public void DeletePerson(String name)
    {
        int flag=0;
        Iterator<Contact> itr=contact.iterator();
        while(itr.hasNext())
        {
            Contact a=itr.next();
            if(a.firstName.equals(name))
            {
                flag=1;
                itr.remove();
            }
        }
        if(flag==0)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("Delete Successfully");
        }
    }
}



