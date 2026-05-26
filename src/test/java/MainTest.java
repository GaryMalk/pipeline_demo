import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void truncateString() {
        String testString = "0123456789";
        String expected =  "0123456";
        String actual = Main.truncateString(testString, 7);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shortString() {
        String testString = "0123";
        String actual = Main.truncateString(testString, 7);
        assertEquals(testString, actual);
    }
}