package hw3;

/**
 * Assignment 	#3
 * Question 	#2
 * 
 * @author 	Michelle_Sawan and Nancy_Rahal
 * ID 		201801993
 * 
 * Course	GIN231 Sect. #21705
*/


public class RoomsDoublyLinkedList {
    /**
     * Inner class
     */
    private class Node {
        private Room room;
        private Node previous;
        private Node next;

        public Node() {
            room = null;
            previous = null;
            next = null;
        }

        public Node(Room room, Node previous, Node next) {
            this.room = room;
            this.previous = previous;
            this.next = next;
        }

    } // End of the inner class
    
    private Node head;
    private Node tail;
    private int sizeOfTheList;

    /**
     * Default Constructor
     */
    public RoomsDoublyLinkedList() {
        head = null;
        tail = null;
        sizeOfTheList = 0;
    }
    /**
     * 
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    /**
     * takes one parameter and adds a new node at the front
     * 
     */
    public void addFirst(Room room) {
        Node newHead = new Node(room, null, head);
        if (head != null) {
            head.previous = newHead;
        }
        head = newHead;
        sizeOfTheList ++;

    }

  
    public void addLast(Room room) {

        if (isEmpty()) {
            addFirst(room);
        } else {
            Node position = head;

            while (position.next != null) { 
                position = position.next;
            }

         
            Node newNode = new Node(room, position, null);
            position.next = newNode;
            sizeOfTheList++;
        }
    }
    public void addBetween(Room roomToAdd, Room r1,Room r2) {
    	Node position = head; 
        while (position.next != null) { 
            position = position.next;
        }

        Node newNode = new Node(r1, position, position.next);
        position.next = newNode;
        sizeOfTheList++;
    }

    public boolean removeFirst() {
        if (isEmpty()) {
            return false;
        }

        if (sizeOfTheList() == 1) {
            head = null;
        } else {
            head = head.next;

            if (head != null) 
                head.previous = null;
        }

        sizeOfTheList--;
        return true;
    }

    /**
     * Removes the last element in the list
     * 
     * @return
     */
    public boolean removeLast() {
        if (isEmpty())
            return false;

        if (sizeOfTheList() == 1) 
            return removeFirst();

        Node position = head;
        while (position.next != null) {
            position = position.next;
        }

        tail.previous.next = null;
        tail.previous = null;
        tail = null;

        sizeOfTheList--;
        return true;
    }

   
    public int sizeOfTheList() {
        return sizeOfTheList;
    }

    public String toString() {
        if (isEmpty())
            return "[ ]";

        String toReturn = "[ " + head.room; 

        Node position = head.next; 
        while (position != null) {
            toReturn = String.format("%s | %s", toReturn, position.room);
            position = position.next;
        }

        return toReturn + " ]";
    }}