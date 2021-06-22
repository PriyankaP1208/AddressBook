package com.bridgelabz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

public class AddressBookCSVFile {
    public void writeData() {
        String line = "";
        String splitBy = ",";
        Scanner scanner = new Scanner(System.in);
        File file = new File("contact.csv");
        try
        {
            FileWriter fileWriter = new FileWriter(file);
            CSVWriter csvWriter = new CSVWriter(new FileWriter(file));
            List<String[]> list = new ArrayList<String[]>();
            System.out.println("Enter data:");
            for(int i = 0; i<8; i++)
            {
                String row = scanner.nextLine();
                String[] rowData = row.split(" ");
                list.add(rowData);
            }
            csvWriter.writeAll(list);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        try(Reader reader = Files.newBufferedReader(Paths.get("Contact.csv"));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build())
        {
            String[] records;
            while ((records = csvReader.readNext()) != null)
            {
                System.out.println("First name:" + records[0]);
                System.out.println("Last name:" + records[1]);
                System.out.println("Address:" + records[2]);
                System.out.println("City:" + records[3]);
                System.out.println("State:" + records[4]);
                System.out.println("mob no:" + records[5]);
                System.out.println("Mail id:" + records[6]);
                System.out.println("Zip:" + records[7]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
