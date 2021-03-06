package dp;

import main.dp.LongestIncreasingSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestIncreasingSubsequenceTest {

    @Test
    void lengthOfLIS() {
        int[] nums = {10,9,2,5,3,7,101,18};
        assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(nums));
        nums = new int[0];
        assertEquals(0, new LongestIncreasingSubsequence().lengthOfLIS(nums));
    }
}