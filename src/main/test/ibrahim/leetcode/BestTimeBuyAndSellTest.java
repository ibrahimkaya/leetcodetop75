package ibrahim.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ibrahim
 * @create 10.09.2022 11:33
 */
class BestTimeBuyAndSellTest {

    BestTimeBuyAndSell tested;

    @BeforeEach
    void setUp() {
        tested = new BestTimeBuyAndSell();
    }

    @Test
    void maxProfit_UnOrderedArray_ReturnFive() {
        //given
        int[] prices = new int[]{7,1,5,3,6,4};
        int actual = 5;

        //when
        int result = tested.maxProfit(prices);

        //then
        assertEquals(result, actual);
    }

    @Test
    void maxProfit_LengthOneArray_ReturnZero() {
        //given
        int[] prices = new int[]{1};
        int actual = 0;

        //when
        int result = tested.maxProfit(prices);

        //then
        assertEquals(result, actual);
    }

    @Test
    void maxProfit_LengthThreeArray_ReturnTwo() {
        //given
        int[] prices = new int[]{1,2,3};
        int actual = 2;

        //when
        int result = tested.maxProfit(prices);

        //then
        assertEquals(result, actual);
    }
}