package objectLession.hw1;

class Animal {
  private int age;
  protected int weight;

  public Animal(int x, int y) {
    this.age = x;
    this.weight = y;
  }

  public Animal() {
    /*
    empty on purpose
    */
  }

  public int getAge() {
    return age;
  }

  public void setAge(int x) {
    this.age = x;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int y) {
    this.weight = y;
  }
}

class Cat extends Animal {
  public Cat(int x, int y) {
    super(x, y);
  }
  public Cat() {
    super();
  }

  public void catMeow() {
    System.out.println("Cats can meow!");
  }
}

class Tiger extends Cat {
  public Tiger() {
    super();
  }
  public Tiger(int x, int y) {
    super(x, y);
  }

  public void tigerMeow() {
    super.catMeow();
  }
}

public class AnimalSound {
  public static void main(String[] args) {
    Tiger aTiger = new Tiger();
    aTiger.tigerMeow();
    System.out.println("So do tigers!");
    Tiger bTiger = new Tiger(3, 50);
    String result = "b tiger is " + bTiger.getAge() + " years old. He weights " + bTiger.getWeight() + "lbs";
    System.out.println(result);
    bTiger.setAge(6);
    bTiger.setWeight(70);
    String newResult = "After 3 years, b tiger will be " + bTiger.getAge() + " years old,"
            + " and will grow to " + bTiger.weight + "lbs";
    System.out.println(newResult);
  }
}