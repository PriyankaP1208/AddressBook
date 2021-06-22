package com.bridgelabz;

import java.io.*;
import java.util.Scanner;

public class AddressBookFileIO {

    Scanner sc = new Scanner(System.in);

    public void writeInfo() throws IOException
    {
        String fName, lName, address, city, state, zip, phNo, mailId;
        File f1 = new File("contacts.txt");
        FileWriter fr = new FileWriter(f1, true);
        BufferedWriter br = new BufferedWriter(fr);
        PrintWriter pw = new PrintWriter(br);
        System.out.println("\nEnter First Name");
        fName = sc.nextLine();
        sc.nextLine();
        System.out.println("\nEnter Last Name");
        lName = sc.nextLine();
        System.out.println("\nEnter Address");
        address = sc.nextLine();
        System.out.println("\nEnter City");
        city = sc.nextLine();
        System.out.println("\nEnter state");
        state = sc.nextLine();
        System.out.println("\nEnter zip code");
        zip = sc.nextLine();
        System.out.println("\nEnter phone number");
        phNo = sc.nextLine();
        System.out.println("\nEnter mail id");
        mailId = sc.nextLine();
        pw.println(fName + " " + lName + " " + address + " " + city + " " + state + " " + zip + " " + phNo + " " + mailId + " ");
        System.out.println("Added successfully");
        pw.flush();
    }

    public void readData() throws IOException {
        int ch;
        FileReader fr=null;
        try
        {
            fr = new FileReader("contacts.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
        fr.close();
    }

}
