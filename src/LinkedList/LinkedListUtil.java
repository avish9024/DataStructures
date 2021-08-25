package LinkedList;

import java.util.Stack;

public class LinkedListUtil {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node getIntersection(Node l1, Node l2){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            s1.push(l2);
            l2 = l2.next;
        }
        while (s1.peek().data != s2.peek().data) {
            s1.pop();
            s2.pop();
        }
        return s1.pop();
    }
}
