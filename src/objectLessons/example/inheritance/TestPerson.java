package objectLessons.example.inheritance;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPerson {
  @Test
  public void shouldReturnEmployeeName() {
    Person he = new Employee("Alex");
    assertEquals("This employee's name is Alex", he.getDescription());
  }
}
