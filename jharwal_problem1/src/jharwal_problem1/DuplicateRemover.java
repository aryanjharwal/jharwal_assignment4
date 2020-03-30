package jharwal_problem1;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    Set<String> uniqueWords;
    void remove(String dataFile) //method to eliminate duplicate words from the file
    {
        Scanner input=null;
        try {
            uniqueWords = new LinkedHashSet<>(); //Set to store strings from the file
            input = new Scanner(new File(dataFile)); //Scanner object to read file
            while(input.hasNextLine()) //reading file
            {
                String line=input.nextLine(); //reading a line from the file
                String[] words=line.split(" "); //splitting words by space
                for(int i=0;i<words.length;i++) {
                    String str=words[i].toLowerCase(); //converting into lower case
                    uniqueWords.add(str); //addin into set
                }
            }

        }
        catch(Exception e) //if we encounter any exception while opening file
        {
            System.out.println("Error while opening file: "+dataFile);
        }
        if(input!=null)
            input.close();


    }
    void write(String outputFile) //method to write uniqueWords to output file
    {
        FileWriter output=null;
        try {
            output = new FileWriter(outputFile); //opening file
            for(String s:uniqueWords) //iterating through uniqueWords set
                output.write(s+"\n"); //writing words to the output file
            output.close(); //closing output file
        }
        catch(Exception e) //if we encounter any exception while writing
        {
            System.out.println("Error while writing to file: "+outputFile);
        }

    }

}


