package findthemissingletter;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    public static void main(String[] args) {
        SolutionTest test = new SolutionTest();
        test.exampleTests();
    }

    private void exampleTests() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
