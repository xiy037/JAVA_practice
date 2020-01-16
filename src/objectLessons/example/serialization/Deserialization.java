package objectLessons.example.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
  public static void main(String[] args) {
    try {
      FileInputStream fileIn = new FileInputStream("../studentInfo.txt");
      ObjectInputStream objIn = new ObjectInputStream(fileIn);
      Student s = (Student)objIn.readObject();
      objIn.close();
      fileIn.close();
      System.out.println(s.getName() + " is " + s.getAge());
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found Error:" + e.getMessage());
    } catch (IOException e) {
      System.out.println("IOException Error:" + e.getMessage());
    } catch (ClassNotFoundException e) {
      System.out.println("Class Not Found Error" + e.getMessage());
    }
  }
}
