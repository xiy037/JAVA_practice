package objectLessons.example.StreamDemo;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;

public class StreamAndOptional {
  @Test
  public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
    String name = "baeldung";
    Optional<String> opt = Optional.of(name);
    assertTrue(opt.isPresent());
  }

  public static void main(String[] args) {
    Supplier<String> echo = () -> "Echo";
    try (Stream<String> infiniteEchos = Stream.generate(echo))
    {
      infiniteEchos.skip(10000).findFirst().ifPresent(System.out::println);
    }
    
  }
}


