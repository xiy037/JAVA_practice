package objectLessons.example.inheritance.arrayCase;

class Animal {};
class Cat extends Animal{};

public class SmallCat extends Cat {
  public static void main(String[] args) {
    /**
     * 数组的内容的继承，等号右边是存进去的类型，左边是拿出来的类型
     * 所以存进去只能存Cat和它的子类，拿出来的类型是Animal，可以向下转型
     */
    Cat[] cats = new Cat[3];
    Animal[] newArr = (Animal[]) cats; //本质是Cat[]，只能存Cat类，但是输出的时候每一个都以Animal输出
    System.out.println(newArr.getClass().getSimpleName());
    // newArr[0] = new Animal();  //ArrayStoreException
    newArr[1] = new Cat();
    newArr[2] = new SmallCat();
    System.out.println(newArr[2] instanceof Cat); //可以cast就是true

   // Cat cat = newArr[1];
   // Cat cat1 = newArr[2];  //required type: Cat, provided:Animal
    Cat cat2 = (Cat) newArr[2];

    Animal a = new Cat();
    System.out.println(a.getClass().getSimpleName()); //getClass都是找到本质的type，虽然a其实穿了Animal的衣服
  }
}
