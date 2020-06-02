package org.review.io;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWriteFile {

    @Test
    public void readFile() {
        File file = new File("my_fic.txt");
        Scanner scanner;
        List<String> lines = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()){
                lines.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(lines);
    }

    @Test
    public void writeFile() {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("my_fic.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
            myWriter.write("as fun enough!\n");
            myWriter.write("Files iais fun enough!\n");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
