package com.company;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClassTest {
  @Test
  public void shouldReturnHelloWorld() {
    ClassName hello = new ClassName();
    assertEquals("Hello World", hello.helloWorld());
  }

  @Test
  public void shouldReturnHelloName() {
    Person peter = new Person("Peter");
    assertEquals("Hello Peter", peter.hello());
  }
}
