import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 50)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    /* TODO: Write a test case for the method you wrote in IntroLab.
     *       If done properly, you should be able to run IntroLabTest and see
     *       the test results.
     * As a reference, we've included testExampleStudent above.
     */
    @Test(timeout = 20)
    public void testCharlesCheung22() {
        String expected = "Bonjour! My name is cheu1570! I like cats more " +
                "than dogs! Good morning churchill, it is now time for " +
                "your morning announcements";
        String actual = IntroLab.charlesCheung22();
        assertEquals(expected, actual);
    }
}
