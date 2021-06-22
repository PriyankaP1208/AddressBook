package com.bridgelabz;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import static com.bridgelabz.AddressBook.contact;

public class AddressBookJSON {
    public void writeData() throws IOException {
        Path path = Paths.get("contact.json");
        Gson gson = new Gson();
        String json = gson.toJson(contact);
        FileWriter writer = new FileWriter(String.valueOf(path));
        writer.write(json);
        writer.close();
    }

    public void readData() throws IOException {
        ArrayList<Contact> list;
        Path path = Paths.get("contact.json");
        try(Reader reader = Files.newBufferedReader(path)) {
            Gson gson = new Gson();
            list = new ArrayList<>(Arrays.asList(gson.fromJson(reader, Contact[].class)));
            for(Contact contact : list)
            {
                System.out.println("First name:" + contact.getFirstName());
                System.out.println("Last name:" + contact.getLastName());
                System.out.println("Address:" + contact.getAddress());
                System.out.println("City:" + contact.getCity());
                System.out.println("State:" + contact.getState());
                System.out.println("Contact no:" + contact.getPhoneNo());
                System.out.println("Mail Id:" + contact.getMailId());
                System.out.println("Zip code:" + contact.getZip());
            }
        }
    }
}
