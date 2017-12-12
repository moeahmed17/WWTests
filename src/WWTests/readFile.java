package WWTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by moe on 12/11/2017.
 */

// General Scripting/Logic
// Answer for question 3b

public class readFile {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\moe\\Desktop\\WWTest.txt");
        try (FileInputStream fileDoc = new FileInputStream(file)) {
            int content;
            while ((content = fileDoc.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
