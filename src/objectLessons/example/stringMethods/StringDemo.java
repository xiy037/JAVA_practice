package objectLessons.example.stringMethods;

public class StringDemo {
  public static void main(String[] args) {
    //indexOf
    String s = "Have a nice day!";
    System.out.println(s.indexOf("a"));
    int aIndex = s.indexOf("a", 2); //fromIndex是在这个index之后第一次出现str的index
    System.out.println(aIndex);

    //join
    String alex = "Alex";
    String sentence = String.join(" ", s, alex);
    System.out.println(sentence);

    //split
    String[] strArray = s.split("\\s");
    for (String x : strArray) {
      System.out.println(x + "//");
    }

    //length
    int len = s.length();
    System.out.println("length of string s is: " + len);

    //charAt
    char ch = s.charAt(2);
    System.out.println("character at index 2 is: " + ch);

    //startsWith and endsWith
    boolean start = s.startsWith("Have");
    boolean end = s.endsWith("!");
    System.out.println("string starts with Have?: " + start);
    System.out.println("string ends with !?: " + end);

    //subString
    String subStr = s.substring(5, 15);
    System.out.println(subStr);
  }
}
