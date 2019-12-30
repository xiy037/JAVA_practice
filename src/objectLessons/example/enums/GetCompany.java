package objectLessons.example.enums;

public class GetCompany {
  public static void main(String[] args) {
    System.out.println("Get enum value for Comapny 'eBay': "
            + Company.EBAY.getCompanyLetter());
    System.out.println(Company.GOOGLE.toString());
    for (Company x : Company.values()) {
      System.out.println(x + "'s index is " + x.ordinal());
    }
  }
}
