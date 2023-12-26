import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Q5_1_app_test {

    @Test
    public void testGradeA() {
        char result = Q5App.letterGrade(95);
        assertEquals('A', result);
    }

    @Test
    public void testGradeB() {
        char result = Q5App.letterGrade(85);
        assertEquals('B', result);
    }

    @Test
    public void testGradeC() {
        char result = Q5App.letterGrade(75);
        assertEquals('C', result);
    }

    @Test
    public void testGradeD() {
        char result = Q5App.letterGrade(65);
        assertEquals('D', result);
    }

    @Test
    public void testGradeF() {
        char result = Q5App.letterGrade(30);
        assertEquals('F', result);
    }

    @Test
    public void testInvalidScoreX1() {
        char result = Q5App.letterGrade(-1);
        assertEquals('X', result);
    }

    @Test
    public void testInvalidScoreX2() {
        char result = Q5App.letterGrade(101);
        assertEquals('X', result);
    }
}
