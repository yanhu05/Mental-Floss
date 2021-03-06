package tree;

import main.tree.ConstructBinaryTreePreorderPostorder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructBinaryTreePreorderPostorderTest {

    @Test
    void constructFromPrePost() {
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] post = {4, 5, 2, 6, 7, 3, 1};

        assertEquals(null, new ConstructBinaryTreePreorderPostorder().constructFromPrePost(pre, post));
    }
}