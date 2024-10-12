package Exercise_4;

import java.io.FileReader;
import java.io.IOException;

public class DinosaursFromFile {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("Exercise_4/dinosaurs.txt")) {
            int line;

            while ((line = fr.read()) != -1) {
                System.out.print((char) line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
