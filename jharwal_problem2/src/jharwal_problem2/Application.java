package jharwal_problem2;

import java.io.IOException;

public class Application {

	   public static void main(String[] args) {

	       String dataFile = "problem2.txt";
	       String outputFile = "unique_word_counts.txt";

	       DuplicateCounter duplicateCounter = new DuplicateCounter();

	       try {
	           duplicateCounter.count(dataFile);
	       } catch (IOException e) {
	           e.printStackTrace();
	       }

	       try {
	           duplicateCounter.write(outputFile);
	       } catch (IOException e) {
	           e.printStackTrace();
	       }

	   }

	}