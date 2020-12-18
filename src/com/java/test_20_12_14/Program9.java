package com.java.test_20_12_14;

public class Program9 {
    public static void main(String[] args){
        Integer[] arr = {1,2,2,3,3,null,null,4,4};
        Node root = buildTree(arr);
        System.out.println(isTree(root));

    }
    private static boolean isTree(Node root){
        if (root == null){
            return true;
        }

        if (Math.abs(deptTree(root.left) - deptTree(root.rigth)) >= 2){
            return false;
        }
        return isTree(root.left) && isTree(root.rigth);
    }
    private static int deptTree(Node root){
        if (root == null){
            return 0;
        }
        return Math.max(deptTree(root.left), deptTree(root.rigth)) + 1;
    }

    private static Node buildTree(Integer[] arr){
        if (arr.length == 0){
            return null;
        }
        Node root = new Node(arr[0]);
        Node p = root;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != null){
                p.left = new Node(arr[i]);
            }else {
                p.left = null;
            }
            i++;
            if (i < arr.length && arr[i] != null){
                p.rigth = new Node(arr[i]);
            }else {
                p.rigth = null;
            }
        }
        return root;
    }
}

class Node{
    int val;
    Node left;
    Node rigth;
    Node(Integer val){
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", left=" + left +
                ", rigth=" + rigth +
                '}';
    }
}
