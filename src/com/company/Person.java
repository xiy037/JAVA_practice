package com.company;

public class Person {
  private String name;
  public Person(String x) {
    this.name = x;
  }
  public Person() {
    /*
    empty on purpose--表明不传参数的时候用这个constructor，可以是空的。事实上default constructor就是这样。
    */
  }
  public String hello() {
    return "Hello " + this.name;
  }
}
