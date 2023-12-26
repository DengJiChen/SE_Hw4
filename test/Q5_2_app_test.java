import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Q5_2_app_test {

    @Test
    public void testGradeA() {
        char result = Q5App.letterGrade(100);
        assertEquals('A', result);
        char result2 = Q5App.letterGrade(90);
        assertEquals('A', result2);
    }

    @Test
    public void testGradeB() {
        char result = Q5App.letterGrade(89);
        assertEquals('B', result);
        char result2 = Q5App.letterGrade(80);
        assertEquals('B', result2);
    }

    @Test
    public void testGradeC() {
        char result = Q5App.letterGrade(79);
        assertEquals('C', result);
        char result2 = Q5App.letterGrade(70);
        assertEquals('C', result2);
    }

    @Test
    public void testGradeD() {
        char result = Q5App.letterGrade(69);
        assertEquals('D', result);
        char result2 = Q5App.letterGrade(60);
        assertEquals('D', result2);
    }

    @Test
    public void testGradeF() {
        char result = Q5App.letterGrade(59);
        assertEquals('F', result);
        char result2 = Q5App.letterGrade(0);
        assertEquals('F', result2);
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
