package objectLessons.example.stringMethods;

public class StringDemo {
  public static void main(String[] args) {
    //indexOf
    String s = "Have a nice day!";
    System.out.println(s.indexOf("a"));
    int aIndex = s.indexOf("a", 2); //fromIndex是在这个index之后第一次出现str的index, 包括fromIndex
    System.out.println(aIndex);

    //join
    String alex = "Alex";
    String john = "John";
    String sentence = String.join("~ ", s, alex, john);
    System.out.println(sentence);

    //split
    String[] strArray = s.split("\\s", 2); //limit表示regex检查的次数小于limit，这里2，那么就split一次
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
    boolean start = s.startsWith("a");
    boolean end = s.endsWith("!");
    System.out.println("string starts with Have?: " + start);
    System.out.println("string ends with !?: " + end);

    //subString
    String subStr = s.substring(1, 15);
    System.out.println(subStr);

    //toUpperCase
    String word = "awesome";
    String upperWord = word.substring(0, 1).toUpperCase().concat(word.substring(1));
    System.out.println(upperWord);
  }
}
