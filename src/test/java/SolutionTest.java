import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void setup() {
        this.solution = new Solution();
    }

    @Test
    public void example_1() {
        // Given
        String[] x = {"flower","flo","flight"};

        // When
        String response = solution.longestCommonPrefix(x);

        // Then
        assertEquals( "fl", response);
    }

    @Test
    public void example_2() {
        // Given
        String[] x = {"dog","racecar","car"};

        // When
        String response = solution.longestCommonPrefix(x);

        // Then
        assertEquals(response, "");
    }

    @Test
    public void example_3() {
        // Given
        String[] x = {"cir","car"};

        // When
        String response = solution.longestCommonPrefix(x);

        // Then
        assertEquals("c", response);
    }

    @Test
    public void example_4() {
        // Given
        String[] x = {"caa","","a","acb"};

        // When
        String response = solution.longestCommonPrefix(x);

        // Then
        assertEquals(response, "");
    }
    
    @Test
    public void example_5() {
        // Given
        String[] x = {"ca","c","bba","bacb","bcb"};

        // When
        String response = solution.longestCommonPrefix(x);

        // Then
        assertEquals(response, "");
    }
}