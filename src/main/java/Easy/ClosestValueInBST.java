package Easy;

public class ClosestValueInBST {

    public static void main(String[] args) {
        BST tree= new BST(10);
        tree.left=new BST(5);
        tree.left.left= new BST(2);
        tree.left.left.left= new BST(1);
        tree.left.right= new BST(5);
        tree.right= new BST(15);
        tree.right.left= new BST(13);
        tree.right.right=new BST(22);
        tree.right.right.right= new BST(14);
        System.out.println(findClosestValueInBst(tree,-1));

    }

    public static int findClosestValueInBst(BST tree, int target) {

        int close= closest(tree,target,tree.value);
        return close;

    }

    public static int closest(BST tree, int target, int close){
        if(tree.value==target)
            return tree.value;
        close=Math.abs(close - target) > Math.abs(tree.value-target)?tree.value : close;
        System.out.println("Value is "+close);

        if(target < tree.value && tree.left !=null)
            close= closest(tree.left,target,close);
        else if(target > tree.value && tree.right!=null)
            close = closest(tree.right,target,close);
        return close;

    }


    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
