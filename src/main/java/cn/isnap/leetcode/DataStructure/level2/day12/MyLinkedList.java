package cn.isnap.leetcode.DataStructure.level2.day12;

public class MyLinkedList {
    static class Node {
        int val;
        Node next = null;
        public Node(int val){
            this.val = val;
        }
        public Node(){}
    }

    Node tail = null;
    Node head = null;
    int length = 0;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Node();
        tail = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node node = head.next;
        if (index == length - 1) return tail.val;
        if (index >= length) return -1;
        for (int i = 0; i < index; ++i) node = node.next;
        return node.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
        if (length == 0) tail = node;
        length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = tail.next;
        length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == length) addAtTail(val);
        else if (index == 0) addAtHead(val);
        else if (index > length) {
        }
        else {
            Node node = new Node(val);
            Node pre = head;
            for (int i = 0; i < index; ++i) pre = pre.next;
            node.next = pre.next;
            pre.next = node;
            length++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= length) return;
        Node pre = head;
        for (int i = 0; i < index; ++i) pre = pre.next;
        if (pre.next == tail) {
            pre.next = null;
            tail = pre;
        } else pre.next = pre.next.next;
        length--;
    }
}
