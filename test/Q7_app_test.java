import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(Parameterized.class)
public class Q7_app_test {
    private int inputScore;
    private char expectedGrade;

    public Q7_app_test(int inputScore, char expectedGrade) {
        this.inputScore = inputScore;
        this.expectedGrade = expectedGrade;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

                {100, 'A'},
                {95, 'A'},
                {90, 'A'},
                {89, 'B'},
                {85, 'B'},
                {80, 'B'},
                {79, 'C'},
                {75, 'C'},
                {70, 'C'},
                {69, 'D'},
                {65, 'D'},
                {60, 'D'},
                {59, 'F'},
                {30, 'F'},
                {0,  'F'},
                {-1, 'X'},
                {101, 'X'}
        });
    }

    @Test
    public void testAllGrades() {
        String input = inputScore + "\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Q5App.main(new String[0]);

        String actualOutput = outputStream.toString().trim();
        String expect = "Enter the score = The grade of " + inputScore + " is " + expectedGrade;
        assertEquals(expect, actualOutput);

        // Reset System.in and System.out back to the original streams
        System.setIn(System.in);
        System.setOut(System.out);
    }
    @Test
    public void inValidGrades() {
        String input = "ABC\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Q5App.main(new String[0]);

        String actualOutput = outputStream.toString().trim();
        String expect = "Enter the score = Not an integer!";
        assertEquals(expect, actualOutput);

        // Reset System.in and System.out back to the original streams
        System.setIn(System.in);
        System.setOut(System.out);
    }

//    @Test
//    public void testIOException() throws IOException{
//        // Mock InputStream to throw an IOException when read is called
//        InputStream mockInputStream = mock(InputStream.class);
//        when(mockInputStream.read()).thenThrow(new IOException("Simulated IOException"));
//
//        // Redirect System.in to use the mock InputStream
//        System.setIn(mockInputStream);
//
//        // Your test logic
//        assertThrows(IOException.class, () -> {
//            Q5App.main(new String[0]);
//        });
//
//        // Reset System.in back to the original stream
//        System.setIn(System.in);
//    }
}
