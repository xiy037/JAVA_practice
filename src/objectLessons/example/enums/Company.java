package objectLessons.example.enums;

public enum Company {
  GOOGLE("G"), YAHOO("Y"), EBAY("E"), PAYPAL("P");

  private String companyLetter;

  private Company(String s) {
    companyLetter = s;
  }

  public String getCompanyLetter() {
    return companyLetter;
  }
}
