package exercise1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileException {
    public static void main(String[] args) {
        // File does not exist should throw error.
        try (FileReader reader = new FileReader("input.txt")) {
            //Attempt to work with file.
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist, please give a valid file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
