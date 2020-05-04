package objectLessons.hw2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//用localDate类及其方法打印一个当月日期的日历
public class Calendar {
  public static long calculateDateDifference(LocalDateTime start, LocalDateTime end) {
    long dayDiff = Duration.between(start, end).toDays();
    return dayDiff;
  }

  public static long calculateHourDifference(LocalDateTime start, LocalDateTime end) {
    return Duration.between(start, end).toHours();
  }

  public static int calculateCalendarDaysDiff(LocalDateTime start, LocalDateTime end) {
    long hours = calculateHourDifference(start, end);
    int roundedDays = (int)Math.ceil((double) hours / 24);
    return roundedDays;
  }

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

    LocalDateTime start = LocalDateTime.of(2020, 5, 2, 10, 0);
    LocalDateTime end = LocalDateTime.of(2020, 5, 3, 10, 0);
    System.out.println(calculateDateDifference(start, end));
    System.out.println(calculateCalendarDaysDiff(start, end));
    System.out.println(calculateHourDifference(start, end));
    System.out.println(end.isBefore(start));
  }
}
