import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static Node head = new Node('A', null, null);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            String[] arr = br.readLine().split(" ");
            char root = arr[0].charAt(0);
            char left = arr[1].charAt(0);
            char right = arr[2].charAt(0);

            insertNode(head, root, left, right);
        }

        preOrder(head);
        sb.append("\n");
        inOrder(head);
        sb.append("\n");
        postOrder(head);

        System.out.print(sb);
    }

    static void insertNode(Node node, char root, char left, char right){

        if( node.val == root){
            node.left = left == '.' ? null : new Node(left, null, null);
            node.right = right == '.' ? null : new Node(right, null, null);
        } else {
            if( node.left != null ) insertNode(node.left, root, left, right);
            if( node.right != null ) insertNode(node.right, root, left, right);
        }

    }

    static class Node{
        char val;
        Node left;
        Node right;

        public Node(char val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static void preOrder(Node node){
        if( node == null ) return;
        sb.append(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(Node node){
        if( node == null ) return;
        inOrder(node.left);
        sb.append(node.val);
        inOrder(node.right);
    }

    static void postOrder(Node node) {
        if(node == null ) return;
        postOrder(node.left);
        postOrder(node.right);
        sb.append(node.val);
    }
	

}
