import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        Deque deque = new Deque();

        int N = Integer.parseInt(br.readLine());

        for( int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push_back" :
                    deque.push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front" :
                    deque.push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "front" :
                    sb.append(deque.front()).append("\n");
                    break;
                case "back" :
                    sb.append(deque.back()).append("\n");
                    break;
                case "size" :
                    sb.append(deque.getSize()).append("\n");
                    break;
                case "empty" :
                    sb.append(deque.empty()).append("\n");
                    break;
                case "pop_front" :
                    sb.append(deque.popFront()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deque.popBack()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        br.close();
	}
    
    public static class Deque {

        private DoubleEndedQueueNode front;
        private DoubleEndedQueueNode rear;
        private int size;

        public Deque() {
            this.front = null;
            this.rear = null;
            this.size = 0;
        }

        public int empty(){
            if( front == null ){
                return 1;
            } else {
                return 0;
            }
        }

        public void push_front(int num){
            DoubleEndedQueueNode currentNode = new DoubleEndedQueueNode(num);
            if(empty() == 1){
                front = currentNode;
                rear = currentNode;
            } else {
                front.frontLink = currentNode;
                currentNode.rearLink = front;
                front = currentNode;
            }
            size++;
        }

        public void push_back(int num){
            DoubleEndedQueueNode currentNode = new DoubleEndedQueueNode(num);
            if( empty() == 1 ){
                front = currentNode;
                rear = currentNode;
            } else {
                rear.rearLink = currentNode;
                currentNode.frontLink = rear;
                rear = currentNode;
            }
            size++;
        }

        public int popFront(){
            if( empty() == 1 ){
                return -1;
            } else {
                int num = front.getData();
                if( size == 1 ){
                    front = null;
                    rear = null;
                } else {
                    front = front.rearLink;
                    front.frontLink = null;
                }
                size--;
                return num;
            }
        }

        public int popBack(){
            if( empty() == 1 ){
                return -1;
            } else {
                int num = rear.getData();
                if( size == 1 ){
                    front = null;
                    rear = null;
                } else {
                    rear = rear.frontLink;
                    rear.rearLink = null;
                }
                size--;
                return num;
            }
        }

        public int front(){
            if( empty() == 1 ){
                return -1;
            } else {
                return front.getData();
            }
        }

        public int back(){
            if( empty() == 1 ){
                return -1;
            } else {
                return rear.getData();
            }
        }

        public int getSize(){
            return this.size;
        }
    }

    public static class DoubleEndedQueueNode {
        private int data;
        public DoubleEndedQueueNode frontLink;
        public DoubleEndedQueueNode rearLink;

        public DoubleEndedQueueNode(int data) {
            this.data = data;
            this.frontLink = null;
            this.rearLink = null;
        }

        public int getData(){
            return this.data;
        }

    }
}