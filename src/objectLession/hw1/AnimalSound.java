package objectLession.hw1;

class Animal {
  protected int age;
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

  public void tigerMeow() {
    super.catMeow();
  }
}

public class AnimalSound {
  public static void main(String[] args) {
    Tiger aTiger = new Tiger();
    aTiger.tigerMeow();
    System.out.println("So do tigers!");
  }
}