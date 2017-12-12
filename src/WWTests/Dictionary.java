package WWTests;

import java.io.File;

/**
 * Created by moe on 12/9/2017.
 */

// General Scripting/Logic
// Answer for question 3a

public class Dictionary {

    public static void main(String[] args) {

        doesFileExist("C:\\Users\\moe\\Desktop\\WWTest.txt");

    }

    public static boolean doesFileExist(String path){

        try {

            File file = new File(path);
            boolean exists = file.exists();

            if (file.exists() && file.isFile()) {
                System.out.println("File does exist");
                return true;
            } else {
                System.out.println("File does not exist");
                return false;
            }
        } catch(Exception e) {
            System.out.println("Unable to access/read file");
            return false;
        }


    }
}