package findthemissingletter;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    public static void main(String[] args) {
        SolutionTest test = new SolutionTest();
        test.exampleTests();
    }

    public void exampleTests() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
