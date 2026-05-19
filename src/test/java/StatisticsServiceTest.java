import org.example.StatisticsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    @Test
    void findMaxWhenMaxIsInMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 12, 8, 4, 5, 3, 8, 6, 11, 11, 10};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 10};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
