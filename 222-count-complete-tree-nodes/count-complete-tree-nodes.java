class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int a = leftHeight(root);
        int b = rightHeight(root);
        if (a == b) {
            return (1 << a) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int leftHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    public int rightHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}
