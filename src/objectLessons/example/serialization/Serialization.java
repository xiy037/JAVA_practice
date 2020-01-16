package objectLessons.example.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
  public static void main(String[] args) {
    Student alex = new Student("Alex", 16);
    try {
      FileOutputStream fileOut = new FileOutputStream("../studentInfo.txt");
      ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
      objOut.writeObject(alex);
      objOut.close();
      fileOut.close();
      System.out.println("Object has been serialized in studentInfo.txt");
    } catch (FileNotFoundException e) {
      System.out.println("File not found Error: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO Error: " + e.getMessage());
    }

  }
}
