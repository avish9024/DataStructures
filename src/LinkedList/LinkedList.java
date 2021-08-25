package LinkedList;

import java.util.HashSet;
import java.util.List;

public class LinkedList {
    Node head;
    int size;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node reverseList() {
        Node prev = null, curr = head, next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public Node insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size = 1;
            return head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
        }
        return head;
    }

    public Node insertSorted(int data) {
        Node newNode = new Node(data);
        Node current = head;
        Node previous = null;
        while(current != null && data > current.data){
            previous = current;
            current = current.next;
        }
        if(previous == null){
            head = newNode;
        }else{
            previous.next = newNode;
        }
        newNode.next = current;
        size++;
        return head;
    }

    public int getDecimalValue() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int num = head.data;
        while (head.next != null) {
            num = num * 2 + head.next.data;
            head = head.next;
        }
        return num;
    }

    public void printList() {
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getMiddle() {
        if (head == null) {
            System.out.println("List is Empty");
            return -1;
        }
        Node temp1 = head, temp2 = head;
        while (temp2 != null && temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        return temp1.data;
    }

    public boolean deleteNode(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }
        Node prev = null, curr = head;
        while (curr.data != data) {
            prev = curr;
            curr = curr.next;
        }
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = curr.next;
        }
        return true;
    }

    public boolean deleteNodeAtIndex(int pos) {
        if (head == null) return false;
        if (pos == 0) {
            head = head.next;
            return true;
        }
        int curr = 0;
        Node temp = head, prev = null;
        while (curr != pos) {
            if (temp == null || temp.next == null) return false;
            prev = temp;
            temp = temp.next;
            curr++;
        }
        prev.next = temp.next;
        return true;
    }

    public void deleteDuplicates() {
        Node curr = head;
        HashSet<Integer> h = new HashSet<>();
        while(curr != null) {
            h.add(curr.data);
            if (curr.next == null) {
                break;
            }
            if (h.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }
}
