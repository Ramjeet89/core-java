package com.java.doublylinkedlist;

public class SearchList {

    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    //addNode(

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    //searchNode() will search a given node in the list
    public void searchNode(int value) {
        int i = 1;
        boolean flag = false;
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            if (current.data == value) {
                flag = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (flag)
            System.out.println("Node is present in the list at the position::" + i);
        else
            System.out.println("Node is note present in the list");
    }

    public static void main(String[] args) {
        SearchList list = new SearchList();
        list.addNode(1);
        list.addNode(5);
        list.addNode(4);
        list.addNode(3);
        list.addNode(2);

        list.searchNode(4);
        list.searchNode(9);
    }
}
