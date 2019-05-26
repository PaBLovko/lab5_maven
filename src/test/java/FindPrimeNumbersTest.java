import org.hamcrest.CoreMatchers;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.logging.Level;
        import java.util.logging.Logger;

        import static org.junit.Assert.*;

public class FindPrimeNumbersTest {
    private static Logger log = Logger.getLogger(FindPrimeNumbersTest.class.getName());

    @Test
    public void primeNumbersRecursive() throws MyException{
        assertThat("Массив простых чисел",new FindPrimeNumbers(Arrays.asList(50, 11, 3, 4, 42))
                .primeNumbersRecursive(),CoreMatchers.hasItems(3,11));
    }

    @Test
    public void isPrime() {
        assertTrue("Число простое", FindPrimeNumbers.isPrime(11));
    }

    @Test
    public void primeNumberNotRecursive() throws MyException{
        assertThat("Массив простых чисел", new FindPrimeNumbers(Arrays.asList(50, 11, 3, 4, 42))
                .primeNumberNotRecursive(),CoreMatchers.hasItems(3,11));
    }
}
