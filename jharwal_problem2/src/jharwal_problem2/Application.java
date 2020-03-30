package jharwal_problem2;

//Declare class called Application
public class Application
{
//main method
public static void main(String[] args)
{
//define the string variable and store the input file name
String input_file = "problem2.txt";
//define the string variable and store the output file name
String output_file = "unique_word_counts.txt";
//Create object for the class DuplicateCounter
DuplicateCounter DupCouObj = new DuplicateCounter();
//call the count method using the class object
DupCouObj.count(input_file);
//call the write method using the class object
DupCouObj.write(output_file);
}
}
