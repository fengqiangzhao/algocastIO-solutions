package io.algocasts;

import io.algocasts.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class P4Test {


    private TreeNode genSymmetricTreeNode() {
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
        return root;
    }

    private TreeNode genAsymmetricTreeNode() {
        TreeNode root = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode thirdLeft = new TreeNode(3);
        TreeNode thirdRight = new TreeNode(4);
        TreeNode redundantTreeNode = new TreeNode(0);

        root.left = second;
        root.right = second;
        second.left = thirdLeft;
        second.right = thirdRight;
        thirdLeft.left = redundantTreeNode;
        return root;
    }

    @Test
    public void testIsSymmetricTreeRecursive() {
        P4 p = new P4();
        TreeNode symmetricTreeNode = this.genSymmetricTreeNode();
        TreeNode asymmetricTreeNode = this.genAsymmetricTreeNode();
        assertTrue(p.isSymmetricTreeRecursive(symmetricTreeNode));
        assertFalse(p.isSymmetricTreeRecursive(asymmetricTreeNode));
    }

    @Test
    public void testIsSymmetricTreeIterative() {
        P4 p = new P4();
        TreeNode symmetricTreeNode = this.genSymmetricTreeNode();
        TreeNode asymmetricTreeNode = this.genAsymmetricTreeNode();
        assertTrue(p.isSymmetricTreeIterative(symmetricTreeNode));
        assertFalse(p.isSymmetricTreeIterative(asymmetricTreeNode));
    }

}