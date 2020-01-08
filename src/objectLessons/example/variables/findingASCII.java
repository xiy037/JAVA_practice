package objectLessons.example.variables;

public class findingASCII {
  public static void main(String[] args) {
    char ch = 'a';
    int chCode = ch;
    char ch2 = 'z';
    int ch2Code = (int)ch2;
    System.out.println(chCode);
    System.out.println(ch2Code);

    int code = 100;
    char toCh = (char)code;
    System.out.println(toCh);
  }
}
