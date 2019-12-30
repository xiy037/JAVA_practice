package objectLessons.example.inheritance;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPerson {
  @Test
  public void shouldReturnEmployeeName() {
    Person he = new Employee("Alex", 10000);
    assertEquals("This employee's name is Alex and his salary is 10000 rmb", he.getDescription());
  }
}
