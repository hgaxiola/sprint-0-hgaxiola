package edu.brown.cs.student.csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class csvParser<T> {

  public List<T> parser(Reader reader, CreatorFromRow<T> creator)
      throws IOException, FactoryFailureException {
    // create an empty list

    List<T> outputList = new ArrayList<T>();
    {
      BufferedReader buffRead = new BufferedReader(reader);

      String lineRead = buffRead.readLine();
      lineRead = buffRead.readLine();

      while (lineRead != null) {
        outputList.add(creator.create(Arrays.asList(lineRead.split(",", -1))));
      }
    }
    return outputList;
  }
}
