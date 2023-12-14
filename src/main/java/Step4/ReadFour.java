package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.
            try{
                String fileName = "/Users/gowri/Projects/FileIOJava/src/main/java/Step4/input.txt";
                Scanner fileIn = new Scanner(new File(fileName));
                int runningTotal = 0;
                while (fileIn.hasNext())
                {
                    // Reads the entire line
                    String lineIn = fileIn.nextLine();
                    //Split the line into array of String
                    String[] input = lineIn.split(",");
                    for (int i = 0; i < input.length; i ++) {
                        runningTotal += Integer.parseInt(input[i]);
                        System.out.println("RunningTotal :" + runningTotal);
                    }

                }
            }

            catch (IOException e) {
                System.out.println("File not found");
            }
        }
}