package edu.brown.cs.student.csv;

import java.util.List;

public class creator<T> implements CreatorFromRow<T> {
  // Name              Age   Location
  // ["Charlotte Lee", "20", "Brown University, Providence, RI"]

  @Override
  public T create(List<String> row) throws FactoryFailureException {
    // Create an empty row object to contain your output
    RowObject rowObject = new RowObject(0, 0, row.size());

    // Use a loop to go through each cell in the row
    for (int i = 0; i < row.size(); i++) {
      String[] wordArray = row.get(i).trim().split(" ");
      int words = wordArray.length;
      rowObject.wordCount += words;

      // USe loop to go through each word in wordArray and count the characters
      for (int j = 0; j < wordArray.length; j++) {
        int chars = wordArray[i].length();
        rowObject.charCount += chars;
      }
    }

    return (T) rowObject;
  }
}
