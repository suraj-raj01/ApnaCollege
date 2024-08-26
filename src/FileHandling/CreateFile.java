package FileHandling;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("./src/FileHandling/filename.txt");
            File myObj1 = new File("./src/FileHandling/filename1.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }
            else if(myObj1.createNewFile()){
                System.out.println("File created: "+myObj1.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}