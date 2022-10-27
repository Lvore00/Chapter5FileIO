package Chapter5FileIO.Exercise3;

/*Name: Lillian Vore
Date: 10/25/2022
Class: Intermediate Prog.
Instructions: Using the Poem class given in exercise 2,
        write a Java program to read from a text file named poem2.txt provided below.
        The program shall read the name and poet of each poem, create an object of type Poem for each
        name/poet pair and print all the read poem in for to the console.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoemReader {
    public static void main(String[] args) {
        try {
            try (Scanner sc = new Scanner(new File("src/Chapter5FileIO/Exercise3/poems2.txt"));) {
                while (sc.hasNextLine()) {
                    String data = sc.nextLine();
                    System.out.println(data);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("error " + e);
        }
    }
}
