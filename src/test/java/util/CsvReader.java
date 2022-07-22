package util;

import java.io.*;
import java.util.Scanner;

public class CsvReader {
    public static String readCsvFile()   {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("./src/test/resources/searchWord.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return sc.next();
    }
}


