package com.exercise.linkedlist;

public class SinglyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    protected long size;

    public SinglyLinkedList() {
        super();
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(E data) {
        if (data == null) {
            throw new NullPointerException("cannot add null data");
        }
        if (!isEmpty()) { //adding subsequent nodes
            Node<E> current = this.tail;
            this.tail = new Node<>(data, null);
            current.next = this.tail;

        } else { //adding first node
            this.tail = new Node(data, null);
            this.head = this.tail;
        }
        size++;
    }

    public boolean remove(E data) {
        if (isEmpty()) {
            throw new IllegalStateException("cannot remove from an empty list");
        }
        boolean hasRemoved = false;

        //set both pointers to head to start with
        Node<E> prev = this.head;
        Node<E> curr = this.head;

        //loop until the last node is reached or data is found
        while (curr.next != null || curr == this.tail) {
            //data is found
            if (curr.data.equals(data)) {

                //remove last remaining node
                if (size == 1) {
                    this.head = null;
                    this.tail = null;
                }
                //remove the first node. i.e. found data in head
                else if (curr.equals(this.head)) {
                    this.head = this.head.next;
                }
                //remove the last node. i.e. found data in tail
                else if (curr.equals(this.tail)) {
                    this.tail = prev;
                    this.tail.next = null;
                }
                //remove the node in middle
                else {
                    prev.next = curr.next;
                }
                size--;
                hasRemoved = true;
                break;
            }

            //move to next node
            prev = curr;
            curr = prev.next;

        }
        return hasRemoved;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public long getSize() {
        return size;
    }

    private static void printMiddleNodeInSinglePass(SinglyLinkedList<Integer> linkedList) {
        Node<Integer> current = linkedList.getHead();
        int length = 0;
        Node<Integer> middle = linkedList.getHead();

        //loop until last element is reached
        while (current.getNext() != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.getNext();
            }
            current = current.getNext();
        }

        if (length % 2 == 1) {
            middle = middle.getNext();
        }

        System.out.println("length of SinglyLinkedList: " + (length + 1));
        System.out.println("middle element of SinglyLinkedList : " + middle);

    }

    @Override
    public String toString() {
        return "\nhead --> " + head + "\ntail --> " + tail + "\nsize --> " + size;
    }


    public static void main(String[] args) {
        SinglyLinkedList<String> stringSinglyLinkedList = new SinglyLinkedList<>();
        stringSinglyLinkedList.add("Mahady");
        stringSinglyLinkedList.add("Mumin");
        stringSinglyLinkedList.add("Shaheen");
        System.out.println(stringSinglyLinkedList);
        System.out.println();
        System.out.println("Testing Remove...");
        stringSinglyLinkedList.remove("Mumin");
        System.out.println(stringSinglyLinkedList);

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        printMiddleNodeInSinglePass(linkedList);

    }


}
