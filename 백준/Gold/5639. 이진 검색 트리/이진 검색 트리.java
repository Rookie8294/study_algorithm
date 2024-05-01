import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    
    static class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
            this.val = val;
        }
        
        public void insertNode(int n){
            if( n < val ){
                if( this.left == null ) this.left = new Node(n);
                else this.left.insertNode(n);
            } else {
                if( this.right == null ) this.right = new Node(n);
                else this.right.insertNode(n);
            }
        }
    }
    
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        Node root = new Node(Integer.parseInt(br.readLine()));
        
        while(true){
            String target = br.readLine();
            if( target == null ) break;
            
            root.insertNode(Integer.parseInt(target));
        }
        
        postOrder(root);
        System.out.print(sb);
	
    }

    static void postOrder(Node node){
        if( node == null ) return;
        postOrder(node.left);
        postOrder(node.right);
        sb.append(node.val).append("\n");
    }
}
