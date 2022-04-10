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

import java.util.LinkedList;

public class Driver {
    public static void main(String[] args) {
      
        System.out.println("Room:");
        LinkedList List = new LinkedList();
        List.addFirst("Room 001"); // this is the head
        List.addLast("Room 506"); //this is the tail
     
       

        System.out.printf("List has %d item(s) %n", List.size());
       
        
        System.out.println("removing List head...");
        List.removeFirst();
        System.out.println("removing List tail...");
        List.removeLast();
       
        System.out.printf("List has now %d item(s) %n", List.size());
       
        System.out.println("***\n");

        System.out.println(List.toString());

}
    }