package takeatenminutewalk;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    public static void main(String[] args) {
        ExampleTest test = new ExampleTest();
        test.Test();
    }

    private void Test() {
        assertEquals(true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}), "Should return true");
        assertEquals(false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}), "Should return false");
        assertEquals(false, TenMinWalk.isValid(new char[] {'w'}), "Should return false");
        assertEquals(false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}), "Should return false");
    }
}
