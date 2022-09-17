package edu.brown.cs.student.csv;

public class RowObject {
  // field to store word count, character count, column count
  public int wordCount = 0;
  public int charCount = 0;
  public int columnCount = 0;

  public RowObject(int w, int c, int col) {
    this.wordCount = w;
    this.charCount = c;
    this.columnCount = col;
  }
}
