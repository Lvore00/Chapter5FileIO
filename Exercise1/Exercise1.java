package Chapter5FileIO.Exercise1;

/*Name: Lillian Vore
Date: 10/25/2022
Class: Intermediate Prog.
Instructions: Write a Java program to read in the 10 numbers in the example file Book1.csv
        provided above. The program should sum all the numbers, find the lowest number,
        find the highest number, and computer the average. Upon completion of the processing,
        the program should write a new text file named stats.txt with the information found in
        the following format where xxx represents a number calculated above.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {

    //Confused about the highest num and lowest num

    public static void main(String[] args) throws IOException {

        Scanner inputFile = null;
        double sum = 0;
        int numberCount = 0;

        //Average total:


        try {
            inputFile = new Scanner(new File("Book1.txt"));
            while (inputFile.hasNextDouble())
            {
                numberCount++;
                sum = sum + inputFile.nextDouble();

            }
        } catch (IOException ex) {
            System.out.println("Problem reading the file has occurred");
            ex.printStackTrace();
        } finally {
            inputFile.close();
        }
        double average = sum / numberCount;
        System.out.println("The average of the numbers is: ");
        System.out.println(average);


        // Addition/Sum:

        try {
            inputFile = new Scanner(new File("Book1.txt"));
            int totalSum = 0;

            while (inputFile.hasNextInt()) {
                totalSum += inputFile.nextInt();
            }

            System.out.println(sum);

        } catch (IOException ex) {
            System.out.println("Problem reading the file");
            ex.printStackTrace();
        } finally {
            inputFile.close();
        }

//        double sum = numberCount+totalSum;

        //Highest Num

        try {
            inputFile = new Scanner(new File("Book1.txt"));
            int max = Integer.MIN_VALUE;
            while (inputFile.hasNextInt()) {
                int x = inputFile.nextInt();
                if (x > max) {
                    max = x;

                }
            }
            System.out.println(max);
        } catch (IOException ex) {
            System.out.println("Problem reading the file");
            ex.printStackTrace();
        } finally {
            inputFile.close();
        }




        //Lowest Num


        try {
            inputFile = new Scanner(new File("Book1.txt"));
            int min = Integer.MAX_VALUE;
            while (inputFile.hasNextInt()){
                int y = inputFile.nextInt();
                if(y < min){
                    min = y;
                }
            }
            System.out.println(min);
        }catch(IOException ex){
            System.out.println("Problem reading the file");
            ex.printStackTrace();
        }finally {
            inputFile.close();
        }
     }

    }


