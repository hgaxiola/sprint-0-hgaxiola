package edu.brown.cs.student.csv;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileAdder {
  int words;
  int characters;
  int rows;
  int columns;

  public FileAdder(String filepath) throws IOException, FactoryFailureException {
    System.out.println("Main to FileAdder");
    // Turn the filepath into a Reader object
    FileReader fileRead = new FileReader(filepath);
    creator rowC = new creator();
    csvParser csparser = new csvParser();
    // Creates
    List<RowObject> parsedResult = csparser.parser(fileRead, rowC);
    // Initialize words, characters, columns counter as zero. The number of rows should be evident
    // from the size of the list.
    this.rows = parsedResult.size();
    this.words = 0;
    this.characters = 0;
    this.columns = 0;
    if (!parsedResult.isEmpty()) {

      System.out.println("This list is not empty");
      System.out.println(parsedResult);
      // The number of columns is the the number of columns in the first row
      this.columns = parsedResult.get(0).columnCount;
      for (RowObject row : parsedResult) {
        this.words += row.wordCount;
        this.characters += row.charCount;
      }
    }
    System.out.println("Words:" + this.words);
    System.out.println("Characters: " + this.characters);
    System.out.println("Columns: " + this.columns);
    System.out.println("Rows: " + this.rows);
  }
}
