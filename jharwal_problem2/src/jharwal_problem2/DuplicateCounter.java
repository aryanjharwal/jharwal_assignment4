package jharwal_problem2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Create a class DuplicateCounter
public class DuplicateCounter
{
//Create a Map to store the words and count
private Map<String, Integer> wordCounter;
//Create and Initialzie the Scanner object
Scanner sc = null;

//Define the constructor to initialize the map of Strings
public DuplicateCounter()
{
  wordCounter = new HashMap<String,Integer>();
}

//Implement the method count to count how many time of each word occurs
public void count(String dataFile)
{
  //Use try catch block, If the file content is empty
  //then throw and exception
  try
  {
   //Create file object using Scanner object
   sc = new Scanner(new File(dataFile));
  }
  //Display the message, if exception caught
  catch (FileNotFoundException e)
  {
   System.out.println(e.getMessage());
   return;
  }

  //use the delimiting characters digits, spaces
  //punctuation marks to extract the words in the file
  sc.useDelimiter("([0-9]|[.,!?:;'\"-]|\\s)+");
  
  //use while loop to read the data and store in the map
  //along with the count
  while(sc.hasNext())
  {
   //First convert input into Lowercase
   String input_word = sc.next().toLowerCase();
   //Get the count of the word and store in the integer variable
   Integer count_words = wordCounter.get(input_word);
   
   //if result is null, then update count_words is 1
   if(count_words == null)
   {
    count_words = 1;
   }
   //Otherwise increment count_words by 1
   else
   {
    count_words = count_words + 1;
   }
   //Put the word alog with count in the map
   wordCounter.put(input_word, count_words);
  }
  //close the input stream
  sc.close();
}

//Implement the method to write the Map data into the file
public void write(String outputFile )
{
  //use try catch block, if file not found
  //throw an exception
  try
  {
   //create PrintWriter stream with the output in the file
   PrintWriter pw = new PrintWriter(new File(outputFile ));
   //use for-loop to get each value from Map
   //and print in the PrintWriter
   for(String k : wordCounter.keySet())
   {
    pw.println(k + " " + wordCounter.get(k));
   }
   //close the PrintWriter
   pw.close();  
  }
  //Display message if file not found
  catch (FileNotFoundException e)
  {
   System.out.println(e.getMessage());
  }
}}
