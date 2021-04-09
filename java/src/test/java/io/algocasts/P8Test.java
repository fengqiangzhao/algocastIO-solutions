package io.algocasts;

import io.algocasts.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class P8Test {

    private TreeNode[] genSameTreeNodes() {
        TreeNode root = new TreeNode(1);
        TreeNode secondLeft = new TreeNode(2);
        TreeNode secondRight = new TreeNode(2);
        TreeNode thirdLeft = new TreeNode(3);
        TreeNode thirdRight = new TreeNode(4);
        root.left = secondLeft;
        root.right = secondRight;
        secondLeft.left = thirdLeft;
        secondLeft.right = thirdRight;
        secondRight.left = thirdRight;
        secondRight.right = thirdLeft;
        return new TreeNode[]{root, root};
    }

    private TreeNode[] genDifferentTreeNodes() {
        TreeNode root = new TreeNode(1);
        TreeNode secondLeft = new TreeNode(2);
        TreeNode secondRight = new TreeNode(2);
        TreeNode thirdLeft = new TreeNode(3);
        TreeNode thirdRight = new TreeNode(4);
        root.left = secondLeft;
        root.right = secondRight;
        secondLeft.left = thirdLeft;
        secondLeft.right = thirdRight;
        secondRight.left = thirdRight;
        secondRight.right = thirdLeft;
        return new TreeNode[]{root, secondLeft};
    }

    @Test
    public void testIsSameTreeNodeRecursive() {
        P8 p = new P8();
        TreeNode[] treeNodes = this.genSameTreeNodes();
        assertTrue(p.isSameTreeRecursive(treeNodes[0], treeNodes[1]));

        treeNodes = this.genDifferentTreeNodes();
        assertFalse(p.isSameTreeRecursive(treeNodes[0], treeNodes[1]));
    }

    @Test
    public void testIsSameTreeNodeIterative() {
        P8 p = new P8();
        TreeNode[] treeNodes = this.genSameTreeNodes();
        assertTrue(p.isSameTreeIterative(treeNodes[0], treeNodes[1]));

        treeNodes = this.genDifferentTreeNodes();
        assertFalse(p.isSameTreeIterative(treeNodes[0], treeNodes[1]));
    }

}