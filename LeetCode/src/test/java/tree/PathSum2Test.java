package tree;

import main.tree.PathSum2;
import main.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PathSum2Test {

    @Test
    void pathSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        assertEquals(1, new PathSum2().pathSum(root, 9).size());
    }
}