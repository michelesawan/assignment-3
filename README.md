# assignment-3
//description of RoomsDoublyLinkedList
package hw3; 

public class RoomsDoublyLinkedList {
    /**
     * Inner class
     */
    private class Node {
        private Room room;
        private Node previous;
        private Node next; 

        public Node() { 
            //initially, room previous and next are set to null
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
      //addFirst adds element at starting of the linked list
    public void addFirst(Room room) {
        //create a new node with a new head pointing to it
        Node newHead = new Node(room, null, head);
        //update head.previous , if head isn't nu
        if (head != null) {
            head.previous = newHead;
        }
        //update the head reference
        head = newHead;
       //update the list size
        sizeOfTheList ++; 

    } 

   //add a new node at rear
    public void addLast(Room room) { 

        if (isEmpty()) {
        //if list is empty,add Node to front
            addFirst(room);
        } else {
            //traverse the list until last Node
            Node position = head; 

            while (position.next != null) { //Note to check to .next
                position = position.next;
            }
         //here, the last Node is created 
        //create a new node with a link to the last node ( as previous)
         
            Node newNode = new Node(room, position, null);
            //update the next link
            position.next = newNode;
            //increment the size
            sizeOfTheList++;
        }
    }
    public void addBetween(Room roomToAdd,Room r1,Room r2) {
    Node position = head; 
        while (position.next != null) { 
            position = position.next;
        } 

        Node newNode = new Node(r1, position, position.next);
        position.next = newNode;
        sizeOfTheList++;
    }
    //removes the head of the list and set the new head to the next Node 
    public boolean removeFirst() {
        if (isEmpty()) {
            return false;
        } 

        if (sizeOfTheList() == 1) {
            head = null;
        } else {
         //here the list has more than 1 node
         //update the head to point to next node
            head = head.next;
           //update the new head's previous link to point to null
            if (head != null) //in case the new head is null
                head.previous = null;
        }
        //decrement the size
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

        if (sizeOfTheList() == 1) //remove the head
            return removeFirst();
        //traverse the list until the last node is reached
        Node position = head;
        while (position.next != null) {
            position = position.next;
        }
        //remove the link from previous to the next Node 
        tail.previous.next = null;
        tail.previous = null;
        tail = null; 

        sizeOfTheList--;
        return true;
    } 

   //return the number of nodes in the list 
    public int sizeOfTheList() {
        return sizeOfTheList;
    }
   //Traverse the list and prints its elements
    public String toString() {
        if (isEmpty())
            return "[ ]"; 

        String toReturn = "[ " + head.room; //the list is not empty, so head is not null 

        Node position = head.next; //go to next item
        while (position != null) {
            toReturn = String.format("%s | %s", toReturn, position.room);
            position = position.next;
        } 

        return toReturn + " ]";
    }}
