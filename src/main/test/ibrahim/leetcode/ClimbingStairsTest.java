package ibrahim.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author ibrahim
 * @create 14.09.2022 19:54
 */
class ClimbingStairsTest {

    ClimbingStairs tested;

    @BeforeEach
    void setUp() {
        tested = new ClimbingStairs();
    }

    @Test
    void climbStairs_SimpleN() {
        //given
        int n1 = 2;
        int actual1 = 2;

        int n2 = 3;
        int actual2 = 3;

        int n42 = 42;
        int actual42 = 433494437;

        //when
        int result1 = tested.climbStairs(n1);
        int result2 = tested.climbStairs(n2);
        int result42 = tested.climbStairs(n42);

        //then
        assertEquals(result1, actual1);
        assertEquals(result2, actual2);
        assertEquals(result42, actual42);
    }
}