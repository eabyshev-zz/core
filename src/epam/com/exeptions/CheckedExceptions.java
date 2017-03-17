package epam.com.exeptions;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by ermek on 3/12/17.
 */
public class CheckedExceptions {

    static void FileNotFoundException() {
        try {
            // FileNotFoundException
            File file = new File("/home/ermek/Dev/java/core/source/test2.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File is not founded");
            e.printStackTrace();
        }
    }


    static void IOException() {
        try {
            // FileNotFoundException
            File file = new File("/home/ermek/Dev/java/core/source/test3.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader fileInput = new BufferedReader(fileReader);

            // IOException
            System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

