package Chapter5FileIO.Exercise2;

/*Name: Lillian Vore
Date: 10/25/2022
Class: Intermediate Prog.
Instructions: Using the class Poem below. Write a complete Java program that creates three
        different objects of type Poem. The program shall then open a text file named poems.txt for writing
        and write the information about each poem to the text file. The program shall NOT write the toString()
        version of the object to the file, but write first the poem name on a line and then the poet name on a
        second line for each poem.*/

import java.io.FileWriter;
import java.io.IOException;

public class PoemWriter {
    public static void main(String[] args) throws IOException {
  
        try (
                FileWriter poems = new FileWriter("src/Chapter5FileIO/Exercise2/poems.txt");) {
            poems.write("We Real Cool" + "\n");
            poems.write("Gwendolyn Brooks" + "\n");
            poems.write("I Know Why the Caged Bird Sings" + "\n");
            poems.write("Maya Angelou" + "\n");
            poems.write("Hope is the Thing with Feathers" + "\n");
            poems.write("Emily Dickinson" + "\n");
            poems.write("The Road Not Taken" + "\n");
            poems.write("Robert Frost" + "\n");
            poems.close();

        }catch(IOException e){
            System.out.println("IOException error!");
        }

    }
}
