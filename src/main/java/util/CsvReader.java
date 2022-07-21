package util;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static void read(String[]args) throws IOException, CsvValidationException {
        File f = new File("Wine.csv");
        CSVReader reader = new CSVReader(new BufferedReader(new FileReader(f)));
        String[] headers = reader.readNext(); //Read Headers first.
        String[] s;
        //System.out.print(Arrays.toString(headers));
        System.out.println();
        while ((s = reader.readNext()) != null) {
            for (String i : s) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
